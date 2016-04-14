/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.AMReportPackage;

import java.sql.Timestamp;

/**
 *
 * @author Principal
 */
public class EventCount extends Events {
    private int eventsCounted;
    private Timestamp startTime;

    /**
     * @return the eventsCounted
     */
    public int getEventsCounted() {
        return eventsCounted;
    }

    /**
     * @param eventsCounted the eventsCounted to set
     */
    public void setEventsCounted(int eventsCounted) {
        this.eventsCounted = eventsCounted;
    }

    /**
     * @return the startTime
     */
    public Timestamp getStartTime() {
        return startTime;
    }

    /**
     * @param startTime the startTime to set
     */
    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }
    
}
