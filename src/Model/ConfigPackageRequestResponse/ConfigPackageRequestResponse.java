/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.ConfigPackageRequestResponse;

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
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import Model.tdElementsXML.EndUserElementsXML;

/**
 *
 * @author Principal
 */
public class ConfigPackageRequestResponse {

    private int configurationPackageCheckDelay;
    private Directive immediateMeasurementDirective;
    private Directive futureMeasurementDirective;
    /**
     * @return the configurationPackageCheckDelay
     */
    private Element raiz;
    private static DocumentBuilderFactory docFactory;

    public ConfigPackageRequestResponse(Directive immediateMeasurementDirective,
            Directive futureMeasurementDirective, int configurationPackageCheckDelay) {
        this.immediateMeasurementDirective = immediateMeasurementDirective;
        this.futureMeasurementDirective = futureMeasurementDirective;
        this.configurationPackageCheckDelay = configurationPackageCheckDelay;

    }

    public void createConfigPkgRequestResponseXML() {

        docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = null;
        try {
            docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.newDocument();
            raiz = doc.createElement("ConfigPackageRequestResponse");
            doc.appendChild(raiz);
            addElementosRaiz(doc);
            addImmediateMeasurement(doc);
            addFutureMeasurementDirective(doc);
            writeXML(doc);

        } catch (ParserConfigurationException ex) {
            Logger.getLogger(ConfigPackageRequestResponse.class
                    .getName()).log(Level.SEVERE, null, ex);
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
                = new StreamResult(new File("C:\\Users\\Principal\\Desktop\\ConfigPackageRequestResponse.xml"));
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

    public void addElementosRaiz(Document doc) {
        Element filho = doc.createElement("ConfigurationPackageCheckDelay");
        raiz.appendChild(filho);
        filho.appendChild(doc.createTextNode(Integer.toString(configurationPackageCheckDelay)));

    }

    public void addImmediateMeasurement(Document doc) {
        if (immediateMeasurementDirective != null) {
            Element im = doc.createElement("ImmediateMeasurementDirective");
            Element filho;
            filho = doc.createElement("Code");
            im.appendChild(filho);
            filho.appendChild(doc.createTextNode(Integer.toString(immediateMeasurementDirective.getCode().getCode())));
            if (immediateMeasurementDirective.getaMFConfigPackage() != null) {
                im = immediateMeasurementDirective.getaMFConfigPackage().createAmfConfig(doc, im);

            }
            raiz.appendChild(im);
        }
    }

    public void addFutureMeasurementDirective(Document doc) {
        if (futureMeasurementDirective != null) {
            Element f = doc.createElement("FutureMeasurementDirective");
            Element filho;
            filho = doc.createElement("Code");
            f.appendChild(filho);
            filho.appendChild(doc.createTextNode(Integer.toString(futureMeasurementDirective.getCode().getCode())));
            if (futureMeasurementDirective.getaMFConfigPackage() != null) {
                f = futureMeasurementDirective.getaMFConfigPackage().createAmfConfig(doc, f);
            }
            raiz.appendChild(f);
        }
    }

    public int getConfigurationPackageCheckDelay() {
        return configurationPackageCheckDelay;
    }

    /**
     * @param configurationPackageCheckDelay the configurationPackageCheckDelay
     * to set
     */
    public void setConfigurationPackageCheckDelay(int configurationPackageCheckDelay) {
        this.configurationPackageCheckDelay = configurationPackageCheckDelay;
    }

    /**
     * @return the futureMeasurementDirective
     */
    public Directive getFutureMeasurementDirective() {
        return futureMeasurementDirective;
    }

    /**
     * @param futureMeasurementDirective the futureMeasurementDirective to set
     */
    public void setFutureMeasurementDirective(Directive futureMeasurementDirective) {
        this.futureMeasurementDirective = futureMeasurementDirective;
    }

    /**
     * @return the immediateMeasurementDirective
     */
    public Directive getImmediateMeasurementDirective() {
        return immediateMeasurementDirective;
    }

    /**
     * @param immediateMeasurementDirective the immediateMeasurementDirective to
     * set
     */
    public void setImmediateMeasurementDirective(Directive immediateMeasurementDirective) {
        this.immediateMeasurementDirective = immediateMeasurementDirective;
    }

}
