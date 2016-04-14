/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.tdElementsXML;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eduardo Soares
 */
public class AMFCapabilityProfile {

    private TransportCapabilitiesList TransportCapabilitiesList;
    private SecurityCapabilities SecurityCapabilities;
    private PermissionOperationModes PermissionOperationModes;
    private ConfigurationPackageDelivery ConfigurationPackageDelivery;
    private MeasurementTriggerMethod MeasurementTriggerMethod;
    private ReportDeliveryModes ReportDeliveryModes;
    private OperationalManagementCapabilities OperationalManagementCapabilities;
    private ArrayList<String> Compression;
    
    public AMFCapabilityProfile() {
        TransportCapabilitiesList = new TransportCapabilitiesList();
        SecurityCapabilities = new SecurityCapabilities();
        PermissionOperationModes = new PermissionOperationModes();
        ConfigurationPackageDelivery = new ConfigurationPackageDelivery();
        MeasurementTriggerMethod = new MeasurementTriggerMethod();
        ReportDeliveryModes = new ReportDeliveryModes();
        OperationalManagementCapabilities = new OperationalManagementCapabilities();
        Compression = new ArrayList<>();
    }

    /**
     * @return the TransportCapabilitiesList
     */
    public TransportCapabilitiesList getTransportCapabilitiesList() {
        return TransportCapabilitiesList;
    }

    /**
     * @param TransportCapabilitiesList the TransportCapabilitiesList to set
     */
    public void setTransportCapabilitiesList(TransportCapabilitiesList TransportCapabilitiesList) {
        this.TransportCapabilitiesList = TransportCapabilitiesList;
    }

    /**
     * @return the SecurityCapabilities
     */
    public SecurityCapabilities getSecurityCapabilities() {
        return SecurityCapabilities;
    }

    /**
     * @param SecurityCapabilities the SecurityCapabilities to set
     */
    public void setSecurityCapabilities(SecurityCapabilities SecurityCapabilities) {
        this.SecurityCapabilities = SecurityCapabilities;
    }

    /**
     * @return the PermissionOperationModes
     */
    public PermissionOperationModes getPermissionOperationModes() {
        return PermissionOperationModes;
    }

    /**
     * @param PermissionOperationModes the PermissionOperationModes to set
     */
    public void setPermissionOperationModes(PermissionOperationModes PermissionOperationModes) {
        this.PermissionOperationModes = PermissionOperationModes;
    }

    /**
     * @return the ConfigurationPackageDelivery
     */
    public ConfigurationPackageDelivery getConfigurationPackageDelivery() {
        return ConfigurationPackageDelivery;
    }

    /**
     * @param ConfigurationPackageDelivery the ConfigurationPackageDelivery to
     * set
     */
    public void setConfigurationPackageDelivery(ConfigurationPackageDelivery ConfigurationPackageDelivery) {
        this.ConfigurationPackageDelivery = ConfigurationPackageDelivery;
    }

    /**
     * @return the MeasurementTriggerMethod
     */
    public MeasurementTriggerMethod getMeasurementTriggerMethod() {
        return MeasurementTriggerMethod;
    }

    /**
     * @param MeasurementTriggerMethod the MeasurementTriggerMethod to set
     */
    public void setMeasurementTriggerMethod(MeasurementTriggerMethod MeasurementTriggerMethod) {
        this.MeasurementTriggerMethod = MeasurementTriggerMethod;
    }

    /**
     * @return the ReportDeliveryModes
     */
    public ReportDeliveryModes getReportDeliveryModes() {
        return ReportDeliveryModes;
    }

    /**
     * @param ReportDeliveryModes the ReportDeliveryModes to set
     */
    public void setReportDeliveryModes(ReportDeliveryModes ReportDeliveryModes) {
        this.ReportDeliveryModes = ReportDeliveryModes;
    }

    /**
     * @return the Compression
     */
    public ArrayList<String> getCompression() {
        return Compression;
    }

    /**
     * @param Compression the Compression to set
     */
    public void setCompression(ArrayList<String> Compression) {
        this.Compression = Compression;
    }

    /**
     * @return the OperationalManagement
     */
  

    /**
     * @param  the OperationalManagement to set
     */
  

    /**
     * @return the OperationalManagementCapabilities
     */
    public OperationalManagementCapabilities getOperationalManagementCapabilities() {
        return OperationalManagementCapabilities;
    }

    /**
     * @param OperationalManagementCapabilities the OperationalManagementCapabilities to set
     */
    public void setOperationalManagementCapabilities(OperationalManagementCapabilities OperationalManagementCapabilities) {
        this.OperationalManagementCapabilities = OperationalManagementCapabilities;
    }

}
