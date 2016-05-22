/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.MeasurementRequest.DayOfTheWeek;
import Model.MeasurementRequest.MeasurementPeriod;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.List;

/**
 *
 * @author Principal
 */
public class MeasurementPeriodDAO {

    public void insertMeasurementPeriod(List<MeasurementPeriod> measurementPeriod, int key, Connection conn) {
        String sql;
        String sql2;
        String sql3;
        try {

            sql = "Insert into starttime(startTime,  measurementRequest_id) VALUES (?,?)";
            sql2 = "Insert into endtime(endTime, measurementrequest_id) VALUES (?,?)";
            sql3 = "Insert into dias(dayoftheweek, measurementRequest_id) VALUES (?,?)";
            PreparedStatement st = conn.prepareStatement(sql);
            PreparedStatement st2 = conn.prepareStatement(sql2);
            PreparedStatement st3 = conn.prepareStatement(sql3);
           
            for (MeasurementPeriod mp : measurementPeriod) {
                for (Time t : mp.getStartTime()) {
                    st.setTime(1, t);
                    st.setInt(2, key);
                    st.executeUpdate();
                }
                for(Time t : mp.getEndTime() ){
                    st2.setTime(1, t);
                    st2.setInt(2, key);
                    st2.executeUpdate();
                }
                
                for(DayOfTheWeek d : mp.getDayOfTheWeek()){
                    st3.setInt(1, d.getCode());
                    st3.setInt(2, key);
                    st3.executeUpdate();
                }
                
            }
            
            
        } catch (SQLException e) {

        }
    }

}
