/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.AMReportPackage;

import java.util.ArrayList;

/**
 *
 * @author Principal
 */
public class UserIDGenericInfo extends UserID{
    private ArrayList<GenericUserInfo> genericUserinfo = new ArrayList<>();

    /**
     * @return the genericUserinfo
     */
    public ArrayList<GenericUserInfo> getGenericUserinfo() {
        return genericUserinfo;
    }

    /**
     * @param genericUserinfo the genericUserinfo to set
     */
    public void setGenericUserinfo(ArrayList<GenericUserInfo> genericUserinfo) {
        this.genericUserinfo = genericUserinfo;
    }
}
