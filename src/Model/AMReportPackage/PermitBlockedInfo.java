/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.AMReportPackage;

import Model.MeasurementRequest.AllContentClassExceptList;

/**
 *
 * @author Principal
 */
public class PermitBlockedInfo {

    private short permissionLevelFlag;
    private String terminalDeviceTypeFlag;
    private boolean channelFlag;
    private AllContentClassExceptList allContentClassExceptList;

    /**
     * @return the permissionLevelFlag
     */
    public short getPermissionLevelFlag() {
        return permissionLevelFlag;
    }

    /**
     * @param permissionLevelFlag the permissionLevelFlag to set
     */
    public void setPermissionLevelFlag(short permissionLevelFlag) {
        this.permissionLevelFlag = permissionLevelFlag;
    }

    /**
     * @return the terminalDeviceTypeFlag
     */
    public String getTerminalDeviceTypeFlag() {
        return terminalDeviceTypeFlag;
    }

    /**
     * @param terminalDeviceTypeFlag the terminalDeviceTypeFlag to set
     */
    public void setTerminalDeviceTypeFlag(String terminalDeviceTypeFlag) {
        this.terminalDeviceTypeFlag = terminalDeviceTypeFlag;
    }

    /**
     * @return the channelFlag
     */
    public boolean isChannelFlag() {
        return channelFlag;
    }

    /**
     * @param channelFlag the channelFlag to set
     */
    public void setChannelFlag(boolean channelFlag) {
        this.channelFlag = channelFlag;
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
