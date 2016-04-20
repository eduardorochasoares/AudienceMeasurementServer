/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileTransfer;

import DAO.ConfigPackageRequestDAO;
import Model.AMReportPackage.AMReportPackage;
import Model.AMReportPackage.AudioAmplifierInformation;
import Model.AMReportPackage.AudioFocus;
import Model.AMReportPackage.AudioLanguageChange;
import Model.AMReportPackage.AudioVolume;
import Model.AMReportPackage.CaptionLanguageChange;
import Model.AMReportPackage.ConfigurationChange;
import Model.AMReportPackage.MeasurementReport;
import Model.AMReportPackage.StorageCongestionImpactedService;
import Model.AMReportPackage.TVInformation;
import Model.AMReportPackage.VideoObscure;
import Model.AMReportPackage.VideoResize;
import Model.AMReportPackage.VideoZoom;
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
import java.io.FileOutputStream;
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

                if (new ConfigPackageRequestDAO().insertConfigPkg(configPckgRequest)) {
                    System.out.println("ok");
                } else {
                    System.out.println("not ok");
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
                    StorageCongestionImpactedService s = new StorageCongestionImpactedService();
                    amReportPckg.getStorageCongestionImpactedService().add(s);
                    if (nNode.getNodeType() == Node.ELEMENT_NODE) {
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
                        try {
                            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                            Date parsedDate = dateFormat.parse(e.getElementsByTagName("MeasurementReportTime").item(0).getTextContent());
                            Timestamp timestamp = new java.sql.Timestamp(parsedDate.getTime());
                            mr.setMeasurementReportTriggerTime(timestamp);
                        } catch (DOMException | ParseException excpt) {//this generic but you can control another types of exception
                            System.err.println(excpt.getMessage());
                        }
                        mr.setDisplayStatus(e.getElementsByTagName("DisplayStatus").item(0).getTextContent());

                        nNode = e.getElementsByTagName("AudioFocus").item(0);
                        if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                            AudioFocus af = new AudioFocus();
                            mr.setAudioFocus(af);
                            af.setServiceInstanceID(Integer.parseInt(((Element) nNode).getElementsByTagName("ServiceInstanceID").item(0).getTextContent()));
                            af.setIptvFocus(Boolean.parseBoolean(((Element) nNode).getElementsByTagName("IPTVFocus").item(0).getTextContent()));
                        }

                        nNode = e.getElementsByTagName("CaptionLanguageChange").item(0);
                        if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                            CaptionLanguageChange clc = new CaptionLanguageChange();
                            mr.setCaptionLanguageChange(clc);
                            clc.setServiceInstanceID(Integer.parseInt(((Element) nNode).getElementsByTagName("ServiceInstanceID").item(0).getTextContent()));
                            clc.setCaptionLanguge(((Element) nNode).getElementsByTagName("CaptionLanguageChange").item(0).getTextContent());
                        }

                        nNode = e.getElementsByTagName("AudioLanguageChange").item(0);
                        if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                            AudioLanguageChange alc = new AudioLanguageChange();
                            mr.setAudioLanguageChange(alc);
                            alc.setServiceInstanceID(Integer.parseInt(((Element) nNode).getElementsByTagName("ServiceInstanceID").item(0).getTextContent()));
                            alc.setAudioLanguage(((Element) nNode).getElementsByTagName("AudioLanguage").item(0).getTextContent());

                        }

                        nNode = e.getElementsByTagName("AudioVolume").item(0);
                        if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                            AudioVolume av = new AudioVolume();
                            mr.setAudioVolume(av);
                            av.setServiceInstanceID(Integer.parseInt(((Element) nNode).getElementsByTagName("ServiceInstanceID").item(0).getTextContent()));
                            av.setVolumeDirection(((Element) nNode).getElementsByTagName("VolumeDirection").item(0).getTextContent());
                        }

                        nNode = e.getElementsByTagName("ConfigurationChange").item(0);
                        if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                            ConfigurationChange cg = new ConfigurationChange();
                            mr.setConfigChange(cg);

                            Element element = (Element) nNode;

                            nNode = element.getElementsByTagName("AMFCapabilityProfile").item(0);
                            if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                                cg.setAmfCapabilityProfile(parsingAMF(doc));

                            }
                            nNode = element.getElementsByTagName("TVInformation").item(0);
                            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                                TVInformation tvInfo = new TVInformation();
                                cg.setTvInformation(tvInfo);
                                tvInfo.setTvManuf(((Element) nNode).getElementsByTagName("TVManuf").item(0).getTextContent());
                                tvInfo.settVModel(((Element) nNode).getElementsByTagName("TVModel").item(0).getTextContent());
                                tvInfo.settVSerialNum(((Element) nNode).getElementsByTagName("TVSerialNum").item(0).getTextContent());
                            }

                            nNode = element.getElementsByTagName("AudioAmplifier").item(0);
                            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                                AudioAmplifierInformation aai = new AudioAmplifierInformation();
                                cg.setAudioAmpliInfo(aai);
                                aai.setAudioAmplifierManuf(((Element) nNode).getElementsByTagName("AudioAmplifierManuf").item(0).getTextContent());
                                aai.setAudioAmplifierModel(((Element) nNode).getElementsByTagName("AudioAmplifierModel").item(0).getTextContent());
                                aai.setAudioAmplifierSerialNum(((Element) nNode).getElementsByTagName("AudioAmplifierSerialNum").item(0).getTextContent());

                            }
                            nNode = e.getElementsByTagName("VideoObscure").item(0);
                            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                                VideoObscure vo = new VideoObscure();
                                mr.setVideoObscure(vo);
                                vo.setServiceInstanceID(Integer.parseInt(((Element) nNode).getElementsByTagName("ServiceInstanceID").item(0).getTextContent()));
                                vo.setObscuration(Float.parseFloat(((Element) nNode).getElementsByTagName("Obscuration").item(0).getTextContent()));

                            }

                            nNode = e.getElementsByTagName("VideoZoom").item(0);
                            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                                VideoZoom vz = new VideoZoom();
                                mr.setVideoZoom(vz);
                                vz.setServiceInstanceID(Integer.parseInt(((Element) nNode).getElementsByTagName("ServiceInstanceID").item(0).getTextContent()));
                                vz.setZoomFactor(Float.parseFloat(((Element) nNode).getElementsByTagName("ZoomFactor").item(0).getTextContent()));
                            }
                            nNode = e.getElementsByTagName("VideoResize").item(0);
                            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                                VideoResize vr = new VideoResize();
                                mr.setVideoResize(vr);
                                vr.setServiceInstanceID(Integer.parseInt(((Element) nNode).getElementsByTagName("ServiceInstanceID").item(0).getTextContent()));
                                vr.setImageHeight(Integer.parseInt(((Element) nNode).getElementsByTagName("ImageHeight").item(0).getTextContent()));
                                vr.setImageWidth(Integer.parseInt(((Element) nNode).getElementsByTagName("ImageWidth").item(0).getTextContent()));

                            }

                        }

                    }

                }
            }

        } catch (ParserConfigurationException | SAXException | IOException ex) {
            Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
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

}
