
package intraship.ws.de;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * TD shipment services.
 * 
 * <p>Java-Klasse für ShipmentServiceTD complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ShipmentServiceTD">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="ServiceGroupDateTimeOption" type="{http://de.ws.intraship}TDServiceGroupDateTimeOptionType"/>
 *           &lt;element name="ServiceGroupOther" type="{http://de.ws.intraship}TDServiceGroupOtherType"/>
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
@XmlType(name = "ShipmentServiceTD", namespace = "http://de.ws.intraship", propOrder = {
    "serviceGroupOther",
    "serviceGroupDateTimeOption"
})
public class ShipmentServiceTD {

    @XmlElement(name = "ServiceGroupOther")
    protected TDServiceGroupOtherType serviceGroupOther;
    @XmlElement(name = "ServiceGroupDateTimeOption")
    protected TDServiceGroupDateTimeOptionType serviceGroupDateTimeOption;

    /**
     * Ruft den Wert der serviceGroupOther-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TDServiceGroupOtherType }
     *     
     */
    public TDServiceGroupOtherType getServiceGroupOther() {
        return serviceGroupOther;
    }

    /**
     * Legt den Wert der serviceGroupOther-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TDServiceGroupOtherType }
     *     
     */
    public void setServiceGroupOther(TDServiceGroupOtherType value) {
        this.serviceGroupOther = value;
    }

    /**
     * Ruft den Wert der serviceGroupDateTimeOption-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TDServiceGroupDateTimeOptionType }
     *     
     */
    public TDServiceGroupDateTimeOptionType getServiceGroupDateTimeOption() {
        return serviceGroupDateTimeOption;
    }

    /**
     * Legt den Wert der serviceGroupDateTimeOption-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TDServiceGroupDateTimeOptionType }
     *     
     */
    public void setServiceGroupDateTimeOption(TDServiceGroupDateTimeOptionType value) {
        this.serviceGroupDateTimeOption = value;
    }

}
