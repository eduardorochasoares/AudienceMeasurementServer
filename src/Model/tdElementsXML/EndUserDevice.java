/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.tdElementsXML;

/**
 *
 * @author Principal
 */
public class EndUserDevice {
   private AMFCapabilityProfile AMFCapabilityProfile;
   private int ServiceInstanceID; 
   private String CaptionLanguage;
   private String AudioLanguage;
   private TVInformation TVInformation;
   private IPTVTVInformation IPTVInformation;
   private AudioAmplifierInformation AudioAmplifierInformation;
   private STBInformation STBInformation;
   private MobileDeviceInformation MobileDeviceInformation;
   private PCInformation PCInformation;
   private ImageSize ImageSize;
   private VolumeDirection VolumeDirection;
   private float ZoomFactor;
   private float Obscuration;
   private ControlDevice ControlDevice;
   
    /**
     * @return the AMFCapabilityProfile
     */
    public AMFCapabilityProfile getAMFCapabilityProfile() {
        return AMFCapabilityProfile;
    }

    /**
     * @param AMFCapabilityProfile the AMFCapabilityProfile to set
     */
    public void setAMFCapabilityProfile(AMFCapabilityProfile AMFCapabilityProfile) {
        this.AMFCapabilityProfile = AMFCapabilityProfile;
    }

    /**
     * @return the ServiceInstanceID
     */
    public int getServiceInstanceID() {
        return ServiceInstanceID;
    }

    /**
     * @param ServiceInstanceID the ServiceInstanceID to set
     */
    public void setServiceInstanceID(int ServiceInstanceID) {
        this.ServiceInstanceID = ServiceInstanceID;
    }

    /**
     * @return the CaptionLanguage
     */
    public String getCaptionLanguage() {
        return CaptionLanguage;
    }

    /**
     * @param CaptionLanguage the CaptionLanguage to set
     */
    public void setCaptionLanguage(String CaptionLanguage) {
        this.CaptionLanguage = CaptionLanguage;
    }

    /**
     * @return the AudioLanguage
     */
    public String getAudioLanguage() {
        return AudioLanguage;
    }

    /**
     * @param AudioLanguage the AudioLanguage to set
     */
    public void setAudioLanguage(String AudioLanguage) {
        this.AudioLanguage = AudioLanguage;
    }

    /**
     * @return the TVInformation
     */
    public TVInformation getTVInformation() {
        return TVInformation;
    }

    /**
     * @param TVInformation the TVInformation to set
     */
    public void setTVInformation(TVInformation TVInformation) {
        this.TVInformation = TVInformation;
    }

    /**
     * @return the IPTVInformation
     */
    public IPTVTVInformation getIPTVInformation() {
        return IPTVInformation;
    }

    /**
     * @param IPTVInformation the IPTVInformation to set
     */
    public void setIPTVInformation(IPTVTVInformation IPTVInformation) {
        this.IPTVInformation = IPTVInformation;
    }

    /**
     * @return the AudioAmplifierInformation
     */
    public AudioAmplifierInformation getAudioAmplifierInformation() {
        return AudioAmplifierInformation;
    }

    /**
     * @param AudioAmplifierInformation the AudioAmplifierInformation to set
     */
    public void setAudioAmplifierInformation(AudioAmplifierInformation AudioAmplifierInformation) {
        this.AudioAmplifierInformation = AudioAmplifierInformation;
    }

    /**
     * @return the STBInformation
     */
    public STBInformation getSTBInformation() {
        return STBInformation;
    }

    /**
     * @param STBInformation the STBInformation to set
     */
    public void setSTBInformation(STBInformation STBInformation) {
        this.STBInformation = STBInformation;
    }

    /**
     * @return the MobileDeviceInformation
     */
    public MobileDeviceInformation getMobileDeviceInformation() {
        return MobileDeviceInformation;
    }

    /**
     * @param MobileDeviceInformation the MobileDeviceInformation to set
     */
    public void setMobileDeviceInformation(MobileDeviceInformation MobileDeviceInformation) {
        this.MobileDeviceInformation = MobileDeviceInformation;
    }

    /**
     * @return the PCInformation
     */
    public PCInformation getPCInformation() {
        return PCInformation;
    }

    /**
     * @param PCInformation the PCInformation to set
     */
    public void setPCInformation(PCInformation PCInformation) {
        this.PCInformation = PCInformation;
    }

    /**
     * @return the ImageSize
     */
    public ImageSize getImageSize() {
        return ImageSize;
    }

    /**
     * @param ImageSize the ImageSize to set
     */
    public void setImageSize(ImageSize ImageSize) {
        this.ImageSize = ImageSize;
    }

    /**
     * @return the VolumeDirection
     */
    public VolumeDirection getVolumeDirection() {
        return VolumeDirection;
    }

    /**
     * @param VolumeDirection the VolumeDirection to set
     */
    public void setVolumeDirection(VolumeDirection VolumeDirection) {
        this.VolumeDirection = VolumeDirection;
    }

    /**
     * @return the ZoomFactor
     */
    public float getZoomFactor() {
        return ZoomFactor;
    }

    /**
     * @param ZoomFactor the ZoomFactor to set
     */
    public void setZoomFactor(float ZoomFactor) {
        this.ZoomFactor = ZoomFactor;
    }

    /**
     * @return the Obscuration
     */
    public float getObscuration() {
        return Obscuration;
    }

    /**
     * @param Obscuration the Obscuration to set
     */
    public void setObscuration(float Obscuration) {
        this.Obscuration = Obscuration;
    }

    /**
     * @return the ControlDevice
     */
    public ControlDevice getControlDevice() {
        return ControlDevice;
    }

    /**
     * @param ControlDevice the ControlDevice to set
     */
    public void setControlDevice(ControlDevice ControlDevice) {
        this.ControlDevice = ControlDevice;
    }
}