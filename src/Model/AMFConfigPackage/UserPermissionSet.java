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
public class UserPermissionSet {
    private PermissionLevel permissionLevel;
    private List<UserPermission> userPermission = new ArrayList<>();

    /**
     * @return the permissionLevel
     */
    public PermissionLevel getPermissionLevel() {
        return permissionLevel;
    }

    /**
     * @param permissionLevel the permissionLevel to set
     */
    public void setPermissionLevel(PermissionLevel permissionLevel) {
        this.permissionLevel = permissionLevel;
    }

    /**
     * @return the userPermission
     */
    public List<UserPermission> getUserPermission() {
        return userPermission;
    }

    /**
     * @param userPermission the userPermission to set
     */
    public void setUserPermission(List<UserPermission> userPermission) {
        this.userPermission = userPermission;
    }
}
