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
public class ChannelStart extends Events {

    private String controlDevice;
    private String startNavMethod;
    private int previousServiceInstanceID;
    private String serviceIdentifier;
    private String viewMode;
    private String obscuration;

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
     * @return the startNavMethod
     */
    public String getStartNavMethod() {
        return startNavMethod;
    }

    /**
     * @param startNavMethod the startNavMethod to set
     */
    public void setStartNavMethod(String startNavMethod) {
        this.startNavMethod = startNavMethod;
    }

    /**
     * @return the previousServiceInstanceID
     */
    public int getPreviousServiceInstanceID() {
        return previousServiceInstanceID;
    }

    /**
     * @param previousServiceInstanceID the previousServiceInstanceID to set
     */
    public void setPreviousServiceInstanceID(int previousServiceInstanceID) {
        this.previousServiceInstanceID = previousServiceInstanceID;
    }

   
    /**
     * @return the serviceIdentifier
     */
    public String getServiceIdentifier() {
        return serviceIdentifier;
    }

    /**
     * @param serviceIdentifier the serviceIdentifier to set
     */
    public void setServiceIdentifier(String serviceIdentifier) {
        this.serviceIdentifier = serviceIdentifier;
    }

    /**
     * @return the viewMode
     */
    public String getViewMode() {
        return viewMode;
    }

    /**
     * @param viewMode the viewMode to set
     */
    public void setViewMode(String viewMode) {
        this.viewMode = viewMode;
    }

    /**
     * @return the obscuration
     */
    public String getObscuration() {
        return obscuration;
    }

    /**
     * @param obscuration the obscuration to set
     */
    public void setObscuration(String obscuration) {
        this.obscuration = obscuration;
    }
    
}
