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
public enum SampleSetIdentifierTimeTrigger {

    UserPresent("UserPresent"), TDLocation("TDLocation"), DeviceInfo("DeviceInfo"), UserBioInfo("UserBioInfo"),
    GenericUserInfo("GenericUserInfo"), EventCount("EventCount"),
    UserList("UserList"), PermitBlockedInfo("PermitBlockedInfo"), ChannelPlaying("ChannelPlaying");
    private final String identifier;

    private SampleSetIdentifierTimeTrigger(String code) {
        this.identifier = code;
    }

    /**
     * @return the identifier
     */
    public String getIdentifier() {
        return identifier;
    }

}
