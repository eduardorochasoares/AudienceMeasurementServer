/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.tdElementsXML.AMFCapabilityProfile;
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
public class AMFCapabProfileDAO {

    public boolean insertAMFCapab(AMFCapabilityProfile amf, int key, Connection conn) {
       
        String sql;
        try {
            Statement s = conn.createStatement();

            sql = "Insert into amfcapabilityprofile(ConfigurationPackageRequest_id) VALUES (?)";

            PreparedStatement st = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            st.setInt(1, key);

            st.executeUpdate();
            ResultSet rs = st.getGeneratedKeys();

            if (rs.next()) {
                int chave = rs.getInt(1);
                return new CompressionDAO().insertCompression(amf.getCompression(), chave, conn)
                        && new ConfigurationModeDAO().insertConfigMode(amf.getConfigurationPackageDelivery().getConfigurationMode(), chave, conn)
                        && new CryptographicProtocolDAO().insertCryptographicProtocol(amf.getSecurityCapabilities().getCryptographicProtocol(), key, conn)
                        && new DeliveryModeDAO().insertDeliveryMode(amf.getReportDeliveryModes().getDeliveryMode(), key, conn)
                        && new EventTriggeDAO().insertEventTrigger(amf.getMeasurementTriggerMethod().getEventTrigger(), key, conn)
                        && new OperationalManagementDAO().insertOperationalManagement(amf.getOperationalManagementCapabilities().getOperationalManagement(), chave, conn)
                        && new PermissionModeDAO().insertPermissionMode(amf.getPermissionOperationModes().getPermissionMode(), chave, conn)
                        && new ServiceStartTriggerDAO().insertServiceStartTrigger(amf.getMeasurementTriggerMethod().getServiceStartTrigger(), chave, conn)
                        && new TimeSampleTriggerDAO().insertTimeSampleTrigger(amf.getMeasurementTriggerMethod().getTimeSampleTrigger(), chave, conn)
                        && new TransportProtocolModeDAO().insertTransportProtocol(amf.getTransportCapabilitiesList().getTransportProtocolMode(), chave, conn);

            } else {
                return false;
            }

        } catch (SQLException ex) {

            Logger.getLogger(ConfigPackageRequestDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
}
