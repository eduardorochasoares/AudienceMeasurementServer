/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

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
public class ConfigurationModeDAO {

    public boolean insertConfigMode(ArrayList<String> confiMode, int key, Connection conn) {
       
        String sql;

        try {
            Statement s = conn.createStatement();
            sql = "Insert into configurationmode(AMFCapabilityProfile_id, configurationMode) VALUES (?,?)";

            PreparedStatement st = conn.prepareStatement(sql);
            for (String c : confiMode) {
                st.setInt(1, key);
                st.setString(2, c);
                st.executeUpdate();
            }

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ConfigurationModeDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
}
