/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.AMFConfigPackage;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Principal
 */
public class TerminalDeviceSet {
    private List<TerminalDeviceType> terminalDeviceType = new ArrayList<>();

    /**
     * @return the terminalDeviceType
     */
    public List<TerminalDeviceType> getTerminalDeviceType() {
        return terminalDeviceType;
    }

    /**
     * @param terminalDeviceType the terminalDeviceType to set
     */
    public void setTerminalDeviceType(List<TerminalDeviceType> terminalDeviceType) {
        this.terminalDeviceType = terminalDeviceType;
    }
}
