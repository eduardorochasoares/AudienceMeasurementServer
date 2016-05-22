/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.MeasurementRequest.ChannelList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Principal
 */
public class ChannelListDAO {

    void insertChannelList(ChannelList channelList, int key, Connection conn) {
        String sql;
        try {

            sql = "Insert into channellist(serviceIdentifier,  id_tvLinear) VALUES (?,?)";

            PreparedStatement st = conn.prepareStatement(sql);
            for (String s : channelList.getServiceIdentifier()) {
                st.setString(1, s);

                st.setInt(2, key);

                st.executeUpdate();
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

}
