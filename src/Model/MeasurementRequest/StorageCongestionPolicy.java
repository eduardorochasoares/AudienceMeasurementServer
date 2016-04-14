/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.MeasurementRequest;

/**
 *
 * @author Principal
 */
public enum StorageCongestionPolicy {
    dropOldest(0), dropLowestPriority(1);
    private final int code;

     StorageCongestionPolicy(int code) {
         this.code = code;
     }

    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }
    
}
