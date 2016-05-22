/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.MeasurementRequest.SampleSetIdentifierTimeTrigger;
import Model.MeasurementRequest.SampleSetTimeTrigger;
import Model.MeasurementRequest.TimeTrigger;
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Principal
 */
public class SampleSetIdentifierDAO {

    public void insertSampleSetIdentifier(TimeTrigger timeTrigger, int key, Connection conn) {
        String sql;
        try {

            sql = "Insert into samplesetidentifier(samplesetIdentifier, measurementRequest_id) VALUES (?,?)";

            PreparedStatement st = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            for (SampleSetTimeTrigger s : timeTrigger.getSampleSet()) {
                st.setString(1, s.getSampleSetIdentifier());
                st.setInt(2, key);
                st.executeUpdate();

            }

        } catch (SQLException e) {

        }
    }

}
