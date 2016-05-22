/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileTransfer;

import java.util.ArrayList;

/**
 *
 * @author Principal
 */
public class ServerConfig {
    private ArrayList<String> transportProtocol =  new ArrayList<>();
    private ArrayList<String> cryptographicProtocol = new ArrayList<>();
    private ArrayList<String> permissionMode = new ArrayList<>();
    private ArrayList<String> deliveryMode = new ArrayList<>();
    private ArrayList<String> compression = new ArrayList<>();
    private ArrayList<String> configurationMode = new ArrayList<>();

    /**
     * @return the transportProtocol
     */
    public ArrayList<String> getTransportProtocol() {
        return transportProtocol;
    }

    /**
     * @param transportProtocol the transportProtocol to set
     */
    public void setTransportProtocol(ArrayList<String> transportProtocol) {
        this.transportProtocol = transportProtocol;
    }

    /**
     * @return the cryptographicProtocol
     */
    public ArrayList<String> getCryptographicProtocol() {
        return cryptographicProtocol;
    }

    /**
     * @param cryptographicProtocol the cryptographicProtocol to set
     */
    public void setCryptographicProtocol(ArrayList<String> cryptographicProtocol) {
        this.cryptographicProtocol = cryptographicProtocol;
    }

    /**
     * @return the permissionMode
     */
    public ArrayList<String> getPermissionMode() {
        return permissionMode;
    }

    /**
     * @param permissionMode the permissionMode to set
     */
    public void setPermissionMode(ArrayList<String> permissionMode) {
        this.permissionMode = permissionMode;
    }

    /**
     * @return the deliveryMode
     */
    public ArrayList<String> getDeliveryMode() {
        return deliveryMode;
    }

    /**
     * @param deliveryMode the deliveryMode to set
     */
    public void setDeliveryMode(ArrayList<String> deliveryMode) {
        this.deliveryMode = deliveryMode;
    }

    /**
     * @return the compression
     */
    public ArrayList<String> getCompression() {
        return compression;
    }

    /**
     * @param compression the compression to set
     */
    public void setCompression(ArrayList<String> compression) {
        this.compression = compression;
    }

    /**
     * @return the configurationMode
     */
    public ArrayList<String> getConfigurationMode() {
        return configurationMode;
    }

    /**
     * @param configurationMode the configurationMode to set
     */
    public void setConfigurationMode(ArrayList<String> configurationMode) {
        this.configurationMode = configurationMode;
    }
    
    
}
