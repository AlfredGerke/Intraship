
package intraship.ws.de;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import intrashipservice.ws.de.isservice_1_0_de.ShipmentNumberTypeType;


/**
 * The status of the getLabel operation and the url
 * 				for requesting the label (if available).
 * 
 * <p>Java-Klasse für LabelData complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LabelData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShipmentNumber" type="{http://dhl.de/webservice/cisbase}ShipmentNumberType"/>
 *         &lt;element name="Status" type="{http://de.ws.intraship}Statusinformation"/>
 *         &lt;element name="Labelurl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XMLLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LabelData", namespace = "http://de.ws.intraship", propOrder = {
    "shipmentNumber",
    "status",
    "labelurl",
    "xmlLabel"
})
public class LabelData {

    @XmlElement(name = "ShipmentNumber", required = true)
    protected ShipmentNumberTypeType shipmentNumber;
    @XmlElement(name = "Status", required = true)
    protected Statusinformation status;
    @XmlElement(name = "Labelurl")
    protected String labelurl;
    @XmlElement(name = "XMLLabel")
    protected String xmlLabel;

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
     * Ruft den Wert der labelurl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelurl() {
        return labelurl;
    }

    /**
     * Legt den Wert der labelurl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelurl(String value) {
        this.labelurl = value;
    }

    /**
     * Ruft den Wert der xmlLabel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXMLLabel() {
        return xmlLabel;
    }

    /**
     * Legt den Wert der xmlLabel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXMLLabel(String value) {
        this.xmlLabel = value;
    }

}
