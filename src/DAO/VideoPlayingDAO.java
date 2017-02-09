/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.AMReportPackage.ChannelPlaying;
import Model.AMReportPackage.VideoPlaying;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eduardo
 */
public class VideoPlayingDAO {
    boolean insertVideoPlaying(ArrayList<VideoPlaying> videoPlaying, int key, Connection conn) {
        String sql;
        try {
            Statement s = conn.createStatement();

            sql = "Insert into videoPlaying(serviceIdentifier, serviceInstanceID, id_measurement_report) VALUES (?,?,?)";

            PreparedStatement st = conn.prepareStatement(sql);
            for (VideoPlaying vp : videoPlaying) {
                st.setString(1, vp.getServiceIdentifier());
                st.setInt(2, vp.getServiceInstanceID());
                st.setInt(3,key);
                st.executeUpdate();
            }

        } catch (SQLException ex) {

            Logger.getLogger(ConfigPackageRequestDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
}
