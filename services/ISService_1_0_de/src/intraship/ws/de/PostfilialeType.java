
package intraship.ws.de;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type of Postfiliale (Receiver is in Germany)
 * 
 * <p>Java-Klasse für PostfilialeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PostfilialeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PostfilialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PostNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Zip">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="5"/>
 *               &lt;maxLength value="5"/>
 *               &lt;pattern value="[0-9]{5}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="City">
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
@XmlType(name = "PostfilialeType", namespace = "http://de.ws.intraship", propOrder = {
    "postfilialNumber",
    "postNumber",
    "zip",
    "city"
})
public class PostfilialeType {

    @XmlElement(name = "PostfilialNumber", required = true)
    protected String postfilialNumber;
    @XmlElement(name = "PostNumber", required = true)
    protected String postNumber;
    @XmlElement(name = "Zip", required = true)
    protected String zip;
    @XmlElement(name = "City", required = true)
    protected String city;

    /**
     * Ruft den Wert der postfilialNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostfilialNumber() {
        return postfilialNumber;
    }

    /**
     * Legt den Wert der postfilialNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostfilialNumber(String value) {
        this.postfilialNumber = value;
    }

    /**
     * Ruft den Wert der postNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostNumber() {
        return postNumber;
    }

    /**
     * Legt den Wert der postNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostNumber(String value) {
        this.postNumber = value;
    }

    /**
     * Ruft den Wert der zip-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZip() {
        return zip;
    }

    /**
     * Legt den Wert der zip-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZip(String value) {
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

}
