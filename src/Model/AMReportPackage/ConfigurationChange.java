/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.AMReportPackage;

import Model.tdElementsXML.AMFCapabilityProfile;

/**
 *
 * @author Principal
 */
public class ConfigurationChange {
    private AMFCapabilityProfile amfCapabilityProfile;
    private TVInformation tvInformation;
    private AudioAmplifierInformation audioAmpliInfo;

    /**
     * @return the amfCapabilityProfile
     */
    public AMFCapabilityProfile getAmfCapabilityProfile() {
        return amfCapabilityProfile;
    }

    /**
     * @param amfCapabilityProfile the amfCapabilityProfile to set
     */
    public void setAmfCapabilityProfile(AMFCapabilityProfile amfCapabilityProfile) {
        this.amfCapabilityProfile = amfCapabilityProfile;
    }

    /**
     * @return the tvInformation
     */
    public TVInformation getTvInformation() {
        return tvInformation;
    }

    /**
     * @param tvInformation the tvInformation to set
     */
    public void setTvInformation(TVInformation tvInformation) {
        this.tvInformation = tvInformation;
    }

    /**
     * @return the audioAmpliInfo
     */
    public AudioAmplifierInformation getAudioAmpliInfo() {
        return audioAmpliInfo;
    }

    /**
     * @param audioAmpliInfo the audioAmpliInfo to set
     */
    public void setAudioAmpliInfo(AudioAmplifierInformation audioAmpliInfo) {
        this.audioAmpliInfo = audioAmpliInfo;
    }
}
