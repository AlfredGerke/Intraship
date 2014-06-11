
package intrashipservice.ws.de.isservice_1_0_de;

import java.math.BigInteger;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.wavemaker.runtime.ws.jaxb.DateXmlAdapter;


/**
 * Type of error
 * 
 * <p>Java-Klasse für ErrorType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ErrorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="dateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descriptionLong" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="solution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="application" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="module" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorType", namespace = "http://dhl.de/webservice/cisbase", propOrder = {
    "priority",
    "code",
    "dateTime",
    "description",
    "descriptionLong",
    "solution",
    "application",
    "module"
})
public class ErrorTypeType {

    @XmlElement(namespace = "http://dhl.de/webservice/cisbase")
    protected BigInteger priority;
    @XmlElement(namespace = "http://dhl.de/webservice/cisbase", required = true)
    protected BigInteger code;
    @XmlElement(namespace = "http://dhl.de/webservice/cisbase", required = true, type = String.class)
    @XmlJavaTypeAdapter(DateXmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Date dateTime;
    @XmlElement(namespace = "http://dhl.de/webservice/cisbase")
    protected String description;
    @XmlElement(namespace = "http://dhl.de/webservice/cisbase")
    protected String descriptionLong;
    @XmlElement(namespace = "http://dhl.de/webservice/cisbase")
    protected String solution;
    @XmlElement(namespace = "http://dhl.de/webservice/cisbase")
    protected String application;
    @XmlElement(namespace = "http://dhl.de/webservice/cisbase")
    protected String module;

    /**
     * Ruft den Wert der priority-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPriority() {
        return priority;
    }

    /**
     * Legt den Wert der priority-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPriority(BigInteger value) {
        this.priority = value;
    }

    /**
     * Ruft den Wert der code-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCode() {
        return code;
    }

    /**
     * Legt den Wert der code-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCode(BigInteger value) {
        this.code = value;
    }

    /**
     * Ruft den Wert der dateTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getDateTime() {
        return dateTime;
    }

    /**
     * Legt den Wert der dateTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTime(Date value) {
        this.dateTime = value;
    }

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Ruft den Wert der descriptionLong-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionLong() {
        return descriptionLong;
    }

    /**
     * Legt den Wert der descriptionLong-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionLong(String value) {
        this.descriptionLong = value;
    }

    /**
     * Ruft den Wert der solution-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSolution() {
        return solution;
    }

    /**
     * Legt den Wert der solution-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSolution(String value) {
        this.solution = value;
    }

    /**
     * Ruft den Wert der application-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplication() {
        return application;
    }

    /**
     * Legt den Wert der application-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplication(String value) {
        this.application = value;
    }

    /**
     * Ruft den Wert der module-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModule() {
        return module;
    }

    /**
     * Legt den Wert der module-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModule(String value) {
        this.module = value;
    }

}
