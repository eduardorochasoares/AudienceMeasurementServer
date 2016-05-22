/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Principal
 */
public class DeliveryAddressDAO {

    void insertDeliveryAddress(List<String> deliveryAddres, int key, Connection conn) {
        String sql;
        try {

            sql = "Insert into deliveryAddress(deliveryAddress,  measurementRequest_id) VALUES (?,?)";

            PreparedStatement st = conn.prepareStatement(sql);
            for (String s : deliveryAddres) {
                st.setString(1,s);
                st.setInt(2, key);
                st.executeUpdate();
            }

            
        } catch (SQLException e) {

        }
    }

}
