
package intraship.ws.de;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="ShipmentOrder" type="{http://de.ws.intraship}ShipmentOrderTDType" maxOccurs="999"/>
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
    "shipmentOrders"
})
@XmlRootElement(name = "CreateShipmentTDRequest", namespace = "http://de.ws.intraship")
public class CreateShipmentTDRequest {

    @XmlElement(name = "Version", namespace = "http://dhl.de/webservice/cisbase", required = true)
    protected Version version;
    @XmlElement(name = "ShipmentOrder", required = true)
    protected List<ShipmentOrderTDType> shipmentOrders;

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
     * Gets the value of the shipmentOrders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentOrders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentOrders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentOrderTDType }
     * 
     * 
     */
    public List<ShipmentOrderTDType> getShipmentOrders() {
        if (shipmentOrders == null) {
            shipmentOrders = new ArrayList<ShipmentOrderTDType>();
        }
        return this.shipmentOrders;
    }

    /**
     * Sets the value of the shipmentOrders property.
     * 
     * @param shipmentOrders
     *     allowed object is
     *     {@link ShipmentOrderTDType }
     *     
     */
    public void setShipmentOrders(List<ShipmentOrderTDType> shipmentOrders) {
        this.shipmentOrders = shipmentOrders;
    }

}
