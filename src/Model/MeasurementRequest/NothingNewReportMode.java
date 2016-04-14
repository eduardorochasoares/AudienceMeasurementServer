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
public enum NothingNewReportMode {
    IgnoreAmSample(0), CreateEmptyAMSample(1), CreateACompleteAMSample(2);
    
    private final int code;

    private NothingNewReportMode(int code) {
        this.code = code;
    }

    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }
    
}
