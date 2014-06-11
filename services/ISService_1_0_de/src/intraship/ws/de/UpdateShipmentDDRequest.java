
package intraship.ws.de;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import intrashipservice.ws.de.isservice_1_0_de.ShipmentNumberTypeType;
import intrashipservice.ws.de.isservice_1_0_de.Version;


/**
 * <p>Java-Klasse f�r anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://dhl.de/webservice/cisbase}Version"/>
 *         &lt;element name="ShipmentNumber" type="{http://dhl.de/webservice/cisbase}ShipmentNumberType"/>
 *         &lt;element name="ShipmentOrder" type="{http://de.ws.intraship}ShipmentOrderDDType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "version",
    "shipmentNumber",
    "shipmentOrder"
})
@XmlRootElement(name = "UpdateShipmentDDRequest", namespace = "http://de.ws.intraship")
public class UpdateShipmentDDRequest {

    @XmlElement(name = "Version", namespace = "http://dhl.de/webservice/cisbase", required = true)
    protected Version version;
    @XmlElement(name = "ShipmentNumber", required = true)
    protected ShipmentNumberTypeType shipmentNumber;
    @XmlElement(name = "ShipmentOrder", required = true)
    protected ShipmentOrderDDType shipmentOrder;

    /**
     * The version of the webservice implementation
     * 							for which the requesting client is developed.
     * 
     * @return
     *     possible object is
     *     {@link Version }
     *     
     */
    public Version getVersion() {
        return version;
    }

    /**
     * Legt den Wert der version-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Version }
     *     
     */
    public void setVersion(Version value) {
        this.version = value;
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
     * Ruft den Wert der shipmentOrder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentOrderDDType }
     *     
     */
    public ShipmentOrderDDType getShipmentOrder() {
        return shipmentOrder;
    }

    /**
     * Legt den Wert der shipmentOrder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentOrderDDType }
     *     
     */
    public void setShipmentOrder(ShipmentOrderDDType value) {
        this.shipmentOrder = value;
    }

}
