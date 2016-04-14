/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.AMReportPackage;

import java.sql.Timestamp;

/**
 *
 * @author Principal
 */
public class UserPresent {
    private String presenceMethod;
    private Timestamp presenceTime;
    private float presenceConfidence;

    /**
     * @return the presenceMethod
     */
    public String getPresenceMethod() {
        return presenceMethod;
    }

    /**
     * @param presenceMethod the presenceMethod to set
     */
    public void setPresenceMethod(String presenceMethod) {
        this.presenceMethod = presenceMethod;
    }

    /**
     * @return the presenceTime
     */
    public Timestamp getPresenceTime() {
        return presenceTime;
    }

    /**
     * @param presenceTime the presenceTime to set
     */
    public void setPresenceTime(Timestamp presenceTime) {
        this.presenceTime = presenceTime;
    }

    /**
     * @return the presenceConfidence
     */
    public float getPresenceConfidence() {
        return presenceConfidence;
    }

    /**
     * @param presenceConfidence the presenceConfidence to set
     */
    public void setPresenceConfidence(float presenceConfidence) {
        this.presenceConfidence = presenceConfidence;
    }
}
