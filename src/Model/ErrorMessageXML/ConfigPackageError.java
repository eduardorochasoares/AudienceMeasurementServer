/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.ErrorMessageXML;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Principal
 */
public class ConfigPackageError {
    private int PackageID;
    private int PackageVersion;
    private List<ConfigPackageErrorInfo> configPackageErrorInfo;
    
    public ConfigPackageError(){
        configPackageErrorInfo = new ArrayList<>();
    }

    /**
     * @return the PackageID
     */
    public int getPackageID() {
        return PackageID;
    }

    /**
     * @param PackageID the PackageID to set
     */
    public void setPackageID(int PackageID) {
        this.PackageID = PackageID;
    }

    /**
     * @return the PackageVersion
     */
    public int getPackageVersion() {
        return PackageVersion;
    }

    /**
     * @param PackageVersion the PackageVersion to set
     */
    public void setPackageVersion(int PackageVersion) {
        this.PackageVersion = PackageVersion;
    }

    /**
     * @return the configPackageErrorInfo
     */
    public List<ConfigPackageErrorInfo> getConfigPackageErrorInfo() {
        return configPackageErrorInfo;
    }

    /**
     * @param configPackageErrorInfo the configPackageErrorInfo to set
     */
    public void setConfigPackageErrorInfo(List<ConfigPackageErrorInfo> configPackageErrorInfo) {
        this.configPackageErrorInfo = configPackageErrorInfo;
    }
}
