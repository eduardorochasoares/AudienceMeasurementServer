/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.tdElementsXML;

import Model.AMFConfigPackage.TerminalDeviceType;

/**
 *
 * @author Principal
 */
public class ConfigPackageRequest {
    private String terminalDeviceID;
    private String terminalDeviceType;
    private String serviceProviderIdentifier;
    private int subscriberID;
    private AMFCapabilityProfile amf;
    private Measurements current;
    private Measurements future;

    /**
     * @return the terminalDeviceID
     */
    public String getTerminalDeviceID() {
        return terminalDeviceID;
    }

    /**
     * @param terminalDeviceID the terminalDeviceID to set
     */
    public void setTerminalDeviceID(String terminalDeviceID) {
        this.terminalDeviceID = terminalDeviceID;
    }

    /**
     * @return the terminalDeviceType
     */
    public String getTerminalDeviceType() {
        return terminalDeviceType;
    }

    /**
     * @param terminalDeviceType the terminalDeviceType to set
     */
    public void setTerminalDeviceType(String terminalDeviceType) {
        this.terminalDeviceType = terminalDeviceType;
    }

    /**
     * @return the serviceProviderIdentifier
     */
    public String getServiceProviderIdentifier() {
        return serviceProviderIdentifier;
    }

    /**
     * @param serviceProviderIdentifier the serviceProviderIdentifier to set
     */
    public void setServiceProviderIdentifier(String serviceProviderIdentifier) {
        this.serviceProviderIdentifier = serviceProviderIdentifier;
    }

    /**
     * @return the subscriberID
     */
    public int getSubscriberID() {
        return subscriberID;
    }

    /**
     * @param subscriberID the subscriberID to set
     */
    public void setSubscriberID(int subscriberID) {
        this.subscriberID = subscriberID;
    }

    /**
     * @return the amf
     */
    public AMFCapabilityProfile getAmf() {
        return amf;
    }

    /**
     * @param amf the amf to set
     */
    public void setAmf(AMFCapabilityProfile amf) {
        this.amf = amf;
    }

    /**
     * @return the current
     */
    public Measurements getCurrent() {
        return current;
    }

    /**
     * @param current the current to set
     */
    public void setCurrent(Measurements current) {
        this.current = current;
    }

    /**
     * @return the future
     */
    public Measurements getFuture() {
        return future;
    }

    /**
     * @param future the future to set
     */
    public void setFuture(Measurements future) {
        this.future = future;
    }
}
