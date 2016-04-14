/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.AMFConfigPackage;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Principal
 */
public class MeasurementRequestSetFilter {
    private List<UserInfoTarget> userInfoTarget = new ArrayList<>();
    private List<Integer> measurementRequestID;


    /**
     * @return the measurementRequestID
     */
    public List<Integer> getMeasurementRequestID() {
        return measurementRequestID;
    }

    /**
     * @param measurementRequestID the measurementRequestID to set
     */
    public void setMeasurementRequestID(List<Integer> measurementRequestID) {
        this.measurementRequestID = measurementRequestID;
    }

    /**
     * @return the userInfoTarget
     */
    public List<UserInfoTarget> getUserInfoTarget() {
        return userInfoTarget;
    }

    /**
     * @param userInfoTarget the userInfoTarget to set
     */
    public void setUserInfoTarget(List<UserInfoTarget> userInfoTarget) {
        this.userInfoTarget = userInfoTarget;
    }
    
}
