
package intrashipservice.ws.de.isservice_1_0_de;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.wavemaker.runtime.ws.jaxb.DateXmlAdapter;


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
 *         &lt;element name="from" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *         &lt;element name="until" type="{http://www.w3.org/2001/XMLSchema}time"/>
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
    "from",
    "until"
})
@XmlRootElement(name = "TimeFrame", namespace = "http://dhl.de/webservice/cisbase")
public class TimeFrame {

    @XmlElement(namespace = "http://dhl.de/webservice/cisbase", required = true, type = String.class)
    @XmlJavaTypeAdapter(DateXmlAdapter.class)
    @XmlSchemaType(name = "time")
    protected Date from;
    @XmlElement(namespace = "http://dhl.de/webservice/cisbase", required = true, type = String.class)
    @XmlJavaTypeAdapter(DateXmlAdapter.class)
    @XmlSchemaType(name = "time")
    protected Date until;

    /**
     * Ruft den Wert der from-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getFrom() {
        return from;
    }

    /**
     * Legt den Wert der from-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrom(Date value) {
        this.from = value;
    }

    /**
     * Ruft den Wert der until-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getUntil() {
        return until;
    }

    /**
     * Legt den Wert der until-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUntil(Date value) {
        this.until = value;
    }

}
