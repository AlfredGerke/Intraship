
package intraship.ws.de;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Details of a TD shipment.
 * 
 * <p>Java-Klasse für ShipmentDetailsTDType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ShipmentDetailsTDType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://de.ws.intraship}ShipmentDetailsType">
 *       &lt;sequence>
 *         &lt;element name="Account">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://dhl.de/webservice/cisbase}accountNumberExpress"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Dutiable">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DescriptionOfContent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AccountPaidBy" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://dhl.de/webservice/cisbase}accountNumberExpress"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ShipmentReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TermsOfTrade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipmentItem" type="{http://de.ws.intraship}ShipmentItemTDType" maxOccurs="999"/>
 *         &lt;element name="Service" type="{http://de.ws.intraship}ShipmentServiceTD" maxOccurs="999" minOccurs="0"/>
 *         &lt;element name="Notification" type="{http://de.ws.intraship}ShipmentNotificationType" maxOccurs="999" minOccurs="0"/>
 *         &lt;element name="NotificationEmailText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentDetailsTDType", namespace = "http://de.ws.intraship", propOrder = {
    "account",
    "dutiable",
    "descriptionOfContent",
    "accountPaidBy",
    "shipmentReference",
    "termsOfTrade",
    "shipmentItems",
    "services",
    "notifications",
    "notificationEmailText"
})
public class ShipmentDetailsTDType
    extends ShipmentDetailsType
{

    @XmlElement(name = "Account", required = true)
    protected ShipmentDetailsTDType.Account account;
    @XmlElement(name = "Dutiable", required = true)
    protected String dutiable;
    @XmlElement(name = "DescriptionOfContent", required = true)
    protected String descriptionOfContent;
    @XmlElement(name = "AccountPaidBy")
    protected ShipmentDetailsTDType.AccountPaidBy accountPaidBy;
    @XmlElement(name = "ShipmentReference")
    protected String shipmentReference;
    @XmlElement(name = "TermsOfTrade")
    protected String termsOfTrade;
    @XmlElement(name = "ShipmentItem", required = true)
    protected List<ShipmentItemTDType> shipmentItems;
    @XmlElement(name = "Service")
    protected List<ShipmentServiceTD> services;
    @XmlElement(name = "Notification")
    protected List<ShipmentNotificationType> notifications;
    @XmlElement(name = "NotificationEmailText")
    protected String notificationEmailText;

    /**
     * Ruft den Wert der account-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentDetailsTDType.Account }
     *     
     */
    public ShipmentDetailsTDType.Account getAccount() {
        return account;
    }

    /**
     * Legt den Wert der account-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentDetailsTDType.Account }
     *     
     */
    public void setAccount(ShipmentDetailsTDType.Account value) {
        this.account = value;
    }

    /**
     * Ruft den Wert der dutiable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDutiable() {
        return dutiable;
    }

    /**
     * Legt den Wert der dutiable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDutiable(String value) {
        this.dutiable = value;
    }

    /**
     * Ruft den Wert der descriptionOfContent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionOfContent() {
        return descriptionOfContent;
    }

    /**
     * Legt den Wert der descriptionOfContent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionOfContent(String value) {
        this.descriptionOfContent = value;
    }

    /**
     * Ruft den Wert der accountPaidBy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentDetailsTDType.AccountPaidBy }
     *     
     */
    public ShipmentDetailsTDType.AccountPaidBy getAccountPaidBy() {
        return accountPaidBy;
    }

    /**
     * Legt den Wert der accountPaidBy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentDetailsTDType.AccountPaidBy }
     *     
     */
    public void setAccountPaidBy(ShipmentDetailsTDType.AccountPaidBy value) {
        this.accountPaidBy = value;
    }

    /**
     * Ruft den Wert der shipmentReference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentReference() {
        return shipmentReference;
    }

    /**
     * Legt den Wert der shipmentReference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentReference(String value) {
        this.shipmentReference = value;
    }

    /**
     * Ruft den Wert der termsOfTrade-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermsOfTrade() {
        return termsOfTrade;
    }

    /**
     * Legt den Wert der termsOfTrade-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermsOfTrade(String value) {
        this.termsOfTrade = value;
    }

    /**
     * Gets the value of the shipmentItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentItemTDType }
     * 
     * 
     */
    public List<ShipmentItemTDType> getShipmentItems() {
        if (shipmentItems == null) {
            shipmentItems = new ArrayList<ShipmentItemTDType>();
        }
        return this.shipmentItems;
    }

    /**
     * Gets the value of the services property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the services property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentServiceTD }
     * 
     * 
     */
    public List<ShipmentServiceTD> getServices() {
        if (services == null) {
            services = new ArrayList<ShipmentServiceTD>();
        }
        return this.services;
    }

    /**
     * Gets the value of the notifications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notifications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotifications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentNotificationType }
     * 
     * 
     */
    public List<ShipmentNotificationType> getNotifications() {
        if (notifications == null) {
            notifications = new ArrayList<ShipmentNotificationType>();
        }
        return this.notifications;
    }

    /**
     * Ruft den Wert der notificationEmailText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationEmailText() {
        return notificationEmailText;
    }

    /**
     * Legt den Wert der notificationEmailText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationEmailText(String value) {
        this.notificationEmailText = value;
    }

    /**
     * Sets the value of the shipmentItems property.
     * 
     * @param shipmentItems
     *     allowed object is
     *     {@link ShipmentItemTDType }
     *     
     */
    public void setShipmentItems(List<ShipmentItemTDType> shipmentItems) {
        this.shipmentItems = shipmentItems;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param services
     *     allowed object is
     *     {@link ShipmentServiceTD }
     *     
     */
    public void setServices(List<ShipmentServiceTD> services) {
        this.services = services;
    }

    /**
     * Sets the value of the notifications property.
     * 
     * @param notifications
     *     allowed object is
     *     {@link ShipmentNotificationType }
     *     
     */
    public void setNotifications(List<ShipmentNotificationType> notifications) {
        this.notifications = notifications;
    }


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
     *         &lt;element ref="{http://dhl.de/webservice/cisbase}accountNumberExpress"/>
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
        "accountNumberExpress"
    })
    public static class Account {

        @XmlElement(namespace = "http://dhl.de/webservice/cisbase", required = true)
        protected String accountNumberExpress;

        /**
         * Ruft den Wert der accountNumberExpress-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccountNumberExpress() {
            return accountNumberExpress;
        }

        /**
         * Legt den Wert der accountNumberExpress-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccountNumberExpress(String value) {
            this.accountNumberExpress = value;
        }

    }


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
     *         &lt;element ref="{http://dhl.de/webservice/cisbase}accountNumberExpress"/>
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
        "accountNumberExpress"
    })
    public static class AccountPaidBy {

        @XmlElement(namespace = "http://dhl.de/webservice/cisbase", required = true)
        protected String accountNumberExpress;

        /**
         * Ruft den Wert der accountNumberExpress-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccountNumberExpress() {
            return accountNumberExpress;
        }

        /**
         * Legt den Wert der accountNumberExpress-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccountNumberExpress(String value) {
            this.accountNumberExpress = value;
        }

    }

}
