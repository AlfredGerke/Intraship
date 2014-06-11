
package intrashipservice.ws.de.isservice_1_0_de;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type of delivery address
 * 
 * <p>Java-Klasse für DeliveryAddressType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DeliveryAddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="NativeAddress" type="{http://dhl.de/webservice/cisbase}NativeAddressType"/>
 *           &lt;element name="PostOffice" type="{http://dhl.de/webservice/cisbase}PostOfficeType"/>
 *           &lt;element name="PackStation" type="{http://dhl.de/webservice/cisbase}PackStationType"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://dhl.de/webservice/cisbase}streetNameCode" minOccurs="0"/>
 *         &lt;element ref="{http://dhl.de/webservice/cisbase}streetNumberCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryAddressType", namespace = "http://dhl.de/webservice/cisbase", propOrder = {
    "packStation",
    "postOffice",
    "nativeAddress",
    "streetNameCode",
    "streetNumberCode"
})
public class DeliveryAddressTypeType {

    @XmlElement(name = "PackStation", namespace = "http://dhl.de/webservice/cisbase")
    protected PackStationTypeType packStation;
    @XmlElement(name = "PostOffice", namespace = "http://dhl.de/webservice/cisbase")
    protected PostOfficeTypeType postOffice;
    @XmlElement(name = "NativeAddress", namespace = "http://dhl.de/webservice/cisbase")
    protected NativeAddressTypeType nativeAddress;
    @XmlElement(namespace = "http://dhl.de/webservice/cisbase")
    protected String streetNameCode;
    @XmlElement(namespace = "http://dhl.de/webservice/cisbase")
    protected String streetNumberCode;

    /**
     * Ruft den Wert der packStation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PackStationTypeType }
     *     
     */
    public PackStationTypeType getPackStation() {
        return packStation;
    }

    /**
     * Legt den Wert der packStation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PackStationTypeType }
     *     
     */
    public void setPackStation(PackStationTypeType value) {
        this.packStation = value;
    }

    /**
     * Ruft den Wert der postOffice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PostOfficeTypeType }
     *     
     */
    public PostOfficeTypeType getPostOffice() {
        return postOffice;
    }

    /**
     * Legt den Wert der postOffice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PostOfficeTypeType }
     *     
     */
    public void setPostOffice(PostOfficeTypeType value) {
        this.postOffice = value;
    }

    /**
     * Ruft den Wert der nativeAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NativeAddressTypeType }
     *     
     */
    public NativeAddressTypeType getNativeAddress() {
        return nativeAddress;
    }

    /**
     * Legt den Wert der nativeAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NativeAddressTypeType }
     *     
     */
    public void setNativeAddress(NativeAddressTypeType value) {
        this.nativeAddress = value;
    }

    /**
     * Ruft den Wert der streetNameCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetNameCode() {
        return streetNameCode;
    }

    /**
     * Legt den Wert der streetNameCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetNameCode(String value) {
        this.streetNameCode = value;
    }

    /**
     * Ruft den Wert der streetNumberCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetNumberCode() {
        return streetNumberCode;
    }

    /**
     * Legt den Wert der streetNumberCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetNumberCode(String value) {
        this.streetNumberCode = value;
    }

}
