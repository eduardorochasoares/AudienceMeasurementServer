/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.AMReportPackage.VideoResize;
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
public class VideoResizeDAO {

    boolean insertVideoResize(VideoResize videoResize, int key, Connection conn) {
        String sql;
        try {
            Statement s = conn.createStatement();

            sql = "Insert into videoresize(imagewidth, imageheight,serviceInstanceID, measurementReport_id) VALUES (?,?, ?, ?)";

            PreparedStatement st = conn.prepareStatement(sql);
            st.setInt(1, videoResize.getImageWidth());
            st.setInt(2, videoResize.getImageHeight());
            st.setInt(3, videoResize.getServiceInstanceID());
            st.setInt(4, key);
            st.executeUpdate();

        } catch (SQLException ex) {

            Logger.getLogger(ConfigPackageRequestDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

}
