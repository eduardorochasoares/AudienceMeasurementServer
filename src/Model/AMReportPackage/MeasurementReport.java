/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.AMReportPackage;

import java.sql.Timestamp;
import java.util.ArrayList;

/**
 *
 * @author Principal
 */
public class MeasurementReport {

    private int measurementRequestID;
    private Timestamp measurementReportTriggerTime;
    private String displayStatus;
    private AudioFocus audioFocus;
    private CaptionLanguageChange captionLanguageChange;
    private AudioLanguageChange audioLanguageChange;
    private AudioVolume audioVolume;
    private ConfigurationChange configChange;
    private VideoObscure videoObscure;
    private VideoZoom videoZoom;
    private VideoResize videoResize;
    private ArrayList<EventCount> eventCount = new ArrayList<>();
    private DeviceInformation devInformation;
    private ArrayList<UserIdBioInfo> userIdBioInfo = new ArrayList<>();
    private TDLocation tdLocation;
    private ArrayList<UserIDInfo> userList;
    private ArrayList<UserPresent> userPresent;
    private ArrayList<UserIDGenericInfo> genericUserInfo;
    private UserInfoChange userInfoChange;
    private PermitBlockedInfo permitBlockedInfo;
    private ChannelStart channelStart;
    private ChannelStop channelStop;
    private ArrayList<ChannelPlaying> channelPlaying = new ArrayList<>();

    /**
     * @return the measurementRequestID
     */
    public int getMeasurementRequestID() {
        return measurementRequestID;
    }

    /**
     * @param measurementRequestID the measurementRequestID to set
     */
    public void setMeasurementRequestID(int measurementRequestID) {
        this.measurementRequestID = measurementRequestID;
    }

    /**
     * @return the measurementReportTriggerTime
     */
    public Timestamp getMeasurementReportTriggerTime() {
        return measurementReportTriggerTime;
    }

    /**
     * @param measurementReportTriggerTime the measurementReportTriggerTime to set
     */
    public void setMeasurementReportTriggerTime(Timestamp measurementReportTriggerTime) {
        this.measurementReportTriggerTime = measurementReportTriggerTime;
    }

    /**
     * @return the displayStatus
     */
    public String isDisplayStatus() {
        return displayStatus;
    }

    /**
     * @param displayStatus the displayStatus to set
     */
    public void setDisplayStatus(String displayStatus) {
        this.displayStatus = displayStatus;
    }

    /**
     * @return the audioFocus
     */
    public AudioFocus getAudioFocus() {
        return audioFocus;
    }

    /**
     * @param audioFocus the audioFocus to set
     */
    public void setAudioFocus(AudioFocus audioFocus) {
        this.audioFocus = audioFocus;
    }

    /**
     * @return the captionLanguageChange
     */
    public CaptionLanguageChange getCaptionLanguageChange() {
        return captionLanguageChange;
    }

    /**
     * @param captionLanguageChange the captionLanguageChange to set
     */
    public void setCaptionLanguageChange(CaptionLanguageChange captionLanguageChange) {
        this.captionLanguageChange = captionLanguageChange;
    }

    /**
     * @return the audioLanguageChange
     */
    public AudioLanguageChange getAudioLanguageChange() {
        return audioLanguageChange;
    }

    /**
     * @param audioLanguageChange the audioLanguageChange to set
     */
    public void setAudioLanguageChange(AudioLanguageChange audioLanguageChange) {
        this.audioLanguageChange = audioLanguageChange;
    }

    /**
     * @return the audioVolume
     */
    public AudioVolume getAudioVolume() {
        return audioVolume;
    }

    /**
     * @param audioVolume the audioVolume to set
     */
    public void setAudioVolume(AudioVolume audioVolume) {
        this.audioVolume = audioVolume;
    }

    /**
     * @return the configChange
     */
    public ConfigurationChange getConfigChange() {
        return configChange;
    }

    /**
     * @param configChange the configChange to set
     */
    public void setConfigChange(ConfigurationChange configChange) {
        this.configChange = configChange;
    }

    /**
     * @return the videoObscure
     */
    public VideoObscure getVideoObscure() {
        return videoObscure;
    }

    /**
     * @param videoObscure the videoObscure to set
     */
    public void setVideoObscure(VideoObscure videoObscure) {
        this.videoObscure = videoObscure;
    }

    /**
     * @return the videoZoom
     */
    public VideoZoom getVideoZoom() {
        return videoZoom;
    }

    /**
     * @param videoZoom the videoZoom to set
     */
    public void setVideoZoom(VideoZoom videoZoom) {
        this.videoZoom = videoZoom;
    }

    /**
     * @return the videoResize
     */
    public VideoResize getVideoResize() {
        return videoResize;
    }

    /**
     * @param videoResize the videoResize to set
     */
    public void setVideoResize(VideoResize videoResize) {
        this.videoResize = videoResize;
    }

    /**
     * @return the eventCount
     */
    public ArrayList<EventCount> getEventCount() {
        return eventCount;
    }

    /**
     * @param eventCount the eventCount to set
     */
    public void setEventCount(ArrayList<EventCount> eventCount) {
        this.eventCount = eventCount;
    }

    /**
     * @return the devInformation
     */
    public DeviceInformation getDevInformation() {
        return devInformation;
    }

    /**
     * @param devInformation the devInformation to set
     */
    public void setDevInformation(DeviceInformation devInformation) {
        this.devInformation = devInformation;
    }

    /**
     * @return the userIdBioInfo
     */
    public ArrayList<UserIdBioInfo> getUserIdBioInfo() {
        return userIdBioInfo;
    }

    /**
     * @param userIdBioInfo the userIdBioInfo to set
     */
    public void setUserIdBioInfo(ArrayList<UserIdBioInfo> userIdBioInfo) {
        this.userIdBioInfo = userIdBioInfo;
    }

    /**
     * @return the tdLocation
     */
    public TDLocation getTdLocation() {
        return tdLocation;
    }

    /**
     * @param tdLocation the tdLocation to set
     */
    public void setTdLocation(TDLocation tdLocation) {
        this.tdLocation = tdLocation;
    }

    /**
     * @return the userList
     */
    public ArrayList<UserIDInfo> getUserList() {
        return userList;
    }

    /**
     * @param userList the userList to set
     */
    public void setUserList(ArrayList<UserIDInfo> userList) {
        this.userList = userList;
    }

    /**
     * @return the userPresent
     */
    public ArrayList<UserPresent> getUserPresent() {
        return userPresent;
    }

    /**
     * @param userPresent the userPresent to set
     */
    public void setUserPresent(ArrayList<UserPresent> userPresent) {
        this.userPresent = userPresent;
    }

    /**
     * @return the genericUserInfo
     */
    public ArrayList<UserIDGenericInfo> getGenericUserInfo() {
        return genericUserInfo;
    }

    /**
     * @param genericUserInfo the genericUserInfo to set
     */
    public void setGenericUserInfo(ArrayList<UserIDGenericInfo> genericUserInfo) {
        this.genericUserInfo = genericUserInfo;
    }

    /**
     * @return the userInfoChange
     */
    public UserInfoChange getUserInfoChange() {
        return userInfoChange;
    }

    /**
     * @param userInfoChange the userInfoChange to set
     */
    public void setUserInfoChange(UserInfoChange userInfoChange) {
        this.userInfoChange = userInfoChange;
    }

    /**
     * @return the permitBlockedInfo
     */
    public PermitBlockedInfo getPermitBlockedInfo() {
        return permitBlockedInfo;
    }

    /**
     * @param permitBlockedInfo the permitBlockedInfo to set
     */
    public void setPermitBlockedInfo(PermitBlockedInfo permitBlockedInfo) {
        this.permitBlockedInfo = permitBlockedInfo;
    }

    /**
     * @return the channelStart
     */
    public ChannelStart getChannelStart() {
        return channelStart;
    }

    /**
     * @param channelStart the channelStart to set
     */
    public void setChannelStart(ChannelStart channelStart) {
        this.channelStart = channelStart;
    }

    /**
     * @return the channelStop
     */
    public ChannelStop getChannelStop() {
        return channelStop;
    }

    /**
     * @param channelStop the channelStop to set
     */
    public void setChannelStop(ChannelStop channelStop) {
        this.channelStop = channelStop;
    }

    /**
     * @return the channelPlaying
     */
    public ArrayList<ChannelPlaying> getChannelPlaying() {
        return channelPlaying;
    }

    /**
     * @param channelPlaying the channelPlaying to set
     */
    public void setChannelPlaying(ArrayList<ChannelPlaying> channelPlaying) {
        this.channelPlaying = channelPlaying;
    }

}
