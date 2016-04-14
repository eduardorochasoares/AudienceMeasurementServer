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
public class UserIdBioInfo {
    private String userID;
    private ArrayList<ControlledUserInfoAddress> controlledUserInfoAddres = new ArrayList<>();
    private ArrayList<ControlledUserInfoString> controlledUserInfoString = new ArrayList<>();
    private ArrayList<ControlledUserInfoDate> controlledUserInfoDate =  new ArrayList<>();

    /**
     * @return the userID
     */
    public String getUserID() {
        return userID;
    }

    /**
     * @param userID the userID to set
     */
    public void setUserID(String userID) {
        this.userID = userID;
    }

    /**
     * @return the controlledUserInfoAddres
     */
    public ArrayList<ControlledUserInfoAddress> getControlledUserInfoAddres() {
        return controlledUserInfoAddres;
    }

    /**
     * @param controlledUserInfoAddres the controlledUserInfoAddres to set
     */
    public void setControlledUserInfoAddres(ArrayList<ControlledUserInfoAddress> controlledUserInfoAddres) {
        this.controlledUserInfoAddres = controlledUserInfoAddres;
    }

    /**
     * @return the controlledUserInfoString
     */
    public ArrayList<ControlledUserInfoString> getControlledUserInfoString() {
        return controlledUserInfoString;
    }

    /**
     * @param controlledUserInfoString the controlledUserInfoString to set
     */
    public void setControlledUserInfoString(ArrayList<ControlledUserInfoString> controlledUserInfoString) {
        this.controlledUserInfoString = controlledUserInfoString;
    }

    /**
     * @return the controlledUserInfoDate
     */
    public ArrayList<ControlledUserInfoDate> getControlledUserInfoDate() {
        return controlledUserInfoDate;
    }

    /**
     * @param controlledUserInfoDate the controlledUserInfoDate to set
     */
    public void setControlledUserInfoDate(ArrayList<ControlledUserInfoDate> controlledUserInfoDate) {
        this.controlledUserInfoDate = controlledUserInfoDate;
    }
}
