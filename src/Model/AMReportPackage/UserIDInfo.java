/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.AMReportPackage;

/**
 *
 * @author Principal
 */
public class UserIDInfo  extends UserID{
    
    private String userIDMethod;
    private float userIDConfidence;

   
    /**
     * @return the userIDMethod
     */
    public String getUserIDMethod() {
        return userIDMethod;
    }

    /**
     * @param userIDMethod the userIDMethod to set
     */
    public void setUserIDMethod(String userIDMethod) {
        this.userIDMethod = userIDMethod;
    }

    /**
     * @return the userIDConfidence
     */
    public float getUserIDConfidence() {
        return userIDConfidence;
    }

    /**
     * @param userIDConfidence the userIDConfidence to set
     */
    public void setUserIDConfidence(float userIDConfidence) {
        this.userIDConfidence = userIDConfidence;
    }
    
}
