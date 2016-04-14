/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.MeasurementReportRequestXML;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
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
public class MeasurementReportRequest {

    private List<Integer> measurementRequestID = new ArrayList<>();
    private DocumentBuilderFactory docFactory;
    private Element rootElement;

    public MeasurementReportRequest(List<Integer> measurementRequestID) {
        this.measurementRequestID = measurementRequestID;
    }

    public void createMeasurementReportRequest() {
        DocumentBuilderFactory documentFactory = DocumentBuilderFactory
                .newInstance();
        DocumentBuilder dBuilder;
        try {
            dBuilder = documentFactory.newDocumentBuilder();
            Document doc = dBuilder.newDocument();

            rootElement = doc.createElement("MeasurementReportRequest");
            doc.appendChild(rootElement);
            addMeasurementReportRequest(doc);
            writeXML(doc);

        } catch (ParserConfigurationException ex) {
            Logger.getLogger(Model.ErrorMessageXML.Error.class.getName()).log(Level.SEVERE, null, ex);
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
            transformer.transform(source, result);

        } catch (TransformerException ex) {
            Logger.getLogger(EndUserElementsXML.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void addMeasurementReportRequest(Document doc) {
        for (Integer i : measurementRequestID) {

            Element aux = doc.createElement("MeasurementRequestID");
            rootElement.appendChild(aux);
            aux.appendChild(doc.createTextNode(Integer.toString(i)));
        }
    }

    /**
     * @return the measurementRequestID
     */
    public List<Integer> getMeasurementRequestID() {
        return measurementRequestID;
    }

    /**
     * @param measurementRequestID the measurementRequestID to set
     */
    public void setMeasurementRequestID(List<Integer> measurementRequestID) {
        this.measurementRequestID = measurementRequestID;
    }

    /**
     * @return the docFactory
     */
    public DocumentBuilderFactory getDocFactory() {
        return docFactory;
    }

    /**
     * @param docFactory the docFactory to set
     */
    public void setDocFactory(DocumentBuilderFactory docFactory) {
        this.docFactory = docFactory;
    }

    /**
     * @return the rootElement
     */
    public Element getRootElement() {
        return rootElement;
    }

    /**
     * @param rootElement the rootElement to set
     */
    public void setRootElement(Element rootElement) {
        this.rootElement = rootElement;
    }

}
