/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.MeasurementRequest;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Principal
 */
public class EventTrigger {
    private List<Event> event = new ArrayList<>();
    private PriorityTrigger priority;
    /**
     * @return the event
     */
    public List<Event> getEvent() {
        return event;
    }

    /**
     * @param event the event to set
     */
    public void setEvent(List<Event> event) {
        this.event = event;
    }

    /**
     * @return the priority
     */
    public PriorityTrigger getPriority() {
        return priority;
    }

    /**
     * @param priority the priority to set
     */
    public void setPriority(PriorityTrigger priority) {
        this.priority = priority;
    }

    /**
     * @return the priority
     */
   
}
