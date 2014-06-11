
package intraship.ws.de;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * DD shipment services.
 * 
 * <p>Java-Klasse für ShipmentServiceDD complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ShipmentServiceDD">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="ServiceGroupDateTimeOption" type="{http://de.ws.intraship}DDServiceGroupDateTimeOptionType"/>
 *           &lt;element name="ShipmentServiceGroupIdent" type="{http://de.ws.intraship}DDShipmentServiceGroupIdentType"/>
 *           &lt;element name="ShipmentServiceGroupPickup" type="{http://de.ws.intraship}DDShipmentServiceGroupPickupType"/>
 *           &lt;element name="ServiceGroupBusinessPackInternational" type="{http://de.ws.intraship}DDServiceGroupBusinessPackInternationalType"/>
 *           &lt;element name="ServiceGroupDHLPaket" type="{http://de.ws.intraship}DDServiceGroupDHLPaketType"/>
 *           &lt;element name="ServiceGroupOther" type="{http://de.ws.intraship}DDServiceGroupOtherType"/>
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
@XmlType(name = "ShipmentServiceDD", namespace = "http://de.ws.intraship", propOrder = {
    "serviceGroupOther",
    "serviceGroupDHLPaket",
    "serviceGroupBusinessPackInternational",
    "shipmentServiceGroupPickup",
    "shipmentServiceGroupIdent",
    "serviceGroupDateTimeOption"
})
public class ShipmentServiceDD {

    @XmlElement(name = "ServiceGroupOther")
    protected DDServiceGroupOtherType serviceGroupOther;
    @XmlElement(name = "ServiceGroupDHLPaket")
    protected DDServiceGroupDHLPaketType serviceGroupDHLPaket;
    @XmlElement(name = "ServiceGroupBusinessPackInternational")
    protected DDServiceGroupBusinessPackInternationalType serviceGroupBusinessPackInternational;
    @XmlElement(name = "ShipmentServiceGroupPickup")
    protected DDShipmentServiceGroupPickupType shipmentServiceGroupPickup;
    @XmlElement(name = "ShipmentServiceGroupIdent")
    protected DDShipmentServiceGroupIdentType shipmentServiceGroupIdent;
    @XmlElement(name = "ServiceGroupDateTimeOption")
    protected DDServiceGroupDateTimeOptionType serviceGroupDateTimeOption;

    /**
     * Ruft den Wert der serviceGroupOther-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DDServiceGroupOtherType }
     *     
     */
    public DDServiceGroupOtherType getServiceGroupOther() {
        return serviceGroupOther;
    }

    /**
     * Legt den Wert der serviceGroupOther-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DDServiceGroupOtherType }
     *     
     */
    public void setServiceGroupOther(DDServiceGroupOtherType value) {
        this.serviceGroupOther = value;
    }

    /**
     * Ruft den Wert der serviceGroupDHLPaket-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DDServiceGroupDHLPaketType }
     *     
     */
    public DDServiceGroupDHLPaketType getServiceGroupDHLPaket() {
        return serviceGroupDHLPaket;
    }

    /**
     * Legt den Wert der serviceGroupDHLPaket-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DDServiceGroupDHLPaketType }
     *     
     */
    public void setServiceGroupDHLPaket(DDServiceGroupDHLPaketType value) {
        this.serviceGroupDHLPaket = value;
    }

    /**
     * Ruft den Wert der serviceGroupBusinessPackInternational-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DDServiceGroupBusinessPackInternationalType }
     *     
     */
    public DDServiceGroupBusinessPackInternationalType getServiceGroupBusinessPackInternational() {
        return serviceGroupBusinessPackInternational;
    }

    /**
     * Legt den Wert der serviceGroupBusinessPackInternational-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DDServiceGroupBusinessPackInternationalType }
     *     
     */
    public void setServiceGroupBusinessPackInternational(DDServiceGroupBusinessPackInternationalType value) {
        this.serviceGroupBusinessPackInternational = value;
    }

    /**
     * Ruft den Wert der shipmentServiceGroupPickup-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DDShipmentServiceGroupPickupType }
     *     
     */
    public DDShipmentServiceGroupPickupType getShipmentServiceGroupPickup() {
        return shipmentServiceGroupPickup;
    }

    /**
     * Legt den Wert der shipmentServiceGroupPickup-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DDShipmentServiceGroupPickupType }
     *     
     */
    public void setShipmentServiceGroupPickup(DDShipmentServiceGroupPickupType value) {
        this.shipmentServiceGroupPickup = value;
    }

    /**
     * Ruft den Wert der shipmentServiceGroupIdent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DDShipmentServiceGroupIdentType }
     *     
     */
    public DDShipmentServiceGroupIdentType getShipmentServiceGroupIdent() {
        return shipmentServiceGroupIdent;
    }

    /**
     * Legt den Wert der shipmentServiceGroupIdent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DDShipmentServiceGroupIdentType }
     *     
     */
    public void setShipmentServiceGroupIdent(DDShipmentServiceGroupIdentType value) {
        this.shipmentServiceGroupIdent = value;
    }

    /**
     * Ruft den Wert der serviceGroupDateTimeOption-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DDServiceGroupDateTimeOptionType }
     *     
     */
    public DDServiceGroupDateTimeOptionType getServiceGroupDateTimeOption() {
        return serviceGroupDateTimeOption;
    }

    /**
     * Legt den Wert der serviceGroupDateTimeOption-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DDServiceGroupDateTimeOptionType }
     *     
     */
    public void setServiceGroupDateTimeOption(DDServiceGroupDateTimeOptionType value) {
        this.serviceGroupDateTimeOption = value;
    }

}
