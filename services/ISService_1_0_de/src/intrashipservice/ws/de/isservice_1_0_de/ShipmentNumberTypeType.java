
package intrashipservice.ws.de.isservice_1_0_de;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type of shipment number (IDC, LP)
 * 
 * <p>Java-Klasse für ShipmentNumberType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ShipmentNumberType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://dhl.de/webservice/cisbase}identCode"/>
 *         &lt;element ref="{http://dhl.de/webservice/cisbase}licensePlate"/>
 *         &lt;element ref="{http://dhl.de/webservice/cisbase}airwayBill"/>
 *         &lt;element ref="{http://dhl.de/webservice/cisbase}shipmentNumber"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentNumberType", namespace = "http://dhl.de/webservice/cisbase", propOrder = {
    "shipmentNumber",
    "airwayBill",
    "licensePlate",
    "identCode"
})
public class ShipmentNumberTypeType {

    @XmlElement(namespace = "http://dhl.de/webservice/cisbase")
    protected String shipmentNumber;
    @XmlElement(namespace = "http://dhl.de/webservice/cisbase")
    protected String airwayBill;
    @XmlElement(namespace = "http://dhl.de/webservice/cisbase")
    protected String licensePlate;
    @XmlElement(namespace = "http://dhl.de/webservice/cisbase")
    protected String identCode;

    /**
     * Ruft den Wert der shipmentNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentNumber() {
        return shipmentNumber;
    }

    /**
     * Legt den Wert der shipmentNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentNumber(String value) {
        this.shipmentNumber = value;
    }

    /**
     * Airway Bill Number 
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirwayBill() {
        return airwayBill;
    }

    /**
     * Legt den Wert der airwayBill-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirwayBill(String value) {
        this.airwayBill = value;
    }

    /**
     * Ruft den Wert der licensePlate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicensePlate() {
        return licensePlate;
    }

    /**
     * Legt den Wert der licensePlate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicensePlate(String value) {
        this.licensePlate = value;
    }

    /**
     * Ruft den Wert der identCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentCode() {
        return identCode;
    }

    /**
     * Legt den Wert der identCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentCode(String value) {
        this.identCode = value;
    }

}
