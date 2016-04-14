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
public class ChannelQualifier {
    private ChannelList channelList;
    private AllChannelsExceptList allChannelsExceptList;

    /**
     * @return the channelList
     */
    public ChannelList getChannelList() {
        return channelList;
    }

    /**
     * @param channelList the channelList to set
     */
    public void setChannelList(ChannelList channelList) {
        this.channelList = channelList;
    }

    /**
     * @return the allChannelsExceptList
     */
    public AllChannelsExceptList getAllChannelsExceptList() {
        return allChannelsExceptList;
    }

    /**
     * @param allChannelsExceptList the allChannelsExceptList to set
     */
    public void setAllChannelsExceptList(AllChannelsExceptList allChannelsExceptList) {
        this.allChannelsExceptList = allChannelsExceptList;
    }
}
