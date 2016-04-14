/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.AMFConfigPackage;

import java.sql.Timestamp;

/**
 *
 * @author Principal
 */
public class UserPermitInfo {
    private Timestamp lastUpdateDateAndTime;
    private UserPermit userPermit;

    /**
     * @return the lastUpdateDateAndTime
     */
 
    public UserPermit getUserPermit() {
        return userPermit;
    }

    /**
     * @param userPermit the userPermit to set
     */
    public void setUserPermit(UserPermit userPermit) {
        this.userPermit = userPermit;
    }

    /**
     * @return the lastUpdateDateAndTime
     */
    public Timestamp getLastUpdateDateAndTime() {
        return lastUpdateDateAndTime;
    }

    /**
     * @param lastUpdateDateAndTime the lastUpdateDateAndTime to set
     */
    public void setLastUpdateDateAndTime(Timestamp lastUpdateDateAndTime) {
        this.lastUpdateDateAndTime = lastUpdateDateAndTime;
    }
    
}
