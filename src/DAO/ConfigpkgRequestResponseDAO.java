 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.AMFConfigPackage.AMFConfigPackage;
import Model.ConfigPackageRequestResponse.Code;
import Model.ConfigPackageRequestResponse.ConfigPackageRequestResponse;
import Model.tdElementsXML.ConfigPackageRequest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Principal
 */
public class ConfigpkgRequestResponseDAO {

    public ConfigPackageRequestResponse insertConfigpkgRequestResponse(ConfigPackageRequestResponse config, int key) {
        Connection conn = MySQLConnection.getConexaoMySQL();
        String sql;
        try {

            Statement s = conn.createStatement();

            sql = "Insert into configpckgrequestresponse(configPckgCheckDelay, id_configrequest) VALUES (?,?)";

            PreparedStatement st = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            st.setInt(1, config.getConfigurationPackageCheckDelay());
            st.setInt(2, key);
            st.executeUpdate();
            try (ResultSet rs = st.getGeneratedKeys()) {
                if (rs.next()) {
                    if (config.getImmediateMeasurementDirective() != null) {
                        
                        AMFConfigPackage amf = new AMFConfigPckgDAO().insertAMF(conn, false, config.getImmediateMeasurementDirective().getaMFConfigPackage(), rs.getInt(1), key);
                        config.getImmediateMeasurementDirective().setaMFConfigPackage(amf);
                        if(config.getImmediateMeasurementDirective().getaMFConfigPackage() == null){
                            config.getImmediateMeasurementDirective().setCode(Code.NoAmRequired);
                        }
                    }
                    if (config.getFutureMeasurementDirective() != null) {
                        config.getFutureMeasurementDirective().setaMFConfigPackage(new AMFConfigPckgDAO().insertAMF(conn, true, config.getFutureMeasurementDirective().getaMFConfigPackage(), rs.getInt(1), key));
                        if(config.getFutureMeasurementDirective().getaMFConfigPackage() == null){
                            config.getFutureMeasurementDirective().setCode(Code.NoAmRequired);
                        }
                    }
                }
            }
            conn.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        return config;
    }
}
