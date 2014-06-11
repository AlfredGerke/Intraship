
package intrashipservice.ws.de.isservice_1_0_de;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type of post office
 * 
 * <p>Java-Klasse für PostOfficeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PostOfficeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="number">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="10"/>
 *               &lt;pattern value="[0-9]{1,10}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{http://dhl.de/webservice/cisbase}Zip"/>
 *         &lt;element ref="{http://dhl.de/webservice/cisbase}city"/>
 *         &lt;element ref="{http://dhl.de/webservice/cisbase}Origin" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostOfficeType", namespace = "http://dhl.de/webservice/cisbase", propOrder = {
    "number",
    "zip",
    "city",
    "origin"
})
public class PostOfficeTypeType {

    @XmlElement(namespace = "http://dhl.de/webservice/cisbase", required = true)
    protected String number;
    @XmlElement(name = "Zip", namespace = "http://dhl.de/webservice/cisbase", required = true)
    protected Zip zip;
    @XmlElement(namespace = "http://dhl.de/webservice/cisbase", required = true)
    protected String city;
    @XmlElement(name = "Origin", namespace = "http://dhl.de/webservice/cisbase")
    protected Origin origin;

    /**
     * Ruft den Wert der number-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Legt den Wert der number-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
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

}
