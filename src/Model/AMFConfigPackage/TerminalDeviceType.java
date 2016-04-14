/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.AMFConfigPackage;

/**
 *
 * @author Principal
 */
public enum TerminalDeviceType {
     STB(0), TV(1),Mobile(2), PC(3), Tablet(4),Other(5);
     private final int code;

    private TerminalDeviceType(int code) {
        this.code = code;
    }

    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }
     
     
    
}
