/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.AMReportPackage.AMReportPackage;
import Model.AMReportPackage.MeasurementReport;
import Model.tdElementsXML.AMFCapabilityProfile;
import Model.tdElementsXML.ConfigPackageRequest;
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
public class AMReportPackageDAO {

    public boolean insertAMReportPckg(AMReportPackage amrpckg) {
        Connection conn = MySQLConnection.getConexaoMySQL();
        String sql;
        try {

            sql = "Insert into amreportpackage(subscriberID, terminalDeviceID) VALUES (?,?)";

            PreparedStatement st = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            st.setString(1, amrpckg.getSubescriberID());
            st.setString(2, amrpckg.getTerminalDeviceID());
            st.executeUpdate();
            ResultSet rs = st.getGeneratedKeys();

            if (rs.next()) {
                if (new MeasurementReportDAO().insertMeasurementReports(amrpckg.getMeasurementReports(), rs.getInt(1), conn) && new StorageCongestionImpactedServiceDAO().insertStorageCongestion(amrpckg.getStorageCongestionImpactedService(), rs.getInt(1), conn)) {
                    conn.close();

                } else {
                    return false;
                }
            } else {
                return false;
            }

        } catch (SQLException ex) {

            Logger.getLogger(ConfigPackageRequestDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
}
