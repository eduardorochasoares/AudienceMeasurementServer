/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileTransfer;

import DAO.AMReportPackageDAO;
import DAO.ConfigPackageRequestDAO;
import Model.AMReportPackage.AMReportPackage;
import Model.AMReportPackage.AudioAmplifierInformation;
import Model.AMReportPackage.AudioFocus;
import Model.AMReportPackage.AudioLanguageChange;
import Model.AMReportPackage.AudioVolume;
import Model.AMReportPackage.CaptionLanguageChange;
import Model.AMReportPackage.ChannelPlaying;
import Model.AMReportPackage.ChannelStart;
import Model.AMReportPackage.ChannelStop;
import Model.AMReportPackage.ConfigurationChange;
import Model.AMReportPackage.ControlledUserInfoAddress;
import Model.AMReportPackage.ControlledUserInfoDate;
import Model.AMReportPackage.ControlledUserInfoString;
import Model.AMReportPackage.DeviceInformation;
import Model.AMReportPackage.EventCount;
import Model.AMReportPackage.GenericUserInfo;
import Model.AMReportPackage.IPTVTVInformation;
import Model.AMReportPackage.MeasurementReport;
import Model.AMReportPackage.MobileDeviceInformation;
import Model.AMReportPackage.PCInformation;
import Model.AMReportPackage.PermitBlockedInfo;
import Model.AMReportPackage.STBInformation;
import Model.AMReportPackage.StorageCongestionImpactedService;
import Model.AMReportPackage.TDLocation;
import Model.AMReportPackage.TVInformation;
import Model.AMReportPackage.UserBiographicInformation;
import Model.AMReportPackage.UserIDGenericInfo;
import Model.AMReportPackage.UserIDInfo;
import Model.AMReportPackage.UserIdBioInfo;
import Model.AMReportPackage.UserInfoChange;
import Model.AMReportPackage.UserPresent;
import Model.AMReportPackage.VideoObscure;
import Model.AMReportPackage.VideoResize;
import Model.AMReportPackage.VideoZoom;
import Model.MeasurementRequest.AllContentClassExceptList;
import Model.MeasurementRequest.ContentClassDomain;
import Model.tdElementsXML.AMFCapabilityProfile;
import Model.tdElementsXML.ConfigPackageRequest;
import Model.tdElementsXML.ConfigurationPackageDelivery;
import Model.tdElementsXML.MeasurementTriggerMethod;
import Model.tdElementsXML.OperationalManagementCapabilities;
import Model.tdElementsXML.PermissionOperationModes;
import Model.tdElementsXML.ReportDeliveryModes;
import Model.tdElementsXML.SecurityCapabilities;
import Model.tdElementsXML.TransportCapabilitiesList;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Principal
 */
public class ClientHandler extends Thread {

    protected Socket incoming;

    public ClientHandler(Socket incoming) {
        this.incoming = incoming;
    }

    @Override
    public void run() {

        try {
            InputStream in = incoming.getInputStream();
            InputStreamReader isr = new InputStreamReader(in);
            BufferedReader reader = new BufferedReader(isr);

            File f1 = new File("a.xml");
            FileOutputStream out = new FileOutputStream(f1);
            int c;
            while ((c = in.read()) != 0) {
                out.write(c);
            }
            parsingXML("a");
            out.close();
            incoming.close();
        } catch (Exception e) {
        }
    }

    void parsingXML(String name) {

        try {
            File inputFile = new File(name + ".xml");
            DocumentBuilderFactory dbFactory
                    = DocumentBuilderFactory.newInstance();
            Node nNode;
            NodeList nList;
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            if ("ConfigPackageRequest".equals(doc.getDocumentElement().getNodeName())) {
                System.out.println("é arquivo de Configuracao");
                ConfigPackageRequest configPckgRequest = new ConfigPackageRequest();
                nList = doc.getElementsByTagName("ConfigPackageRequest");

                nNode = nList.item(0);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    System.out.println("entrouu");
                    if (eElement.getElementsByTagName("TerminalDeviceID").item(0).getTextContent() != null) {
                        configPckgRequest.setTerminalDeviceID(eElement.getElementsByTagName("TerminalDeviceID").item(0).getTextContent());
                    }

                    if (eElement.getElementsByTagName("TerminalDeviceType").item(0).getTextContent() != null) {
                        configPckgRequest.setTerminalDeviceType(eElement.getElementsByTagName("TerminalDeviceType").item(0).getTextContent());
                    }

                    if (eElement.getElementsByTagName("ServiceProviderIdentifier").item(0).getTextContent() != null) {
                        configPckgRequest.setServiceProviderIdentifier(eElement.getElementsByTagName("ServiceProviderIdentifier").item(0).getTextContent());
                    }

                    if (eElement.getElementsByTagName("SubscriberID").item(0).getTextContent() != null) {
                        configPckgRequest.setSubscriberID(Integer.parseInt(eElement.getElementsByTagName("SubscriberID").item(0).getTextContent()));
                    }

                }

                configPckgRequest.setAmf(parsingAMF(doc));

                if (verifiyCapabilities(configPckgRequest)) {
                    if (new ConfigPackageRequestDAO().insertConfigPkg(configPckgRequest)) {
                        System.out.println("ok");
                    } else {
                        System.out.println("not ok");
                    }
                }
            }
            if ("AMReportPackage".equals(doc.getDocumentElement().getNodeName())) {
                System.out.println("Documento de Medicao");
                AMReportPackage amReportPckg = new AMReportPackage();

                nList = doc.getElementsByTagName("SubscriberID");
                nNode = nList.item(0);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element e = (Element) nNode;
                    amReportPckg.setSubescriberID(e.getTextContent());
                }

                nList = doc.getElementsByTagName("TerminalDeviceID");
                nNode = nList.item(0);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element e = (Element) nNode;
                    amReportPckg.setTerminalDeviceID(e.getTextContent());
                }

                nList = doc.getElementsByTagName("StorageCongestionImpactedService");

                for (int i = 0; i < nList.getLength(); i++) {

                    nNode = nList.item(i);

                    if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                        StorageCongestionImpactedService s = new StorageCongestionImpactedService();
                        amReportPckg.getStorageCongestionImpactedService().add(s);
                        Element e = (Element) nNode;
                        s.setServiceStopDropped(Boolean.parseBoolean(e.getElementsByTagName("ServiceStopDropped").item(0).getTextContent()));

                        s.setServiceInstaceID(Integer.parseInt(e.getElementsByTagName("ServiceInstanceID").item(0).getTextContent()));
                    }

                }

                nList = doc.getElementsByTagName("MeasurementReport");
                for (int i = 0; i < nList.getLength(); i++) {

                    nNode = nList.item(i);
                    MeasurementReport mr = new MeasurementReport();
                    amReportPckg.getMeasurementReports().add(mr);
                    if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                        Element e = (Element) nNode;
                        mr.setMeasurementRequestID(Integer.parseInt(e.getElementsByTagName("MeasurementRequestID").item(0).getTextContent()));
                        /* try {
                         SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                         Date parsedDate = dateFormat.parse(e.getElementsByTagName("MeasurementReportTime").item(0).getTextContent());
                         Timestamp timestamp = new java.sql.Timestamp(parsedDate.getTime());
                         mr.setMeasurementReportTriggerTime(timestamp);
                         } catch (DOMException | ParseException excpt) {//this generic but you can control another types of exception
                         System.err.println(excpt.getMessage());
                         }*/
                      // mr.setMeasurementReportTriggerTime(StringToTimeStamp("MeasurementReportTime", nNode));
                        System.out.println("time");
                        if (e.getElementsByTagName("DisplayStatus").item(0) != null) {
                            mr.setDisplayStatus(e.getElementsByTagName("DisplayStatus").item(0).getTextContent());
                        }
                        nNode = e.getElementsByTagName("AudioFocus").item(0);
                        if (nNode != null) {
                            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                                AudioFocus af = new AudioFocus();
                                mr.setAudioFocus(af);
                                af.setServiceInstanceID(Integer.parseInt(((Element) nNode).getElementsByTagName("ServiceInstanceID").item(0).getTextContent()));
                                af.setIptvFocus(Boolean.parseBoolean(((Element) nNode).getElementsByTagName("IPTVFocus").item(0).getTextContent()));
                            }
                        }

                        nNode = e.getElementsByTagName("CaptionLanguageChange").item(0);
                        if (nNode != null) {
                            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                                CaptionLanguageChange clc = new CaptionLanguageChange();
                                mr.setCaptionLanguageChange(clc);
                                clc.setServiceInstanceID(Integer.parseInt(((Element) nNode).getElementsByTagName("ServiceInstanceID").item(0).getTextContent()));
                                clc.setCaptionLanguge(((Element) nNode).getElementsByTagName("CaptionLanguageChange").item(0).getTextContent());
                            }
                        }

                        nNode = e.getElementsByTagName("AudioLanguageChange").item(0);
                        if (nNode != null) {
                            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                                AudioLanguageChange alc = new AudioLanguageChange();
                                mr.setAudioLanguageChange(alc);
                                alc.setServiceInstanceID(Integer.parseInt(((Element) nNode).getElementsByTagName("ServiceInstanceID").item(0).getTextContent()));
                                alc.setAudioLanguage(((Element) nNode).getElementsByTagName("AudioLanguage").item(0).getTextContent());

                            }
                        }
                        nNode = e.getElementsByTagName("AudioVolume").item(0);
                        if (nNode != null) {

                            
                            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                                AudioVolume av = new AudioVolume();
                                mr.setAudioVolume(av);
                                av.setServiceInstanceID(Integer.parseInt(((Element) nNode).getElementsByTagName("ServiceInstanceID").item(0).getTextContent()));
                                av.setVolumeDirection(((Element) nNode).getElementsByTagName("VolumeDirection").item(0).getTextContent());
                            }
                        }

                        nNode = e.getElementsByTagName("ConfigurationChange").item(0);
                        if (nNode != null) {
                            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                                ConfigurationChange cg = new ConfigurationChange();
                                mr.setConfigChange(cg);

                                Element element = (Element) nNode;

                                nNode = element.getElementsByTagName("AMFCapabilityProfile").item(0);
                                if (nNode != null) {
                                    if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                                        cg.setAmfCapabilityProfile(parsingAMF(doc));

                                    }
                                }
                                nNode = element.getElementsByTagName("TVInformation").item(0);

                                if (nNode != null) {
                                    if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                                        TVInformation tvInfo = new TVInformation();
                                        cg.setTvInformation(tvInfo);
                                        tvInfo.setTvManuf(((Element) nNode).getElementsByTagName("TVManuf").item(0).getTextContent());
                                        tvInfo.settVModel(((Element) nNode).getElementsByTagName("TVModel").item(0).getTextContent());
                                        tvInfo.settVSerialNum(((Element) nNode).getElementsByTagName("TVSerialNum").item(0).getTextContent());
                                    }
                                }
                                nNode = element.getElementsByTagName("AudioAmplifier").item(0);
                                if (nNode != null) {
                                    if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                                        AudioAmplifierInformation aai = new AudioAmplifierInformation();
                                        cg.setAudioAmpliInfo(aai);
                                        aai.setAudioAmplifierManuf(((Element) nNode).getElementsByTagName("AudioAmplifierManuf").item(0).getTextContent());
                                        aai.setAudioAmplifierModel(((Element) nNode).getElementsByTagName("AudioAmplifierModel").item(0).getTextContent());
                                        aai.setAudioAmplifierSerialNum(((Element) nNode).getElementsByTagName("AudioAmplifierSerialNum").item(0).getTextContent());

                                    }
                                }
                            }
                        }
                        nNode = e.getElementsByTagName("VideoObscure").item(0);
                        if (nNode != null) {
                            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                                VideoObscure vo = new VideoObscure();
                                mr.setVideoObscure(vo);
                                vo.setServiceInstanceID(Integer.parseInt(((Element) nNode).getElementsByTagName("ServiceInstanceID").item(0).getTextContent()));
                                vo.setObscuration(Float.parseFloat(((Element) nNode).getElementsByTagName("Obscuration").item(0).getTextContent()));

                            }
                        }
                        nNode = e.getElementsByTagName("VideoZoom").item(0);
                        if (nNode != null) {
                            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                                VideoZoom vz = new VideoZoom();
                                mr.setVideoZoom(vz);
                                vz.setServiceInstanceID(Integer.parseInt(((Element) nNode).getElementsByTagName("ServiceInstanceID").item(0).getTextContent()));
                                vz.setZoomFactor(Float.parseFloat(((Element) nNode).getElementsByTagName("ZoomFactor").item(0).getTextContent()));
                            }
                        }
                        nNode = e.getElementsByTagName("VideoResize").item(0);
                        if (nNode != null) {
                            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                                
                                VideoResize vr = new VideoResize();
                                mr.setVideoResize(vr);
                                vr.setServiceInstanceID(Integer.parseInt(((Element) nNode).getElementsByTagName("ServiceInstanceID").item(0).getTextContent()));
                                vr.setImageHeight(Integer.parseInt(((Element) nNode).getElementsByTagName("ImageHeight").item(0).getTextContent()));
                                vr.setImageWidth(Integer.parseInt(((Element) nNode).getElementsByTagName("ImageWidth").item(0).getTextContent()));

                            }
                        }
                        NodeList nl = doc.getElementsByTagName("EventCount");
                        for (int j = 0; j < nl.getLength(); j++) {
                            nNode = nl.item(j);
                            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                                EventCount ec = new EventCount();
                                mr.getEventCount().add(ec);
                                ec.setEventsCounted(Integer.parseInt(((Element) nNode).getElementsByTagName("EventsCounted").item(0).getTextContent()));
                                /*try {
                                 SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                                 Date parsedDate = dateFormat.parse(((Element) nNode).getElementsByTagName("StartTime").item(0).getTextContent());
                                 Timestamp timestamp = new java.sql.Timestamp(parsedDate.getTime());
                                 ec.setStartTime(timestamp);
                                 } catch (DOMException | ParseException excpt) {//this generic but you can control another types of exception
                                 System.err.println(excpt.getMessage());
                                 }*/
                                //ec.setStartTime(StringToTimeStamp("StartTime", nNode));
                                ec.setServiceInstanceID(Integer.parseInt(((Element) nNode).getElementsByTagName("ServiceInstanceID").item(0).getTextContent()));
                            }
                        }
                        nNode = e.getElementsByTagName("DeviceInformation").item(0);
                        if (nNode != null) {
                            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                                DeviceInformation devInfo = new DeviceInformation();
                                mr.setDevInformation(devInfo);
                                if (((Element) nNode).getElementsByTagName("STBInformation").item(0) != null) {
                                    if (((Element) nNode).getElementsByTagName("STBInformation").item(0).getNodeType() == Node.ELEMENT_NODE) {
                                        STBInformation stbInfo = new STBInformation();
                                        devInfo.setStb(stbInfo);
                                        stbInfo.setStbManuf(((Element) nNode).getElementsByTagName("STBManuf").item(0).getTextContent());
                                        stbInfo.setStbModel(((Element) nNode).getElementsByTagName("STBModel").item(0).getTextContent());
                                        stbInfo.setStbSerialNum(((Element) nNode).getElementsByTagName("STBSerialNum").item(0).getTextContent());
                                    }
                                }
                                if (((Element) nNode).getElementsByTagName("AudioAmplifierInformation").item(0) != null) {
                                    if (((Element) nNode).getElementsByTagName("AudioAmplifierInformation").item(0).getNodeType() == Node.ELEMENT_NODE) {
                                        AudioAmplifierInformation audioAmpliInfo = new AudioAmplifierInformation();
                                        devInfo.setAudioAmpli(audioAmpliInfo);
                                        audioAmpliInfo.setAudioAmplifierManuf(((Element) nNode).getElementsByTagName("AudioAmplifierManuf").item(0).getTextContent());
                                        audioAmpliInfo.setAudioAmplifierModel(((Element) nNode).getElementsByTagName("AudioAmplifierModel").item(0).getTextContent());
                                        audioAmpliInfo.setAudioAmplifierSerialNum(((Element) nNode).getElementsByTagName("AudioAmplifierSerialNum").item(0).getTextContent());
                                    }
                                }
                                if (((Element) nNode).getElementsByTagName("TVInfomation").item(0) != null) {
                                    if (((Element) nNode).getElementsByTagName("TVInfomation").item(0).getNodeType() == Node.ELEMENT_NODE) {
                                        TVInformation tvInfo = new TVInformation();
                                        devInfo.setTvInfo(tvInfo);
                                        tvInfo.setTvManuf(((Element) nNode).getElementsByTagName("TVManuf").item(0).getTextContent());
                                        tvInfo.settVModel(((Element) nNode).getElementsByTagName("TVModel").item(0).getTextContent());
                                        tvInfo.settVSerialNum(((Element) nNode).getElementsByTagName("TVSerialNum").item(0).getTextContent());
                                    }
                                }
                                if (((Element) nNode).getElementsByTagName("IPTVTVInformation").item(0) != null) {
                                    if (((Element) nNode).getElementsByTagName("IPTVTVInformation").item(0).getNodeType() == Node.ELEMENT_NODE) {
                                        IPTVTVInformation iptvInfo = new IPTVTVInformation();
                                        devInfo.setIptvInfo(iptvInfo);
                                        iptvInfo.setIptvtvManuf(((Element) nNode).getElementsByTagName("IPTVTVManuf").item(0).getTextContent());
                                        iptvInfo.setIptvtvModel(((Element) nNode).getElementsByTagName("IPTVTVModel").item(0).getTextContent());
                                        iptvInfo.setIptvtvModel(((Element) nNode).getElementsByTagName("IPTVTVSerialNum").item(0).getTextContent());
                                    }
                                }
                                if (((Element) nNode).getElementsByTagName("MobilieDeviceInformation").item(0) != null) {

                                    if (((Element) nNode).getElementsByTagName("MobilieDeviceInformation").item(0).getNodeType() == Node.ELEMENT_NODE) {
                                        MobileDeviceInformation mobileDevInfo = new MobileDeviceInformation();
                                        devInfo.setM(mobileDevInfo);
                                        mobileDevInfo.setMobileDeviceManuf(((Element) nNode).getElementsByTagName("MobileDeviceManuf").item(0).getTextContent());
                                        mobileDevInfo.setMobileDeviceModel(((Element) nNode).getElementsByTagName("MobileDeviceModel").item(0).getTextContent());
                                        mobileDevInfo.setMobileDeviceSerialNum(((Element) nNode).getElementsByTagName("MobileDeviceSerialNum").item(0).getTextContent());

                                    }
                                }
                                if (((Element) nNode).getElementsByTagName("PCInformation").item(0) != null) {
                                    if (((Element) nNode).getElementsByTagName("PCInformation").item(0).getNodeType() == Node.ELEMENT_NODE) {
                                        PCInformation pcInfo = new PCInformation();
                                        devInfo.setPcInfo(pcInfo);
                                        pcInfo.setPcManuf(((Element) nNode).getElementsByTagName("PCManuf").item(0).getTextContent());
                                        pcInfo.setPcModel(((Element) nNode).getElementsByTagName("PCModel").item(0).getTextContent());
                                        pcInfo.setPcSerialNum(((Element) nNode).getElementsByTagName("PCSerialNum").item(0).getTextContent());
                                    }
                                }
                            }
                        }
                        nl = e.getElementsByTagName("UserIdBioInfo");

                        for (int j = 0; j < nl.getLength(); j++) {
                            nNode = nl.item(j);
                            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                                UserIdBioInfo userIDBioInfo = new UserIdBioInfo();
                                mr.getUserIdBioInfo().add(userIDBioInfo);
                                userIDBioInfo.setUserID(((Element) nNode).getElementsByTagName("UserId").item(0).getTextContent());
                                if (((Element) nNode).getElementsByTagName("ControlledUserInfoTypeString").item(0) != null) {
                                    NodeList nodeList = ((Element) nNode).getElementsByTagName("ControlledUserInfoTypeString").item(0).getChildNodes();
                                    for (int k = 0; k < nodeList.getLength(); k++) {
                                        Node n = nodeList.item(k);
                                        if (n != null) {
                                            if (n.getNodeType() == Node.ELEMENT_NODE) {
                                                ControlledUserInfoString ctrlUserInfoString = new ControlledUserInfoString();
                                                ctrlUserInfoString.setControlledUserInfoType(n.getNodeName());
                                                ctrlUserInfoString.setControlledUserInfoStringValue(((Element) n).getFirstChild().getTextContent());
                                                userIDBioInfo.getControlledUserInfoString().add(ctrlUserInfoString);
                                            }
                                        }
                                    }
                                }

                                if (((Element) nNode).getElementsByTagName("ControlledUserInfoTypeDate").item(0) != null) {
                                    NodeList nodeList = ((Element) nNode).getElementsByTagName("ControlledUserInfoTypeDate").item(0).getChildNodes();
                                    for (int k = 0; k < nodeList.getLength(); k++) {
                                        Node n = nodeList.item(k);
                                        if (n.getNodeType() == Node.ELEMENT_NODE) {
                                            ControlledUserInfoDate ctrlUserInfoDate = new ControlledUserInfoDate();
                                            ctrlUserInfoDate.setControlledUserInfoType(n.getNodeName());
                                            ctrlUserInfoDate.setControlledUserInfoDateValue(StringToTimeStamp(n.getNodeName(), n));
                                            userIDBioInfo.getControlledUserInfoDate().add(ctrlUserInfoDate);
                                        }
                                    }
                                }
                                if (((Element) nNode).getElementsByTagName("ControlledUserInfoTypeAddress").item(0) != null) {
                                    NodeList nodeList = ((Element) nNode).getElementsByTagName("ControlledUserInfoTypeAddress").item(0).getChildNodes();
                                    for (int k = 0; k < nodeList.getLength(); k++) {
                                        Node n = nodeList.item(k);
                                        if (n.getNodeType() == Node.ELEMENT_NODE) {
                                            ControlledUserInfoAddress ctrlUserInfoAddres = new ControlledUserInfoAddress();
                                            ctrlUserInfoAddres.setControlledUserInfoType(((Element) n).getFirstChild().getNodeName());
                                            ctrlUserInfoAddres.setControlledUserInfoAddressValue(((Element) n).getFirstChild().getTextContent());
                                            userIDBioInfo.getControlledUserInfoAddres().add(ctrlUserInfoAddres);
                                        }
                                    }
                                }

                            }
                        }
                        nNode = e.getElementsByTagName("TDLocation").item(0);
                        if (nNode != null) {
                            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                                TDLocation tdLocation = new TDLocation();
                                mr.setTdLocation(tdLocation);
                                tdLocation.setLatitude(Float.parseFloat(((Element) nNode).getElementsByTagName("Latitude").item(0).getTextContent()));
                                tdLocation.setLongitude(Float.parseFloat(((Element) nNode).getElementsByTagName("Longitude").item(0).getTextContent()));

                            }
                        }
                        nl = e.getElementsByTagName("UserIdInfo");

                        for (int j = 0; j < nl.getLength(); j++) {
                            nNode = nl.item(j);
                            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                                UserIDInfo userIdInfo = new UserIDInfo();
                                mr.getUserList().add(userIdInfo);
                                userIdInfo.setAnonUserID(((Element) nNode).getElementsByTagName("AnonUserID").item(0).getTextContent());
                                userIdInfo.setUserID(((Element) nNode).getElementsByTagName("UserID").item(0).getTextContent());
                                userIdInfo.setUserIDConfidence(Float.parseFloat(((Element) nNode).getElementsByTagName("UserIDConfidence").item(0).getTextContent()));
                                userIdInfo.setUserIDMethod(((Element) nNode).getElementsByTagName("UserIDMethod").item(0).getTextContent());
                            }

                        }

                        nl = e.getElementsByTagName("UserPresent");
                        for (int j = 0; j < nl.getLength(); j++) {
                            nNode = nl.item(j);
                            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                                UserPresent up = new UserPresent();
                                mr.getUserPresent().add(up);
                                up.setPresenceTime(StringToTimeStamp("PresenceTime", nNode));
                                up.setPresenceMethod(((Element) nNode).getElementsByTagName("PresenceMethod").item(0).getTextContent());
                                up.setPresenceConfidence(Float.parseFloat(((Element) nNode).getElementsByTagName("PresenceConfidence").item(0).getTextContent()));
                            }
                        }

                        nNode = e.getElementsByTagName("GenericUserInfo").item(0);
                        if (nNode != null) {
                            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                                nl = ((Element) nNode).getElementsByTagName("UserIDGenericInfo");
                                for (int j = 0; j < nl.getLength(); j++) {
                                    Node n = nl.item(j);
                                    if (n.getNodeType() == Node.ELEMENT_NODE) {
                                        UserIDGenericInfo userIDGenericInfo = new UserIDGenericInfo();
                                        mr.getGenericUserInfo().add(userIDGenericInfo);
                                        userIDGenericInfo.setAnonUserID(((Element) n).getElementsByTagName("AnonUserID").item(0).getTextContent());
                                        userIDGenericInfo.setUserID(((Element) n).getElementsByTagName("UserID").item(0).getTextContent());
                                        if (((Element) nNode).getElementsByTagName("GenericUserInfoString").item(0) != null) {
                                            NodeList list = ((Element) nNode).getElementsByTagName("GenericUserInfoString").item(0).getChildNodes();
                                            for (int k = 0; k < list.getLength(); k++) {
                                                Node auxNode = list.item(k);
                                                if (auxNode.getNodeType() == Node.ELEMENT_NODE) {
                                                    GenericUserInfo gui = new GenericUserInfo();
                                                    gui.setGenericUserInfoType(auxNode.getNodeName());
                                                    gui.setGenericUserInfoValue(auxNode.getTextContent());
                                                    userIDGenericInfo.getGenericUserinfo().add(gui);
                                                }
                                            }
                                        }
                                    }

                                }

                            }
                        }

                        nNode = e.getElementsByTagName("UserInfoChange").item(0);
                        if (nNode != null) {
                            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                                UserInfoChange uic = new UserInfoChange();
                                mr.setUserInfoChange(uic);
                                uic.setAnonUserID(((Element) nNode).getElementsByTagName("AnonUserID").item(0).getTextContent());
                                uic.setUserID(((Element) nNode).getElementsByTagName("UserID").item(0).getTextContent());
                                if (((Element) nNode).getElementsByTagName("ControlledUserInfoTypeString").item(0) != null) {
                                    NodeList nodeList = ((Element) nNode).getElementsByTagName("ControlledUserInfoTypeString").item(0).getChildNodes();
                                    for (int k = 0; k < nodeList.getLength(); k++) {
                                        Node n = nodeList.item(k);
                                        if (n.getNodeType() == Node.ELEMENT_NODE) {
                                            ControlledUserInfoString ctrlUserInfoString = new ControlledUserInfoString();
                                            ctrlUserInfoString.setControlledUserInfoType(((Element) n).getFirstChild().getNodeName());
                                            ctrlUserInfoString.setControlledUserInfoStringValue(((Element) n).getFirstChild().getTextContent());
                                            uic.getControlledUserInfoString().add(ctrlUserInfoString);
                                        }
                                    }
                                }
                                if (((Element) nNode).getElementsByTagName("ControlledUserInfoTypeDate").item(0) != null) {
                                    NodeList nodeList = ((Element) nNode).getElementsByTagName("ControlledUserInfoTypeDate").item(0).getChildNodes();
                                    for (int k = 0; k < nodeList.getLength(); k++) {
                                        Node n = nodeList.item(k);
                                        if (n.getNodeType() == Node.ELEMENT_NODE) {
                                            ControlledUserInfoDate ctrlUserInfoDate = new ControlledUserInfoDate();
                                            ctrlUserInfoDate.setControlledUserInfoType(((Element) n).getFirstChild().getNodeName());
                                            ctrlUserInfoDate.setControlledUserInfoDateValue(StringToTimeStamp(((Element) n).getFirstChild().getNodeName(), n));
                                            uic.getControlledUserInfoDate().add(ctrlUserInfoDate);
                                        }
                                    }
                                }
                                if (((Element) nNode).getElementsByTagName("ControlledUserInfoTypeAddress").item(0) != null) {
                                    NodeList nodeList = ((Element) nNode).getElementsByTagName("ControlledUserInfoTypeAddress").item(0).getChildNodes();
                                    for (int k = 0; k < nodeList.getLength(); k++) {
                                        Node n = nodeList.item(k);
                                        if (n.getNodeType() == Node.ELEMENT_NODE) {
                                            ControlledUserInfoAddress ctrlUserInfoAddres = new ControlledUserInfoAddress();
                                            ctrlUserInfoAddres.setControlledUserInfoType(((Element) n).getFirstChild().getNodeName());
                                            ctrlUserInfoAddres.setControlledUserInfoAddressValue(((Element) n).getFirstChild().getTextContent());
                                            uic.getControlledUserInfoAddress().add(ctrlUserInfoAddres);
                                        }
                                    }
                                }
                                if (((Element) nNode).getElementsByTagName("GenericUserInfoString").item(0) != null) {
                                    NodeList nodeList = ((Element) nNode).getElementsByTagName("GenericUserInfoString").item(0).getChildNodes();
                                    for (int k = 0; k < nodeList.getLength(); k++) {
                                        Node n = nodeList.item(k);
                                        if (n.getNodeType() == Node.ELEMENT_NODE) {
                                            GenericUserInfo gui = new GenericUserInfo();
                                            uic.getGenericUserInfo().add(gui);
                                            gui.setGenericUserInfoType(n.getNodeName());
                                            gui.setGenericUserInfoValue(n.getTextContent());
                                        }
                                    }
                                }

                            }
                        }

                        nNode = e.getElementsByTagName("PermitBlockedInfo").item(0);
                        if (nNode != null) {
                            if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                                PermitBlockedInfo pbi = new PermitBlockedInfo();
                                mr.setPermitBlockedInfo(pbi);
                                pbi.setPermissionLevelFlag(Short.parseShort(((Element) nNode).getElementsByTagName("PermissionLevelFlag").item(0).getTextContent()));
                                pbi.setTerminalDeviceTypeFlag(((Element) nNode).getElementsByTagName("TerminalDeviceTypeFlag").item(0).getTextContent());
                                pbi.setChannelFlag(Boolean.parseBoolean(((Element) nNode).getElementsByTagName("ChannelFlag").item(0).getTextContent()));
                                NodeList nodeList = e.getElementsByTagName("ContentClass");
                                AllContentClassExceptList allContentClassExcep = new AllContentClassExceptList();
                                pbi.setAllContentClassExceptList(allContentClassExcep);
                                for (int j = 0; j < nodeList.getLength(); j++) {
                                    Node auxNode = nodeList.item(j);
                                    if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                                        ContentClassDomain ccd = new ContentClassDomain();
                                        pbi.getAllContentClassExceptList().getContentClassDomain().add(ccd);
                                        ccd.setContentClassDomainValue(((Element) auxNode).getElementsByTagName("ContentClassDomain").item(0).getTextContent());
                                        NodeList list = e.getElementsByTagName("ContentClassID");
                                        for (int k = 0; k < list.getLength(); k++) {
                                            ccd.getContentclassID().add(((Element) auxNode).getElementsByTagName("ContentClassID").item(k).getTextContent());
                                        }
                                    }
                                }
                            }
                        }
                        nNode = e.getElementsByTagName("ChannelStart").item(0);
                        if (nNode != null) {
                            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                                
                                ChannelStart cs = new ChannelStart();
                                mr.setChannelStart(cs);
                                cs.setControlDevice(((Element) nNode).getElementsByTagName("ControlDevice").item(0).getTextContent());
                                cs.setStartNavMethod(((Element) nNode).getElementsByTagName("StartNavMethod").item(0).getTextContent());
                                cs.setPreviousServiceInstanceID(Integer.parseInt(((Element) nNode).getElementsByTagName("PreviousServiceInstanceID").item(0).getTextContent()));
                                cs.setServiceInstanceID(Integer.parseInt(((Element) nNode).getElementsByTagName("ServiceInstanceID").item(0).getTextContent()));
                                cs.setServiceIdentifier(((Element) nNode).getElementsByTagName("ServiceIdentifier").item(0).getTextContent());
                                cs.setViewMode(((Element) nNode).getElementsByTagName("ViewMode").item(0).getTextContent());
                                cs.setObscuration(((Element) nNode).getElementsByTagName("Obscuration").item(0).getTextContent());
                            }
                        }
                        if (nNode != null) {
                            nNode = e.getElementsByTagName("ChannelStop").item(0);
                            if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                                ChannelStop channelStop = new ChannelStop();
                                mr.setChannelStop(channelStop);
                                channelStop.setControlDevice(((Element) nNode).getElementsByTagName("ControlDevice").item(0).getTextContent());
                                channelStop.setStopNavMethod(((Element) nNode).getElementsByTagName("StopNavMethod").item(0).getTextContent());
                                channelStop.setServiceInstanceID(Integer.parseInt(((Element) nNode).getElementsByTagName("ServiceInstanceID").item(0).getTextContent()));
                            }
                        }

                        nl = e.getElementsByTagName("ChannelPlaying");

                        for (int j = 0; j < nl.getLength(); j++) {

                            Node nodeAux = nl.item(j);

                            System.out.println(j);
                            ChannelPlaying cp = new ChannelPlaying();

                            mr.getChannelPlaying().add(cp);

                            cp.setServiceIdentifer(((Element) nodeAux).getElementsByTagName("ServiceIdentifier").item(0).getTextContent());

                            cp.setServiceInstanceID(Integer.parseInt(((Element) nodeAux).getElementsByTagName("ServiceInstanceID").item(0).getTextContent()));

                        }
                    }

                }

                if (new AMReportPackageDAO().insertAMReportPckg(amReportPckg)) {
                    System.out.println("ok");
                } else {
                    System.out.println("not ok");
                }
            }

        } catch (ParserConfigurationException | SAXException | IOException ex) {
            Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }

    }

    private AMFCapabilityProfile parsingAMF(Document doc) {
        AMFCapabilityProfile amf = new AMFCapabilityProfile();
        NodeList nList = doc.getElementsByTagName("TransportProtocolMode");
        Node nNode;
        if (nList.getLength() > 0) {
            TransportCapabilitiesList t = new TransportCapabilitiesList();
            amf.setTransportCapabilitiesList(t);

            for (int i = 0; i < nList.getLength(); i++) {
                nNode = nList.item(i);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element e = (Element) nNode;
                    t.getTransportProtocolMode().add(e.getTextContent());

                }
            }

        }
        nList = doc.getElementsByTagName("CryptographicProtocol");
        if (nList.getLength() > 0) {
            SecurityCapabilities s = new SecurityCapabilities();
            amf.setSecurityCapabilities(s);
            for (int i = 0; i < nList.getLength(); i++) {
                nNode = nList.item(i);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element e = (Element) nNode;
                    s.getCryptographicProtocol().add(e.getTextContent());

                }
            }
        }

        nList = doc.getElementsByTagName("PermissionMode");
        if (nList.getLength() > 0) {
            PermissionOperationModes permissionOp = new PermissionOperationModes();
            amf.setPermissionOperationModes(permissionOp);
            for (int i = 0; i < nList.getLength(); i++) {
                nNode = nList.item(i);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element e = (Element) nNode;
                    permissionOp.getPermissionMode().add(e.getTextContent());
                }
            }
        }

        nList = doc.getElementsByTagName("ConfigurationMode");
        if (nList.getLength() > 0) {
            ConfigurationPackageDelivery config = new ConfigurationPackageDelivery();
            amf.setConfigurationPackageDelivery(config);
            for (int i = 0; i < nList.getLength(); i++) {
                nNode = nList.item(i);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element e = (Element) nNode;
                    config.getConfigurationMode().add(e.getTextContent());
                }
            }
        }
        MeasurementTriggerMethod mt = new MeasurementTriggerMethod();
        amf.setMeasurementTriggerMethod(mt);

        nList = doc.getElementsByTagName("EventTrigger");
        if (nList.getLength() > 0) {

            for (int i = 0; i < nList.getLength(); i++) {
                nNode = nList.item(i);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element e = (Element) nNode;
                    mt.getEventTrigger().add(e.getTextContent());
                }
            }
        }
        nList = doc.getElementsByTagName("TimeSampleTrigger");
        if (nList.getLength() > 0) {

            for (int i = 0; i < nList.getLength(); i++) {
                nNode = nList.item(i);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element e = (Element) nNode;
                    mt.getTimeSampleTrigger().add(e.getTextContent());
                }
            }
        }
        nList = doc.getElementsByTagName("ServiceStartTrigger");
        if (nList.getLength() > 0) {

            for (int i = 0; i < nList.getLength(); i++) {
                nNode = nList.item(i);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element e = (Element) nNode;
                    mt.getServiceStartTrigger().add(e.getTextContent());
                }
            }
        }

        nList = doc.getElementsByTagName("DeliveryMode");
        if (nList.getLength() > 0) {
            ReportDeliveryModes reportDeliveryMode = new ReportDeliveryModes();
            amf.setReportDeliveryModes(reportDeliveryMode);
            for (int i = 0; i < nList.getLength(); i++) {
                nNode = nList.item(i);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element e = (Element) nNode;

                    reportDeliveryMode.getDeliveryMode().add(e.getTextContent());
                }
            }
        }
        nList = doc.getElementsByTagName("OperationalManagement");
        if (nList.getLength() > 0) {
            OperationalManagementCapabilities operational = new OperationalManagementCapabilities();
            amf.setOperationalManagementCapabilities(operational);
            for (int i = 0; i < nList.getLength(); i++) {
                nNode = nList.item(i);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element e = (Element) nNode;
                    operational.getOperationalManagement().add(e.getTextContent());
                }
            }
        }
        nList = doc.getElementsByTagName("Compression");
        if (nList.getLength() > 0) {

            for (int i = 0; i < nList.getLength(); i++) {
                nNode = nList.item(i);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element e = (Element) nNode;
                    amf.getCompression().add(e.getTextContent());
                }
            }
        }
        return amf;
    }

    private Timestamp StringToTimeStamp(String elementName, Node nNode) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
            Date parsedDate = dateFormat.parse(((Element) nNode).getElementsByTagName(elementName).item(0).getTextContent());
            Timestamp timestamp = new java.sql.Timestamp(parsedDate.getTime());
            return timestamp;
        } catch (DOMException | ParseException excpt) {//this generic but you can control another types of exception
            System.err.println(excpt.getMessage());
        }
        return null;

    }

    boolean verifiyCapabilities(ConfigPackageRequest configPckRequest) {
        FileReader config;
        try {
            config = new FileReader("config.txt");
            BufferedReader lerArq = new BufferedReader(config);
            String linha;

            linha = lerArq.readLine();
            int counter = 0;
            while (linha != null) {
                String c[] = linha.split(":");
                String aux[] = c[1].split(",");

                boolean lock;

                switch (counter) {
                    case 0:
                        lock = false;

                        for (String s : aux) {
                            if (configPckRequest.getAmf().getTransportCapabilitiesList().getTransportProtocolMode().contains(s)) {
                                lock = true;
                                System.out.println(s);

                                break;
                            }

                        }
                        if (lock) {
                            break;
                        } else {
                            return false;
                        }

                    case 1:
                        lock = false;
                        for (String s : aux) {
                            if (configPckRequest.getAmf().getSecurityCapabilities().getCryptographicProtocol().contains(s)) {
                                lock = true;
                                System.out.println(s);

                                break;
                            }

                        }
                        if (lock) {
                            break;
                        } else {
                            return false;
                        }

                    case 2:
                        lock = false;
                        for (String s : aux) {
                            if (configPckRequest.getAmf().getPermissionOperationModes().getPermissionMode().contains(s)) {
                                lock = true;
                                System.out.println(s);
                                break;
                            }

                        }
                        if (lock) {
                            break;
                        } else {
                            return false;
                        }

                    case 3:
                        lock = false;

                        for (String s : aux) {
                            if (configPckRequest.getAmf().getConfigurationPackageDelivery().getConfigurationMode().contains(s)) {
                                lock = true;
                                System.out.println(s);

                                break;
                            }

                        }
                        if (lock) {

                            break;
                        } else {
                            return false;
                        }

                    case 4:
                        lock = false;
                        System.out.println(configPckRequest.getAmf().getReportDeliveryModes().getDeliveryMode().get(0));

                        for (String s : aux) {

                            if (configPckRequest.getAmf().getReportDeliveryModes().getDeliveryMode().contains(s)) {
                                lock = true;

                                break;
                            }

                        }
                        if (lock) {
                            break;
                        } else {
                            return false;
                        }
                    case 5:
                        lock = false;
                        for (String s : aux) {
                            if (configPckRequest.getAmf().getCompression().contains(s)) {
                                lock = true;
                                System.out.println(s);

                                break;
                            }

                        }
                        if (lock) {
                            break;
                        } else {
                            return false;
                        }
                }
                counter++;
                linha = lerArq.readLine();
            }

        } catch (IOException ex) {
            Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);

        }
        return true;
    }

}
