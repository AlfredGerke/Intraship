
package intraship.ws.de;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The details of a pickup order.
 * 
 * <p>Java-Klasse für PickupDetailsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PickupDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PickupDate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="10"/>
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ReadyByTime">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="5"/>
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ClosingTime">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="5"/>
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PickupLocation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PickupDetailsType", namespace = "http://de.ws.intraship", propOrder = {
    "pickupDate",
    "readyByTime",
    "closingTime",
    "remark",
    "pickupLocation"
})
public class PickupDetailsType {

    @XmlElement(name = "PickupDate", required = true)
    protected String pickupDate;
    @XmlElement(name = "ReadyByTime", required = true)
    protected String readyByTime;
    @XmlElement(name = "ClosingTime", required = true)
    protected String closingTime;
    @XmlElement(name = "Remark")
    protected String remark;
    @XmlElement(name = "PickupLocation", required = true)
    protected String pickupLocation;

    /**
     * Ruft den Wert der pickupDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickupDate() {
        return pickupDate;
    }

    /**
     * Legt den Wert der pickupDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickupDate(String value) {
        this.pickupDate = value;
    }

    /**
     * Ruft den Wert der readyByTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReadyByTime() {
        return readyByTime;
    }

    /**
     * Legt den Wert der readyByTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReadyByTime(String value) {
        this.readyByTime = value;
    }

    /**
     * Ruft den Wert der closingTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClosingTime() {
        return closingTime;
    }

    /**
     * Legt den Wert der closingTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClosingTime(String value) {
        this.closingTime = value;
    }

    /**
     * Ruft den Wert der remark-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Legt den Wert der remark-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

    /**
     * Ruft den Wert der pickupLocation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickupLocation() {
        return pickupLocation;
    }

    /**
     * Legt den Wert der pickupLocation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickupLocation(String value) {
        this.pickupLocation = value;
    }

}
