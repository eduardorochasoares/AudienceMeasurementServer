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
public class DeviceInformation {
    private MobileDeviceInformation m;
    private PCInformation pcInfo;
    private AudioAmplifierInformation audioAmpli;
    private TVInformation tvInfo;
    private STBInformation stb;
    private IPTVTVInformation iptvInfo;

    /**
     * @return the m
     */
    public MobileDeviceInformation getM() {
        return m;
    }

    /**
     * @param m the m to set
     */
    public void setM(MobileDeviceInformation m) {
        this.m = m;
    }

    /**
     * @return the pcInfo
     */
    public PCInformation getPcInfo() {
        return pcInfo;
    }

    /**
     * @param pcInfo the pcInfo to set
     */
    public void setPcInfo(PCInformation pcInfo) {
        this.pcInfo = pcInfo;
    }

    /**
     * @return the audioAmpli
     */
    public AudioAmplifierInformation getAudioAmpli() {
        return audioAmpli;
    }

    /**
     * @param audioAmpli the audioAmpli to set
     */
    public void setAudioAmpli(AudioAmplifierInformation audioAmpli) {
        this.audioAmpli = audioAmpli;
    }

    /**
     * @return the tvInfo
     */
    public TVInformation getTvInfo() {
        return tvInfo;
    }

    /**
     * @param tvInfo the tvInfo to set
     */
    public void setTvInfo(TVInformation tvInfo) {
        this.tvInfo = tvInfo;
    }

    /**
     * @return the stb
     */
    public STBInformation getStb() {
        return stb;
    }

    /**
     * @param stb the stb to set
     */
    public void setStb(STBInformation stb) {
        this.stb = stb;
    }

    /**
     * @return the iptvInfo
     */
    public IPTVTVInformation getIptvInfo() {
        return iptvInfo;
    }

    /**
     * @param iptvInfo the iptvInfo to set
     */
    public void setIptvInfo(IPTVTVInformation iptvInfo) {
        this.iptvInfo = iptvInfo;
    }
    
}
