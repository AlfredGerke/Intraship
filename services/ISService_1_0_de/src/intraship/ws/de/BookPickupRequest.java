
package intraship.ws.de;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import intrashipservice.ws.de.isservice_1_0_de.Version;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://dhl.de/webservice/cisbase}Version"/>
 *         &lt;element name="BookingInformation" type="{http://de.ws.intraship}PickupBookingInformationType"/>
 *         &lt;element name="PickupAddress" type="{http://de.ws.intraship}PickupAddressType"/>
 *         &lt;element name="ContactOrderer" type="{http://de.ws.intraship}PickupOrdererType" minOccurs="0"/>
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
    "bookingInformation",
    "pickupAddress",
    "contactOrderer"
})
@XmlRootElement(name = "BookPickupRequest", namespace = "http://de.ws.intraship")
public class BookPickupRequest {

    @XmlElement(name = "Version", namespace = "http://dhl.de/webservice/cisbase", required = true)
    protected Version version;
    @XmlElement(name = "BookingInformation", required = true)
    protected PickupBookingInformationType bookingInformation;
    @XmlElement(name = "PickupAddress", required = true)
    protected PickupAddressType pickupAddress;
    @XmlElement(name = "ContactOrderer")
    protected PickupOrdererType contactOrderer;

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
     * Ruft den Wert der bookingInformation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PickupBookingInformationType }
     *     
     */
    public PickupBookingInformationType getBookingInformation() {
        return bookingInformation;
    }

    /**
     * Legt den Wert der bookingInformation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PickupBookingInformationType }
     *     
     */
    public void setBookingInformation(PickupBookingInformationType value) {
        this.bookingInformation = value;
    }

    /**
     * Ruft den Wert der pickupAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PickupAddressType }
     *     
     */
    public PickupAddressType getPickupAddress() {
        return pickupAddress;
    }

    /**
     * Legt den Wert der pickupAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PickupAddressType }
     *     
     */
    public void setPickupAddress(PickupAddressType value) {
        this.pickupAddress = value;
    }

    /**
     * Ruft den Wert der contactOrderer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PickupOrdererType }
     *     
     */
    public PickupOrdererType getContactOrderer() {
        return contactOrderer;
    }

    /**
     * Legt den Wert der contactOrderer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PickupOrdererType }
     *     
     */
    public void setContactOrderer(PickupOrdererType value) {
        this.contactOrderer = value;
    }

}
