
package intrashipservice.ws.de.isservice_1_0_de;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type of customer
 * 
 * <p>Java-Klasse für CustomerType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CustomerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://dhl.de/webservice/cisbase}NameType"/>
 *         &lt;element name="vatID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://dhl.de/webservice/cisbase}EKP"/>
 *         &lt;element name="Address" type="{http://dhl.de/webservice/cisbase}NativeAddressType"/>
 *         &lt;element name="Contact" type="{http://dhl.de/webservice/cisbase}ContactType"/>
 *         &lt;element name="Bank" type="{http://dhl.de/webservice/cisbase}BankType" minOccurs="0"/>
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerType", namespace = "http://dhl.de/webservice/cisbase", propOrder = {
    "name",
    "vatID",
    "ekp",
    "address",
    "contact",
    "bank",
    "note"
})
public class CustomerTypeType {

    @XmlElement(name = "Name", namespace = "http://dhl.de/webservice/cisbase", required = true)
    protected NameTypeType name;
    @XmlElement(namespace = "http://dhl.de/webservice/cisbase")
    protected String vatID;
    @XmlElement(name = "EKP", namespace = "http://dhl.de/webservice/cisbase", required = true)
    protected String ekp;
    @XmlElement(name = "Address", namespace = "http://dhl.de/webservice/cisbase", required = true)
    protected NativeAddressTypeType address;
    @XmlElement(name = "Contact", namespace = "http://dhl.de/webservice/cisbase", required = true)
    protected ContactTypeType contact;
    @XmlElement(name = "Bank", namespace = "http://dhl.de/webservice/cisbase")
    protected BankTypeType bank;
    @XmlElement(namespace = "http://dhl.de/webservice/cisbase")
    protected Object note;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NameTypeType }
     *     
     */
    public NameTypeType getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NameTypeType }
     *     
     */
    public void setName(NameTypeType value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der vatID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatID() {
        return vatID;
    }

    /**
     * Legt den Wert der vatID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatID(String value) {
        this.vatID = value;
    }

    /**
     * Ruft den Wert der ekp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEKP() {
        return ekp;
    }

    /**
     * Legt den Wert der ekp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEKP(String value) {
        this.ekp = value;
    }

    /**
     * Ruft den Wert der address-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NativeAddressTypeType }
     *     
     */
    public NativeAddressTypeType getAddress() {
        return address;
    }

    /**
     * Legt den Wert der address-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NativeAddressTypeType }
     *     
     */
    public void setAddress(NativeAddressTypeType value) {
        this.address = value;
    }

    /**
     * Ruft den Wert der contact-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ContactTypeType }
     *     
     */
    public ContactTypeType getContact() {
        return contact;
    }

    /**
     * Legt den Wert der contact-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactTypeType }
     *     
     */
    public void setContact(ContactTypeType value) {
        this.contact = value;
    }

    /**
     * Ruft den Wert der bank-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BankTypeType }
     *     
     */
    public BankTypeType getBank() {
        return bank;
    }

    /**
     * Legt den Wert der bank-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BankTypeType }
     *     
     */
    public void setBank(BankTypeType value) {
        this.bank = value;
    }

    /**
     * Ruft den Wert der note-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNote() {
        return note;
    }

    /**
     * Legt den Wert der note-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNote(Object value) {
        this.note = value;
    }

}
