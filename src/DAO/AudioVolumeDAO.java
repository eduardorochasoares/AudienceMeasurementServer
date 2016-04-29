/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.AMReportPackage.AudioVolume;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Principal
 */
public class AudioVolumeDAO {

    boolean insertAudioVolume(AudioVolume audioVolume, int key, Connection conn) {
        String sql;
        try {
            Statement s = conn.createStatement();

            sql = "Insert into audiovolume(volumeDirection, serviceInstanceID, measurementReport_id) VALUES (?,?,?)";

            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, audioVolume.getVolumeDirection());
            st.setInt(2, audioVolume.getServiceInstanceID());
            st.setInt(3, key);
            st.executeUpdate();

        } catch (SQLException ex) {

            Logger.getLogger(ConfigPackageRequestDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

}
