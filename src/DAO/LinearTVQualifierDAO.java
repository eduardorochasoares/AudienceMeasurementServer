/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.MeasurementRequest.LinearTVQualifier;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Principal
 */
public class LinearTVQualifierDAO {

    void insertLinearQualifier(LinearTVQualifier linearTVQualifier, int key, Connection conn) {
        String sql;
        try {
            
            sql = "Insert into lineartvqualififer(id_measurementRequest ,navmethod,  controlDevice, viewMode, obscuration) VALUES (?,?,?,?,?)";

            PreparedStatement st = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            st.setInt(1, key);
            st.setInt(2, linearTVQualifier.getNavMethod().getCode());
            st.setInt(3, linearTVQualifier.getControlDevice().getValorCodigo());
            st.setInt(4, linearTVQualifier.getViewMode().getCode());
            st.setInt(5, linearTVQualifier.getObscuration().getCode());
            

            st.executeUpdate();

            ResultSet rs = st.getGeneratedKeys();
            if (rs.next()) {
                if (linearTVQualifier.getChannelQualifier() != null) {
                    if (linearTVQualifier.getChannelQualifier().getChannelList() != null) {
                        new ChannelListDAO().insertChannelList(linearTVQualifier.getChannelQualifier().getChannelList(), rs.getInt(1), conn);
                    }
                }
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

}
