/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.AMReportPackage.ChannelPlaying;
import Model.AMReportPackage.ChannelStart;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Principal
 */
public class ChannelStartDAO {

    boolean insertChannelStart(ChannelStart channelStart, int key, Connection conn) {
        String sql;
        try {
            Statement s = conn.createStatement();

            sql = "Insert into channelstart(controlDevice, startNavMethod, previousServiceInstanceID, serviceIdentifier, viewMode, obscuration, serviceInstanceID, measurementReport_id) VALUES (?,?,?,?,?,?,?,?)";

            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, channelStart.getControlDevice());
            st.setString(2, channelStart.getStartNavMethod());
            st.setInt(3, channelStart.getPreviousServiceInstanceID());
            st.setString(4, channelStart.getServiceIdentifier());
            st.setString(5, channelStart.getViewMode());
            st.setString(6, channelStart.getObscuration());
            st.setInt(7, channelStart.getServiceInstanceID());
            st.setInt(8, key);
            
            st.executeUpdate();

        } catch (SQLException ex) {

            Logger.getLogger(ConfigPackageRequestDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
}
