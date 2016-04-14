/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.AMFConfigPackage;

import Model.MeasurementRequest.AllContentClassExceptList;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Principal
 */
public class UserPermit {
    private PermissionLevel defaultPermissionLevel;
    private Timestamp expirationDate;
    private AllContentClassExceptList defauAllContentClassExceptList;
    private List<Integer> anonUserID = new ArrayList<>();
    private List<String> userID = new ArrayList<>();
    private List<UserPermissionSet> permissionSets = new ArrayList<>();

   

    /**
     * @return the defauAllContentClassExceptList
     */
    public AllContentClassExceptList getDefauAllContentClassExceptList() {
        return defauAllContentClassExceptList;
    }

    /**
     * @param defauAllContentClassExceptList the defauAllContentClassExceptList to set
     */
    public void setDefauAllContentClassExceptList(AllContentClassExceptList defauAllContentClassExceptList) {
        this.defauAllContentClassExceptList = defauAllContentClassExceptList;
    }

    /**
     * @return the anonUserID
     */
    public List<Integer> getAnonUserID() {
        return anonUserID;
    }

    /**
     * @param anonUserID the anonUserID to set
     */
    public void setAnonUserID(List<Integer> anonUserID) {
        this.anonUserID = anonUserID;
    }

    /**
     * @return the userID
     */
    public List<String> getUserID() {
        return userID;
    }

    /**
     * @param userID the userID to set
     */
    public void setUserID(List<String> userID) {
        this.userID = userID;
    }

    /**
     * @return the expirationDate
     */
    public Timestamp getExpirationDate() {
        return expirationDate;
    }

    /**
     * @param expirationDate the expirationDate to set
     */
    public void setExpirationDate(Timestamp expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * @return the defaultPermissionLevel
     */
    public PermissionLevel getDefaultPermissionLevel() {
        return defaultPermissionLevel;
    }

    /**
     * @param defaultPermissionLevel the defaultPermissionLevel to set
     */
    public void setDefaultPermissionLevel(PermissionLevel defaultPermissionLevel) {
        this.defaultPermissionLevel = defaultPermissionLevel;
    }

    /**
     * @return the permissionSets
     */
    public List<UserPermissionSet> getPermissionSets() {
        return permissionSets;
    }

    /**
     * @param permissionSets the permissionSets to set
     */
    public void setPermissionSets(List<UserPermissionSet> permissionSets) {
        this.permissionSets = permissionSets;
    }
}
