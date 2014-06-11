
package intraship.ws.de;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Pickup services.
 * 
 * <p>Java-Klasse für DDShipmentServiceGroupPickupType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DDShipmentServiceGroupPickupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="PickupSaturday" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           &lt;element name="PickupLate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "DDShipmentServiceGroupPickupType", namespace = "http://de.ws.intraship", propOrder = {
    "pickupLate",
    "pickupSaturday"
})
public class DDShipmentServiceGroupPickupType {

    @XmlElement(name = "PickupLate")
    protected Boolean pickupLate;
    @XmlElement(name = "PickupSaturday")
    protected Boolean pickupSaturday;

    /**
     * Ruft den Wert der pickupLate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPickupLate() {
        return pickupLate;
    }

    /**
     * Legt den Wert der pickupLate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPickupLate(Boolean value) {
        this.pickupLate = value;
    }

    /**
     * Ruft den Wert der pickupSaturday-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPickupSaturday() {
        return pickupSaturday;
    }

    /**
     * Legt den Wert der pickupSaturday-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPickupSaturday(Boolean value) {
        this.pickupSaturday = value;
    }

}
