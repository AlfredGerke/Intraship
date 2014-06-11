
package intraship.ws.de;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import intrashipservice.ws.de.isservice_1_0_de.ShipmentNumberTypeType;


/**
 * The operation's success status for every single ShipmentOrder will be returned by one CreationState element. It is identifiable via SequenceNumber.
 * 			
 * 
 * <p>Java-Klasse für CreationState complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CreationState">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StatusCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="StatusMessage" maxOccurs="999" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SequenceNumber" type="{http://de.ws.intraship}SequenceNumber"/>
 *         &lt;element name="ShipmentNumber" type="{http://dhl.de/webservice/cisbase}ShipmentNumberType" minOccurs="0"/>
 *         &lt;element name="PieceInformation" type="{http://de.ws.intraship}PieceInformation" maxOccurs="999" minOccurs="0"/>
 *         &lt;element name="Labelurl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XMLLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PickupConfirmationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreationState", namespace = "http://de.ws.intraship", propOrder = {
    "statusCode",
    "statusMessages",
    "sequenceNumber",
    "shipmentNumber",
    "pieceInformations",
    "labelurl",
    "xmlLabel",
    "pickupConfirmationNumber"
})
public class CreationState {

    @XmlElement(name = "StatusCode", required = true)
    protected String statusCode;
    @XmlElement(name = "StatusMessage")
    protected List<String> statusMessages;
    @XmlElement(name = "SequenceNumber", required = true)
    protected String sequenceNumber;
    @XmlElement(name = "ShipmentNumber")
    protected ShipmentNumberTypeType shipmentNumber;
    @XmlElement(name = "PieceInformation")
    protected List<PieceInformation> pieceInformations;
    @XmlElement(name = "Labelurl")
    protected String labelurl;
    @XmlElement(name = "XMLLabel")
    protected String xmlLabel;
    @XmlElement(name = "PickupConfirmationNumber")
    protected String pickupConfirmationNumber;

    /**
     * Ruft den Wert der statusCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Legt den Wert der statusCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the statusMessages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusMessages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusMessages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStatusMessages() {
        if (statusMessages == null) {
            statusMessages = new ArrayList<String>();
        }
        return this.statusMessages;
    }

    /**
     * Ruft den Wert der sequenceNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Legt den Wert der sequenceNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequenceNumber(String value) {
        this.sequenceNumber = value;
    }

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
     * Gets the value of the pieceInformations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pieceInformations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPieceInformations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PieceInformation }
     * 
     * 
     */
    public List<PieceInformation> getPieceInformations() {
        if (pieceInformations == null) {
            pieceInformations = new ArrayList<PieceInformation>();
        }
        return this.pieceInformations;
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

    /**
     * Ruft den Wert der pickupConfirmationNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickupConfirmationNumber() {
        return pickupConfirmationNumber;
    }

    /**
     * Legt den Wert der pickupConfirmationNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickupConfirmationNumber(String value) {
        this.pickupConfirmationNumber = value;
    }

    /**
     * Sets the value of the statusMessages property.
     * 
     * @param statusMessages
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusMessages(List<String> statusMessages) {
        this.statusMessages = statusMessages;
    }

    /**
     * Sets the value of the pieceInformations property.
     * 
     * @param pieceInformations
     *     allowed object is
     *     {@link PieceInformation }
     *     
     */
    public void setPieceInformations(List<PieceInformation> pieceInformations) {
        this.pieceInformations = pieceInformations;
    }

}
