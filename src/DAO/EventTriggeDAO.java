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
public class EventTriggeDAO {

    public boolean insertEventTrigger(ArrayList<String> event, int key, Connection conn) {

        String sql;

        try {
            Statement s = conn.createStatement();
            sql = "Insert into eventtrigger(AMFCapabilityProfile_id, event) VALUES (?,?)";

            PreparedStatement st = conn.prepareStatement(sql);
            for (String c : event) {
                st.setInt(1, key);
                st.setString(2, c);
                st.executeUpdate();
            }

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(EventTriggeDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
