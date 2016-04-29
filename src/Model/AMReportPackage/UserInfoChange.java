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
public class UserInfoChange extends UserID {

    private ArrayList<GenericUserInfo> genericUserInfo = new ArrayList<>();
    private ArrayList<ControlledUserInfoString> controlledUserInfoString = new ArrayList<>();
    private ArrayList<ControlledUserInfoDate> controlledUserInfoDate = new ArrayList<>();
    private ArrayList<ControlledUserInfoAddress> controlledUserInfoAddress = new ArrayList<>();

    /**
     * @return the genericUserInfo
     */
    public ArrayList<GenericUserInfo> getGenericUserInfo() {
        return genericUserInfo;
    }

    /**
     * @param genericUserInfo the genericUserInfo to set
     */
    public void setGenericUserInfo(ArrayList<GenericUserInfo> genericUserInfo) {
        this.genericUserInfo = genericUserInfo;
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

    /**
     * @return the controlledUserInfoAddress
     */
    public ArrayList<ControlledUserInfoAddress> getControlledUserInfoAddress() {
        return controlledUserInfoAddress;
    }

    /**
     * @param controlledUserInfoAddress the controlledUserInfoAddress to set
     */
    public void setControlledUserInfoAddress(ArrayList<ControlledUserInfoAddress> controlledUserInfoAddress) {
        this.controlledUserInfoAddress = controlledUserInfoAddress;
    }

}
