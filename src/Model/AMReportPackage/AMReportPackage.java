/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.AMReportPackage;

import java.util.ArrayList;

/**
 *
 * @author Principal
 */
public class AMReportPackage {

    private String subescriberID;
    private String terminalDeviceID;
    private ArrayList<StorageCongestionImpactedService> storageCongestionImpactedService = new ArrayList<>();
    private ArrayList<MeasurementReport> measurementReports = new ArrayList<>();

    /**
     * @return the subescriberID
     */
    public String getSubescriberID() {
        return subescriberID;
    }

    /**
     * @param subescriberID the subescriberID to set
     */
    public void setSubescriberID(String subescriberID) {
        this.subescriberID = subescriberID;
    }

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
     * @return the storageCongestionImpactedService
     */
    public ArrayList<StorageCongestionImpactedService> getStorageCongestionImpactedService() {
        return storageCongestionImpactedService;
    }

    /**
     * @param storageCongestionImpactedService the
     * storageCongestionImpactedService to set
     */
    public void setStorageCongestionImpactedService(ArrayList<StorageCongestionImpactedService> storageCongestionImpactedService) {
        this.storageCongestionImpactedService = storageCongestionImpactedService;
    }
}
