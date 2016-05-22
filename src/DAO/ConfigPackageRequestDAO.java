/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.AMFConfigPackage.AMFConfigPackage;
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
public class ConfigPackageRequestDAO {

    public int insertConfigPkg(ConfigPackageRequest config) {
        Connection conn = MySQLConnection.getConexaoMySQL();
        String sql;
        try {
            Statement s = conn.createStatement();

            sql = "Insert into configurationpackagerequest(terminalDeviceID, terminalDeviceType, serviceProviderIdentifier, subscriberID) VALUES (?,?,?,?)";

            PreparedStatement st = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            st.setString(1, config.getTerminalDeviceID());
            st.setString(2, config.getTerminalDeviceType());
            st.setString(3, config.getServiceProviderIdentifier());
            st.setInt(4, config.getSubscriberID());
            st.executeUpdate();
            ResultSet rs = st.getGeneratedKeys();
            AMFCapabilityProfile amf = config.getAmf();
            if (rs.next()) {
                if (new AMFCapabProfileDAO().insertAMFCapab(amf, rs.getInt(1), conn)) {
                    int chave = rs.getInt(1);
                    conn.close();
                   return chave;
                } else {
                    return -1;
                }
            } else {
                return -1;
            }

        } catch (SQLException ex) {

            Logger.getLogger(ConfigPackageRequestDAO.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }

    }
}
