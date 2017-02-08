/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.AMReportPackage;

/**
 *
 * @author eduardo
 */
public class VoDEvents {
    private String serviceIdentifier;
    private String event;
    private int serviceInstanceID;

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
     * @return the event
     */
    public String getEvent() {
        return event;
    }

    /**
     * @param event the event to set
     */
    public void setEvent(String event) {
        this.event = event;
    }

    /**
     * @return the serviceInstanceID
     */
    public int getServiceInstanceID() {
        return serviceInstanceID;
    }

    /**
     * @param serviceInstanceID the serviceInstanceID to set
     */
    public void setServiceInstanceID(int serviceInstanceID) {
        this.serviceInstanceID = serviceInstanceID;
    }
    
}
