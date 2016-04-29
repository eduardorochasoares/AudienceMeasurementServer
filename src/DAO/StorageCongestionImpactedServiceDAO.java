/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.AMReportPackage.MeasurementReport;
import Model.AMReportPackage.StorageCongestionImpactedService;
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
public class StorageCongestionImpactedServiceDAO {

    boolean insertStorageCongestion(ArrayList<StorageCongestionImpactedService> storageCongestion, int key, Connection conn) {
        String sql;
        
        try {
            Statement s = conn.createStatement();

            sql = "Insert into storagecongestionimpactedservice(serviceInstanceID, serviceStopDropped, amReportPackage_id) VALUES (?, ?,?)";

            PreparedStatement st = conn.prepareStatement(sql);
            for (StorageCongestionImpactedService sc : storageCongestion) {
                st.setInt(1, sc.getServiceInstaceID());
                st.setBoolean(2, sc.isServiceStopDropped());
                st.setInt(3, key);
                st.executeUpdate();
               

            }
        } catch (SQLException ex) {

            Logger.getLogger(ConfigPackageRequestDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;

    }
}


