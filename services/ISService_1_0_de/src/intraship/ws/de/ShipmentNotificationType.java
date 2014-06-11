
package intraship.ws.de;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Notification type
 * 
 * <p>Java-Klasse für ShipmentNotificationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ShipmentNotificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecipientName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RecipientEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentNotificationType", namespace = "http://de.ws.intraship", propOrder = {
    "recipientName",
    "recipientEmailAddress"
})
public class ShipmentNotificationType {

    @XmlElement(name = "RecipientName", required = true)
    protected String recipientName;
    @XmlElement(name = "RecipientEmailAddress", required = true)
    protected String recipientEmailAddress;

    /**
     * Ruft den Wert der recipientName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientName() {
        return recipientName;
    }

    /**
     * Legt den Wert der recipientName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientName(String value) {
        this.recipientName = value;
    }

    /**
     * Ruft den Wert der recipientEmailAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientEmailAddress() {
        return recipientEmailAddress;
    }

    /**
     * Legt den Wert der recipientEmailAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientEmailAddress(String value) {
        this.recipientEmailAddress = value;
    }

}
