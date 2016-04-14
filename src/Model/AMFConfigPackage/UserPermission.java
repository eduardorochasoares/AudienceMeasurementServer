/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.AMFConfigPackage;

import Model.MeasurementRequest.AllContentClassExceptList;
import Model.MeasurementRequest.ChannelQualifier;

/**
 *
 * @author Principal
 */
public class UserPermission {
    private ChannelQualifier channelQualifier;
    private TerminalDeviceSet terminalDeviceSet;
    private AllContentClassExceptList allContentClassExceptList;

    /**
     * @return the channelQualifier
     */
    public ChannelQualifier getChannelQualifier() {
        return channelQualifier;
    }

    /**
     * @param channelQualifier the channelQualifier to set
     */
    public void setChannelQualifier(ChannelQualifier channelQualifier) {
        this.channelQualifier = channelQualifier;
    }

    /**
     * @return the terminalDeviceSet
     */
    public TerminalDeviceSet getTerminalDeviceSet() {
        return terminalDeviceSet;
    }

    /**
     * @param terminalDeviceSet the terminalDeviceSet to set
     */
    public void setTerminalDeviceSet(TerminalDeviceSet terminalDeviceSet) {
        this.terminalDeviceSet = terminalDeviceSet;
    }

    /**
     * @return the allContentClassExceptList
     */
    public AllContentClassExceptList getAllContentClassExceptList() {
        return allContentClassExceptList;
    }

    /**
     * @param allContentClassExceptList the allContentClassExceptList to set
     */
    public void setAllContentClassExceptList(AllContentClassExceptList allContentClassExceptList) {
        this.allContentClassExceptList = allContentClassExceptList;
    }
}
