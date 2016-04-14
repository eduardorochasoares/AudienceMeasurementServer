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
public enum EventValue {
    ChannelPlaying("ChannelPlaying") , VideoResize("VideoResize"), VideoZoom("VideoZoom"), VideoObscure("VideoObscure")
    , AudioVolume("AudioVolume"), ConfigurationChange("ConfigurationChange"), 
    UserChange("UserChange"), UserInfoChange("UserInfoChange"), 
    AudioLanguageChange("AudioLanguageChange"), CaptionLanguageChange("CaptionLanguageChange"), 
    DisplayStatus("DisplayStatus"), LinearChannelStart("LinearChannelStart")
    ,LinearChannelStop("LinearChannelStop"); 
    private final String event;

    private EventValue(String event) {
        this.event = event;
    }

    /**
     * @return the event
     */
    public String getEvent() {
        return event;
    }
    
}
