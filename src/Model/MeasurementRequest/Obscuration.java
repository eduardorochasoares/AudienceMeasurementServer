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
public enum Obscuration {
    Report(1),DoNotReport(0);
    private final int code;

    private Obscuration(int code) {
        this.code = code;
    }

    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }
    
    
}
