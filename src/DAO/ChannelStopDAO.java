/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.AMReportPackage.ChannelStop;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Principal
 */
public class ChannelStopDAO {

    boolean insertChannelStop(ChannelStop channelStop, int key, Connection conn) {
        String sql;
        try {
            Statement s = conn.createStatement();

            sql = "Insert into channelstop(controlDevice, stopNavMethod, serviceInstanceID, measurementReport_id) VALUES (?,?,?,?)";

            PreparedStatement st = conn.prepareStatement(sql);

            st.setString(1, channelStop.getControlDevice());
            st.setString(2, channelStop.getStopNavMethod());
            st.setInt(3, channelStop.getServiceInstanceID());
            st.setInt(4, key);

            st.executeUpdate();

        } catch (SQLException ex) {

            Logger.getLogger(ConfigPackageRequestDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

}
