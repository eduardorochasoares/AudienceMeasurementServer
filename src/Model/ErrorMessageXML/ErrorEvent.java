/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.ErrorMessageXML;

/**
 *
 * @author Principal
 */


public enum ErrorEvent {

    VideoResize("VideoResize"),
    VideoZoom("VideoZoom"), VideoObscure("VideoObscure"),
    AudioVolume("AudioVolume"), ConfigurationChange("ConfigurationChange"), UserChange("UserChange"),
    UserInfoChange("UserInfoChange"),
    DisplayStatus("DisplayStatus"),
    AudioLanguageChange("AudioLanguageChange"),
    CaptionLanguageChange("CaptionLanguageChange");
    
    private final String errorEvent;

    private ErrorEvent(String code) {
        this.errorEvent = code;
    }
    
    
}
