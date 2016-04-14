/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.MeasurementRequest;

/**
 *
 * @author Principal
 */
public class Event {
    private EventValue eventValue;
    private String eventParameter1;

    /**
     * @return the eventValue
     */
   

    /**
     * @return the eventParameter1
     */
    public String getEventParameter1() {
        return eventParameter1;
    }

    /**
     * @param eventParameter1 the eventParameter1 to set
     */
    public void setEventParameter1(String eventParameter1) {
        this.eventParameter1 = eventParameter1;
    }

    /**
     * @return the eventValue
     */
    public EventValue getEventValue() {
        return eventValue;
    }

    /**
     * @param eventValue the eventValue to set
     */
    public void setEventValue(EventValue eventValue) {
        this.eventValue = eventValue;
    }
    
}
