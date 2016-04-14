/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.tdElementsXML;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author Eduardo Soares
 */
public class EndUserElementsXML {

    private static DocumentBuilderFactory docFactory;
    private static Element rootElement;

    public void createEndUserElementsXML(EndUserDevice ed, AMFCapabilityProfile amf, TVInformation tvinf,
            IPTVTVInformation iptvinf, AudioAmplifierInformation aai, STBInformation STBinf, MobileDeviceInformation mdi,
            PCInformation pci, ImageSize imgsize) {

        docFactory = DocumentBuilderFactory.newInstance();

        try {
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            Document doc = docBuilder.newDocument();
            rootElement = doc.createElement("EndUserDevice");
            addED(doc, ed);
            addAmf(doc, amf);
            addTVInfo(doc, tvinf);
            addIPTVinfo(doc, iptvinf);
            addAudioAmplifierInfo(doc, aai);
            addSTBinfo(doc, STBinf);
            addMobileDeviceInfo(doc, mdi);
            addPCInformation(doc, pci);
            addImgSize(doc, imgsize);

            writeXML(doc);
        } catch (ParserConfigurationException | DOMException ex) {
        }
    }

    public static void addED(Document doc, EndUserDevice ed) {
        Element filho = doc.createElement("ServiceInstanceID");
        rootElement.appendChild(filho);
        filho.appendChild(doc.createTextNode(Integer.toString(ed.getServiceInstanceID())));
        filho = doc.createElement("CaptionLanguage");
        rootElement.appendChild(filho);
        filho.appendChild(doc.createTextNode(ed.getCaptionLanguage()));
        filho = doc.createElement("AudioLanguage");
        rootElement.appendChild(filho);
        filho.appendChild(doc.createTextNode(ed.getAudioLanguage()));
        filho = doc.createElement("ZoomFactor");
        rootElement.appendChild(filho);
        filho.appendChild(doc.createTextNode(Float.toString(ed.getZoomFactor())));
        filho = doc.createElement("Obscuration");
        rootElement.appendChild(filho);
        filho.appendChild(doc.createTextNode(Float.toString(ed.getObscuration())));
        filho = doc.createElement("VolumeDirection");
        rootElement.appendChild(filho);
        filho.appendChild(doc.createTextNode(ed.getVolumeDirection().name()));
        filho = doc.createElement("ControlDevice");
        rootElement.appendChild(filho);
        filho.appendChild(doc.createTextNode(ed.getControlDevice().name()));

    }

    public static void addTVInfo(Document doc, TVInformation tvinf) {
        Element tvinfo = doc.createElement("TVInformation");
        rootElement.appendChild(tvinfo);
        Element filho = doc.createElement("TVManuf");
        tvinfo.appendChild(filho);
        filho.appendChild(doc.createTextNode(Integer.toString(tvinf.getTVManuf())));
        filho = doc.createElement("TVModel");
        tvinfo.appendChild(filho);
        filho.appendChild(doc.createTextNode(Integer.toString(tvinf.getTVModel())));
        filho = doc.createElement("TVSerialNum");
        tvinfo.appendChild(filho);
        filho.appendChild(doc.createTextNode(Integer.toHexString(tvinf.getTVSerialNum())));

    }

    public static void addAudioAmplifierInfo(Document doc, AudioAmplifierInformation aai) {
        Element ainfo = doc.createElement("AudioAmplifierInformation");
        rootElement.appendChild(ainfo);
        Element filho = doc.createElement("AudioAmplifierManuf");
        filho.appendChild(doc.createTextNode(aai.getAudioAmplifierManuf()));
        ainfo.appendChild(filho);
        filho = doc.createElement("AudioAmplifierModel");
        filho.appendChild(doc.createTextNode(aai.getAudioAmplifierModel()));
        ainfo.appendChild(filho);
        filho = doc.createElement("AudioAmplifierSerialNum");
        filho.appendChild(doc.createTextNode(aai.getAudioAmplifierSerialNum()));
        ainfo.appendChild(filho);
    }

    public static void addSTBinfo(Document doc, STBInformation STBinf) {
        Element stb = doc.createElement("STBInformation");
        rootElement.appendChild(stb);
        Element filho = doc.createElement("STBManuf");
        filho.appendChild(doc.createTextNode(STBinf.getSTBManuf()));
        stb.appendChild(filho);
        filho = doc.createElement("STBModel");
        filho.appendChild(doc.createTextNode(STBinf.getSTBModel()));
        stb.appendChild(filho);
        filho = doc.createElement("STBSerialNum");
        filho.appendChild(doc.createTextNode(STBinf.getSTBSerialNum()));
        stb.appendChild(filho);
    }

    public static void addIPTVinfo(Document doc, IPTVTVInformation iptvinf) {
        Element iptvinfo = doc.createElement("IPTV-TVInformation");
        rootElement.appendChild(iptvinfo);
        Element filho = doc.createElement("IPTV-TVManuf");
        filho.appendChild(doc.createTextNode(iptvinf.getIPTVTVManuf()));
        iptvinfo.appendChild(filho);
        filho = doc.createElement("IPTVTVModel");
        filho.appendChild(doc.createTextNode(iptvinf.getIPTVTVModel()));
        iptvinfo.appendChild(filho);
        filho = doc.createElement("IPTV-TVSerialNum");
        filho.appendChild(doc.createTextNode(iptvinf.getIPTVTVSerialNum()));
        iptvinfo.appendChild(filho);
    }

    public static void addMobileDeviceInfo(Document doc, MobileDeviceInformation mdi) {
        Element mobiledevice = doc.createElement("MobileDeviceInformation");
        rootElement.appendChild(mobiledevice);
        Element filho = doc.createElement("MobileDeviceManuf");
        filho.appendChild(doc.createTextNode(mdi.getMobileDeviceManuf()));
        mobiledevice.appendChild(filho);
        filho = doc.createElement("MobileDeviceModel");
        filho.appendChild(doc.createTextNode(mdi.getMobileDeviceMode()));
        mobiledevice.appendChild(filho);
        filho = doc.createElement("MobileDeviceSerialNum");
        filho.appendChild(doc.createTextNode(mdi.getMobileDeviceSerialNum()));
        mobiledevice.appendChild(filho);
    }

    public static void addPCInformation(Document doc, PCInformation pci) {
        Element pcinfo = doc.createElement("PCInformation");
        rootElement.appendChild(pcinfo);
        Element filho = doc.createElement("PCManuf");
        filho.appendChild(doc.createTextNode(pci.getPCManuf()));
        pcinfo.appendChild(filho);
        filho = doc.createElement("PCModel");
        filho.appendChild(doc.createTextNode(pci.getPCModel()));
        pcinfo.appendChild(filho);
        filho = doc.createElement("PCSerialNum");
        filho.appendChild(doc.createTextNode(pci.getPCSerialNum()));
        pcinfo.appendChild(filho);
    }

    public static void addImgSize(Document doc, ImageSize imgsize) {
        Element imagesize = doc.createElement("ImageSize");
        rootElement.appendChild(imagesize);
        Element filho = doc.createElement("ImageWidth");
        filho.appendChild(doc.createTextNode(Integer.toString(imgsize.getImageWidth())));
        imagesize.appendChild(filho);
        filho = doc.createElement("ImageHeight");
        filho.appendChild(doc.createTextNode(Integer.toString(imgsize.getImageWidth())));
        imagesize.appendChild(filho);
    }

    public static void addAmf(Document doc, AMFCapabilityProfile amf) {

        doc.appendChild(rootElement);
        Element amfC = doc.createElement("AMFCapabilityProfile");
        rootElement.appendChild(amfC);
        int index = 0;
        Element pai = doc.createElement("TransportCapabilitiesList");
        amfC.appendChild(pai);
        //AMFCapabilityProfile itens
        for (String transp : amf.getTransportCapabilitiesList().getTransportProtocolMode()) {

            Element transpmode = doc.createElement("TransportProtocolMode");
            transpmode.appendChild(doc.createTextNode(amf.getTransportCapabilitiesList().getTransportProtocolMode().get(index)));

            pai.appendChild(transpmode);
            index++;

        }
        //Security Elements
        pai = doc.createElement("SecurityCapabilities");
        amfC.appendChild(pai);
        for (int i = 0; i < amf.getSecurityCapabilities().getCryptographicProtocol().size(); i++) {
            Element crip = doc.createElement("CryptographicProtocol");
            crip.appendChild(doc.createTextNode(amf.getSecurityCapabilities().getCryptographicProtocol().get(i)));
            pai.appendChild(crip);
        }
        //Permission Operation Modes
        pai = doc.createElement("PermissionOperationModes");
        amfC.appendChild(pai);
        for (int i = 0; i < amf.getReportDeliveryModes().getDeliveryMode().size(); i++) {
            Element pm = doc.createElement("PermissionMode");
            pm.appendChild(doc.createTextNode(amf.getPermissionOperationModes().getPermissionMode().get(i)));
            pai.appendChild(pm);
        }
        //ConfigurationPackageDelivery
        pai = doc.createElement("ConfigurationPackageDelivery");
        amfC.appendChild(pai);
        for (int i = 0; i < amf.getConfigurationPackageDelivery().getConfigurationMode().size(); i++) {
            Element cm = doc.createElement("ConfigurationMode");
            cm.appendChild(doc.createTextNode(amf.getConfigurationPackageDelivery().getConfigurationMode().get(i)));
            pai.appendChild(cm);
        }
        //Mensurament Trigger
        pai = doc.createElement("MeasurementTriggerMethod");
        amfC.appendChild(pai);
        for (int i = 0; i < amf.getMeasurementTriggerMethod().getEventTrigger().size(); i++) {
            Element et = doc.createElement("EventTrigger");
            et.appendChild(doc.createTextNode(amf.getMeasurementTriggerMethod().getEventTrigger().get(i)));
            pai.appendChild(et);
        }
        for (int i = 0; i < amf.getMeasurementTriggerMethod().getServiceStartTrigger().size(); i++) {
            Element sst = doc.createElement("ServiceStartTrigger");
            sst.appendChild(doc.createTextNode(amf.getMeasurementTriggerMethod().getServiceStartTrigger().get(i)));
            pai.appendChild(sst);
        }
        for (int i = 0; i < amf.getMeasurementTriggerMethod().getTimeSampleTrigger().size(); i++) {
            Element tst = doc.createElement("TimeSampleTrigger");
            tst.appendChild(doc.createTextNode(amf.getMeasurementTriggerMethod().getTimeSampleTrigger().get(i)));
            pai.appendChild(tst);
        }

        //Report Delivery Modes
        pai = doc.createElement("ReportDeliveryModes");
        amfC.appendChild(pai);
        for (int i = 0; i < amf.getReportDeliveryModes().getDeliveryMode().size(); i++) {
            Element crip = doc.createElement("DeliveryMode");
            crip.appendChild(doc.createTextNode(amf.getReportDeliveryModes().getDeliveryMode().get(i)));
            pai.appendChild(crip);
        }
        //Operational Management Capabilities
        pai = doc.createElement("OperationalManagementCapabilities");
        amfC.appendChild(pai);
        for (int i = 0; i < amf.getOperationalManagementCapabilities().getOperationalManagement().size(); i++) {
            Element om = doc.createElement("OperationalManagement");
            om.appendChild(doc.createTextNode(amf.getOperationalManagementCapabilities().getOperationalManagement().get(i)));
            pai.appendChild(om);
        }

        //compression
        for (int i = 0; i < amf.getCompression().size(); i++) {
            Element om = doc.createElement("Compression");
            om.appendChild(doc.createTextNode(amf.getCompression().get(i)));
            amfC.appendChild(om);
        }

    }

    public static void writeXML(Document doc) {
        TransformerFactory transformerFactory
                = TransformerFactory.newInstance();
        Transformer transformer = null;
        try {
            transformer = transformerFactory.newTransformer();
        } catch (TransformerConfigurationException ex) {
            Logger.getLogger(EndUserElementsXML.class.getName()).log(Level.SEVERE, null, ex);
        }
        DOMSource source = new DOMSource(doc);
        StreamResult result
                = new StreamResult(new File("C:\\Users\\Principal\\Desktop\\cars.xml"));
        try {
            transformer.transform(source, result);
        } catch (TransformerException ex) {
            Logger.getLogger(EndUserElementsXML.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Output to console for testing
        StreamResult consoleResult
                = new StreamResult(System.out);
        try {
            transformer.transform(source, consoleResult);
        } catch (TransformerException ex) {
            Logger.getLogger(EndUserElementsXML.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
