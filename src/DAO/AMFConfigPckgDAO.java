/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.AMFConfigPackage.AMFConfigPackage;
import Model.AMFConfigPackage.MeasurementRequestSet;
import Model.MeasurementRequest.MeasurementRequest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author Principal
 */
public class AMFConfigPckgDAO {

    public AMFConfigPackage insertAMF(Connection conn, boolean b, AMFConfigPackage amfConfigPackage, int key, int configRequestKey) {
        String sql;
       
        try {

            sql = "Insert into amfconfigpckg(effectiveDate,  future, configpckgrequestresponse_id) VALUES (?,?,?)";

            PreparedStatement st = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            st.setTimestamp(1, amfConfigPackage.getEffectivityDateAndTime());
            st.setBoolean(2, b);
            st.setInt(3, key);

            st.executeUpdate();
            ResultSet rs = st.getGeneratedKeys();
            if (rs.next()) {
                amfConfigPackage.setPackageID(rs.getInt(1));
                amfConfigPackage.setPackageVersion(1);
                for (MeasurementRequestSet mrs : amfConfigPackage.getMeasurementRequestSets()) {
                    mrs.setMeasurementRequest(new MeasurementRequestDAO().insertMeasurementRequest(mrs.getMeasurementRequest(), rs.getInt(1), conn, configRequestKey));
                    if(mrs.getMeasurementRequest() == null) return null;
                }
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return amfConfigPackage;
    }

}
