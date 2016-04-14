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
public class LinearTVQualifier {
    private NavMethod navMethod;
    private ControlDevice controlDevice;
    private ViewMode viewMode;
    private Obscuration obscuration;
    private ChannelQualifier channelQualifier;
    private int channelChangeFilter;

    /**
     * @return the navMethod
     */
    public NavMethod getNavMethod() {
        return navMethod;
    }

    /**
     * @param navMethod the navMethod to set
     */
    public void setNavMethod(NavMethod navMethod) {
        this.navMethod = navMethod;
    }

    /**
     * @return the controlDevice
     */
    public ControlDevice getControlDevice() {
        return controlDevice;
    }

    /**
     * @param controlDevice the controlDevice to set
     */
    public void setControlDevice(ControlDevice controlDevice) {
        this.controlDevice = controlDevice;
    }

    /**
     * @return the viewMode
     */
    public ViewMode getViewMode() {
        return viewMode;
    }

    /**
     * @param viewMode the viewMode to set
     */
    public void setViewMode(ViewMode viewMode) {
        this.viewMode = viewMode;
    }

    /**
     * @return the obscuration
     */
    public Obscuration getObscuration() {
        return obscuration;
    }

    /**
     * @param obscuration the obscuration to set
     */
    public void setObscuration(Obscuration obscuration) {
        this.obscuration = obscuration;
    }

    /**
     * @return the channelQualifier
     */
    public ChannelQualifier getChannelQualifier() {
        return channelQualifier;
    }

    /**
     * @param channelQualifier the channelQualifier to set
     */
    public void setChannelQualifier(ChannelQualifier channelQualifier) {
        this.channelQualifier = channelQualifier;
    }

    /**
     * @return the channelChangeFilter
     */
    public int getChannelChangeFilter() {
        return channelChangeFilter;
    }

    /**
     * @param channelChangeFilter the channelChangeFilter to set
     */
    public void setChannelChangeFilter(int channelChangeFilter) {
        this.channelChangeFilter = channelChangeFilter;
    }
}
