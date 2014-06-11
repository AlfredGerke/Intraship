
package intraship.ws.de;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import intrashipservice.ws.de.isservice_1_0_de.ShipmentNumberTypeType;


/**
 * The status of the getLabel operation and the url for requesting the label (if available)
 * 
 * <p>Java-Klasse für ExportDocData complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ExportDocData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShipmentNumber" type="{http://dhl.de/webservice/cisbase}ShipmentNumberType"/>
 *         &lt;element name="Status" type="{http://de.ws.intraship}Statusinformation"/>
 *         &lt;choice>
 *           &lt;element name="ExportDocPDFData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="ExportDocURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportDocData", namespace = "http://de.ws.intraship", propOrder = {
    "shipmentNumber",
    "status",
    "exportDocURL",
    "exportDocPDFData"
})
public class ExportDocData {

    @XmlElement(name = "ShipmentNumber", required = true)
    protected ShipmentNumberTypeType shipmentNumber;
    @XmlElement(name = "Status", required = true)
    protected Statusinformation status;
    @XmlElement(name = "ExportDocURL")
    protected String exportDocURL;
    @XmlElement(name = "ExportDocPDFData")
    protected String exportDocPDFData;

    /**
     * Ruft den Wert der shipmentNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentNumberTypeType }
     *     
     */
    public ShipmentNumberTypeType getShipmentNumber() {
        return shipmentNumber;
    }

    /**
     * Legt den Wert der shipmentNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentNumberTypeType }
     *     
     */
    public void setShipmentNumber(ShipmentNumberTypeType value) {
        this.shipmentNumber = value;
    }

    /**
     * Ruft den Wert der status-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Statusinformation }
     *     
     */
    public Statusinformation getStatus() {
        return status;
    }

    /**
     * Legt den Wert der status-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Statusinformation }
     *     
     */
    public void setStatus(Statusinformation value) {
        this.status = value;
    }

    /**
     * Ruft den Wert der exportDocURL-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportDocURL() {
        return exportDocURL;
    }

    /**
     * Legt den Wert der exportDocURL-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExportDocURL(String value) {
        this.exportDocURL = value;
    }

    /**
     * Ruft den Wert der exportDocPDFData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportDocPDFData() {
        return exportDocPDFData;
    }

    /**
     * Legt den Wert der exportDocPDFData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExportDocPDFData(String value) {
        this.exportDocPDFData = value;
    }

}
