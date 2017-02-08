/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.AMReportPackage.VideoResize;
import Model.AMReportPackage.VoDEvents;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eduardo
 */
public class VoDEventsDAO {
       boolean insertVoDEvents(VoDEvents vod, int key, Connection conn) {
        String sql;
        try {
            Statement s = conn.createStatement();

            sql = "Insert into vodEvent(event,serviceInstanceID, serviceIdentifier,id_measurement_report) VALUES (?,?, ?, ?)";

            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, vod.getEvent());
            st.setInt(2, vod.getServiceInstanceID());
            st.setString(3, vod.getServiceIdentifier());
            st.setInt(4, key);
            st.executeUpdate();

        } catch (SQLException ex) {

            Logger.getLogger(ConfigPackageRequestDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
}
