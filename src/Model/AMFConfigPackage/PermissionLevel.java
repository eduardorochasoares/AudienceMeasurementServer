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
public enum PermissionLevel {
NoInfo(0), OnlyDistinguishability(1),
DistinguishabilityandNon(2) ,IdentifyingAndGeneric(3);

private final int code;

    PermissionLevel(int code) {
        this.code = code;
    }

    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }

}
