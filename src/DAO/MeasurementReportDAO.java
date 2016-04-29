/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.AMReportPackage.MeasurementReport;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Principal
 */
public class MeasurementReportDAO {

    public boolean insertMeasurementReports(ArrayList<MeasurementReport> mrs, int key, Connection conn) {
        String sql;
        try {
            Statement s = conn.createStatement();

            sql = "Insert into measurementreport(measurementRequestID, measurementReportTime, amReportPackage_id) VALUES (?,?,?)";

            PreparedStatement st = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            for (MeasurementReport mr : mrs) {
                st.setInt(1, mr.getMeasurementRequestID());
                st.setTimestamp(2, mr.getMeasurementReportTriggerTime());
                st.setInt(3, key);
                st.executeUpdate();
                ResultSet rs = st.getGeneratedKeys();

                if (rs.next()) {
                    if (mr.getAudioVolume() != null) {
                        AudioVolumeDAO audioVolumeDAO = new AudioVolumeDAO();
                        if (!audioVolumeDAO.insertAudioVolume(mr.getAudioVolume(), rs.getInt(1), conn)) {
                            return false;
                        }
                    }

                    if (mr.getVideoResize() != null) {
                        VideoResizeDAO vdao =  new VideoResizeDAO();
                        if(!vdao.insertVideoResize(mr.getVideoResize(), rs.getInt(1), conn)){
                            return false;
                        }
                    }
                    
                    if(!new ChannelPlayingDAO().insertChannelPlaying(mr.getChannelPlaying(), rs.getInt(1), conn)){
                        return false;
                    }
                    
                    if(mr.getChannelStart() != null){
                        ChannelStartDAO csDao = new ChannelStartDAO();
                        if(!csDao.insertChannelStart(mr.getChannelStart(), key, conn)){
                            return false;
                        }
                    }
                    
                    if(mr.getChannelStop()!=null){
                        ChannelStopDAO cstopDao = new ChannelStopDAO();
                        if(!cstopDao.insertChannelStop(mr.getChannelStop(), rs.getInt(1), conn)){
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
        } catch (SQLException ex) {

            Logger.getLogger(ConfigPackageRequestDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;

    }
}
