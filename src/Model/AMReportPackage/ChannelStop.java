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
public class ChannelStop extends Events{
    private String controlDevice;
    private String stopNavMethod;

    /**
     * @return the controlDevice
     */
    public String getControlDevice() {
        return controlDevice;
    }

    /**
     * @param controlDevice the controlDevice to set
     */
    public void setControlDevice(String controlDevice) {
        this.controlDevice = controlDevice;
    }

    /**
     * @return the stopNavMethod
     */
    public String getStopNavMethod() {
        return stopNavMethod;
    }

    /**
     * @param stopNavMethod the stopNavMethod to set
     */
    public void setStopNavMethod(String stopNavMethod) {
        this.stopNavMethod = stopNavMethod;
    }
    
    
}
