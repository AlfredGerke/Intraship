
package intraship.ws.de;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The receiver data of a DD shipment.
 * 			
 * 
 * <p>Java-Klasse für ReceiverDDType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ReceiverDDType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://de.ws.intraship}ReceiverType">
 *       &lt;sequence>
 *         &lt;element name="CompanyName3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReceiverDDType", namespace = "http://de.ws.intraship", propOrder = {
    "companyName3"
})
public class ReceiverDDType
    extends ReceiverType
{

    @XmlElement(name = "CompanyName3")
    protected String companyName3;

    /**
     * Ruft den Wert der companyName3-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName3() {
        return companyName3;
    }

    /**
     * Legt den Wert der companyName3-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName3(String value) {
        this.companyName3 = value;
    }

}
