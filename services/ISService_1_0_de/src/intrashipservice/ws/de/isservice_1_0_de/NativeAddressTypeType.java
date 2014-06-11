
package intrashipservice.ws.de.isservice_1_0_de;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type of native address
 * 
 * <p>Java-Klasse für NativeAddressType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NativeAddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="streetName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="streetNumber">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="careOfName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{http://dhl.de/webservice/cisbase}Zip"/>
 *         &lt;element ref="{http://dhl.de/webservice/cisbase}city"/>
 *         &lt;element name="district" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{http://dhl.de/webservice/cisbase}Origin" minOccurs="0"/>
 *         &lt;element name="floorNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="roomNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="languageCodeISO" type="{http://dhl.de/webservice/cisbase}countryISOType" minOccurs="0"/>
 *         &lt;element name="note" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NativeAddressType", namespace = "http://dhl.de/webservice/cisbase", propOrder = {
    "streetName",
    "streetNumber",
    "careOfName",
    "zip",
    "city",
    "district",
    "origin",
    "floorNumber",
    "roomNumber",
    "languageCodeISO",
    "note"
})
public class NativeAddressTypeType {

    @XmlElement(namespace = "http://dhl.de/webservice/cisbase", required = true)
    protected String streetName;
    @XmlElement(namespace = "http://dhl.de/webservice/cisbase", required = true)
    protected String streetNumber;
    @XmlElement(namespace = "http://dhl.de/webservice/cisbase")
    protected String careOfName;
    @XmlElement(name = "Zip", namespace = "http://dhl.de/webservice/cisbase", required = true)
    protected Zip zip;
    @XmlElement(namespace = "http://dhl.de/webservice/cisbase", required = true)
    protected String city;
    @XmlElement(namespace = "http://dhl.de/webservice/cisbase")
    protected String district;
    @XmlElement(name = "Origin", namespace = "http://dhl.de/webservice/cisbase")
    protected Origin origin;
    @XmlElement(namespace = "http://dhl.de/webservice/cisbase")
    protected String floorNumber;
    @XmlElement(namespace = "http://dhl.de/webservice/cisbase")
    protected String roomNumber;
    @XmlElement(namespace = "http://dhl.de/webservice/cisbase")
    protected String languageCodeISO;
    @XmlElement(namespace = "http://dhl.de/webservice/cisbase")
    protected String note;

    /**
     * Ruft den Wert der streetName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * Legt den Wert der streetName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetName(String value) {
        this.streetName = value;
    }

    /**
     * Ruft den Wert der streetNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetNumber() {
        return streetNumber;
    }

    /**
     * Legt den Wert der streetNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetNumber(String value) {
        this.streetNumber = value;
    }

    /**
     * Ruft den Wert der careOfName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCareOfName() {
        return careOfName;
    }

    /**
     * Legt den Wert der careOfName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCareOfName(String value) {
        this.careOfName = value;
    }

    /**
     * Ruft den Wert der zip-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Zip }
     *     
     */
    public Zip getZip() {
        return zip;
    }

    /**
     * Legt den Wert der zip-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Zip }
     *     
     */
    public void setZip(Zip value) {
        this.zip = value;
    }

    /**
     * Ruft den Wert der city-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Legt den Wert der city-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Ruft den Wert der district-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrict() {
        return district;
    }

    /**
     * Legt den Wert der district-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrict(String value) {
        this.district = value;
    }

    /**
     * Ruft den Wert der origin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Origin }
     *     
     */
    public Origin getOrigin() {
        return origin;
    }

    /**
     * Legt den Wert der origin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Origin }
     *     
     */
    public void setOrigin(Origin value) {
        this.origin = value;
    }

    /**
     * Ruft den Wert der floorNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloorNumber() {
        return floorNumber;
    }

    /**
     * Legt den Wert der floorNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloorNumber(String value) {
        this.floorNumber = value;
    }

    /**
     * Ruft den Wert der roomNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomNumber() {
        return roomNumber;
    }

    /**
     * Legt den Wert der roomNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomNumber(String value) {
        this.roomNumber = value;
    }

    /**
     * Ruft den Wert der languageCodeISO-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCodeISO() {
        return languageCodeISO;
    }

    /**
     * Legt den Wert der languageCodeISO-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCodeISO(String value) {
        this.languageCodeISO = value;
    }

    /**
     * Ruft den Wert der note-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Legt den Wert der note-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

}
