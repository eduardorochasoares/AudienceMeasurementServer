/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.MeasurementRequest.ImmediatePush;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Principal
 */
public class ImmediatePushDAO {

    public void insertImmeadiatePush(ImmediatePush immediatePush, int key, Connection conn) {
        String sql;
        try {
            

            sql = "Insert into immeadiatepush(measReportnumbnypush,  maxTimeBetweenDelivery, measurementRequest_id) VALUES (?,?,?)";

            PreparedStatement st = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            st.setInt(1, immediatePush.getMeasurementReportNumberByPush());
            st.setInt(2, immediatePush.getMaxTimeBetweenDelivery());
            st.setInt(3, key);

            st.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

    }
}
