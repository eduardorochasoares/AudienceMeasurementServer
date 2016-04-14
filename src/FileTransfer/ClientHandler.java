/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileTransfer;

import DAO.ConfigPackageRequestDAO;
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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
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
                AMFCapabilityProfile amf = new AMFCapabilityProfile();
                configPckgRequest.setAmf(amf);
                nList = doc.getElementsByTagName("TransportProtocolMode");
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
                if (new ConfigPackageRequestDAO().insertConfigPkg(configPckgRequest)) {
                    System.out.println("ok");
                } else {
                    System.out.println("not ok");
                }
            }
            if ("AMReportPackage".equals(doc.getDocumentElement().getNodeName())) {
                System.out.println("Documento de Medicao");
                
                
                
            }

        } catch (ParserConfigurationException | SAXException | IOException ex) {
            Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
