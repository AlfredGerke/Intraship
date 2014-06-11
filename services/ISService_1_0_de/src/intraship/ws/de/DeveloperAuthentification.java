
package intraship.ws.de;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="DEVID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="APPID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CERTID" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "devid",
    "appid",
    "certid"
})
@XmlRootElement(name = "DeveloperAuthentification", namespace = "http://de.ws.intraship")
public class DeveloperAuthentification {

    @XmlElement(name = "DEVID", required = true)
    protected String devid;
    @XmlElement(name = "APPID", required = true)
    protected String appid;
    @XmlElement(name = "CERTID", required = true)
    protected String certid;

    /**
     * Ruft den Wert der devid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEVID() {
        return devid;
    }

    /**
     * Legt den Wert der devid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEVID(String value) {
        this.devid = value;
    }

    /**
     * Ruft den Wert der appid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPPID() {
        return appid;
    }

    /**
     * Legt den Wert der appid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPPID(String value) {
        this.appid = value;
    }

    /**
     * Ruft den Wert der certid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCERTID() {
        return certid;
    }

    /**
     * Legt den Wert der certid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCERTID(String value) {
        this.certid = value;
    }

}
