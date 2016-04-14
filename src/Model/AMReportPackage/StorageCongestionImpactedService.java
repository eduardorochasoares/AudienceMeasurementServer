/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.AMReportPackage;

/**
 *
 * @author Principal
 */
public class StorageCongestionImpactedService {
    private int serviceInstaceID;
    private boolean serviceStopDropped = false;

    /**
     * @return the serviceInstaceID
     */
    public int getServiceInstaceID() {
        return serviceInstaceID;
    }

    /**
     * @param serviceInstaceID the serviceInstaceID to set
     */
    public void setServiceInstaceID(int serviceInstaceID) {
        this.serviceInstaceID = serviceInstaceID;
    }

    /**
     * @return the serviceStopDropped
     */
    public boolean isServiceStopDropped() {
        return serviceStopDropped;
    }

    /**
     * @param serviceStopDropped the serviceStopDropped to set
     */
    public void setServiceStopDropped(boolean serviceStopDropped) {
        this.serviceStopDropped = serviceStopDropped;
    }
}
