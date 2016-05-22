/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.MeasurementRequest.Event;
import Model.MeasurementRequest.EventTrigger;
import Model.MeasurementRequest.MeasurementRequest;
import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Principal
 */
public class MeasurementRequestDAO {

    List<MeasurementRequest> insertMeasurementRequest(List<MeasurementRequest> measurementRequest, int key, Connection conn, int configRequestKey) {
        try {
            List<MeasurementRequest> list = new ArrayList<>();
            ResultSet rs;
            Statement s = conn.createStatement();
            String sql = "Insert into measurementrequest(retransmitnumber,  storageCongestionPolicy, periodicity,nothingnewtoreport, amfConfigPckg_id) VALUES (?,?,?,?,?)";
            PreparedStatement st = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            for (MeasurementRequest mr : measurementRequest) {
                st.setInt(1, mr.getMeasurementDeliverySchedule().getRetransmitNumber());
                if (mr.getMeasurementDeliverySchedule() != null) {
                    if (mr.getMeasurementDeliverySchedule().getStorageCongestionPolicy() != null) {
                        st.setInt(2, mr.getMeasurementDeliverySchedule().getStorageCongestionPolicy().getCode());
                    } else {
                        st.setInt(2, 0);
                    }
                }else{
                    System.out.println("Faltando Element Measurement Delivery Schedule");
                    return null;
                }
                if (mr.getMeasurementSchedule() != null) {
                    st.setInt(3, mr.getMeasurementSchedule().get(0).getTimeTrigger().getPeriodicity());
                    st.setInt(4, mr.getMeasurementSchedule().get(0).getTimeTrigger().getNothingNewReportMode().getCode());
                }
                st.setInt(5, key);
                st.executeUpdate();
                rs = st.getGeneratedKeys();
                if (rs.next()) {
                    mr.setMeasurementRequestID(rs.getInt(1));
                    if (mr.getMeasurementDeliverySchedule() != null) {
                        if (mr.getMeasurementDeliverySchedule().getImeImmediatePush() != null) {
                            new ImmediatePushDAO().insertImmeadiatePush(mr.getMeasurementDeliverySchedule().getImeImmediatePush(), rs.getInt(1), conn);
                        }

                        new DeliveryAddressDAO().insertDeliveryAddress(mr.getMeasurementDeliverySchedule().getDeliveryAddres(), rs.getInt(1), conn);
                    }
                    if (mr.getMeasurementSchedule().get(0) != null) {
                        if (mr.getMeasurementSchedule().get(0).getTimeTrigger() != null) {
                            new SampleSetIdentifierDAO().insertSampleSetIdentifier(mr.getMeasurementSchedule().get(0).getTimeTrigger(), rs.getInt(1), conn);
                        }
                        if (mr.getMeasurementSchedule().get(0).getMeasurementPeriod() != null) {
                            new MeasurementPeriodDAO().insertMeasurementPeriod(mr.getMeasurementSchedule().get(0).getMeasurementPeriod(), rs.getInt(1), conn);

                        }

                        List<String> events = new EventTriggeDAO().selectLastEventTriggerByConfigId(configRequestKey, conn);
                        List<Event> event = new ArrayList<>();
                        for (String c : events) {
                            Event ev = new Event();
                            ev.setEvent(c);
                            event.add(ev);
                        }
                        mr.getMeasurementSchedule().get(0).getEventTrigger().get(0).setEvent(event);

                    }

                    if (mr.getLinearTVQualifier() != null) {
                        new LinearTVQualifierDAO().insertLinearQualifier(mr.getLinearTVQualifier(), rs.getInt(1), conn);
                    }

                }
                list.add(mr);
            }
            return list;
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            return null;
        }

    }

}
