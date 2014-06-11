
package intraship.ws.de;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import intrashipservice.ws.de.isservice_1_0_de.BankTypeType;


/**
 * Details of a DD shipment.
 * 
 * <p>Java-Klasse für ShipmentDetailsDDType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ShipmentDetailsDDType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://de.ws.intraship}ShipmentDetailsType">
 *       &lt;sequence>
 *         &lt;element ref="{http://dhl.de/webservice/cisbase}EKP"/>
 *         &lt;element name="Attendance">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://dhl.de/webservice/cisbase}partnerID"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CustomerReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryRemarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipmentItem" type="{http://de.ws.intraship}ShipmentItemDDType" maxOccurs="999"/>
 *         &lt;element name="Service" type="{http://de.ws.intraship}ShipmentServiceDD" maxOccurs="999" minOccurs="0"/>
 *         &lt;element name="Notification" type="{http://de.ws.intraship}ShipmentNotificationType" maxOccurs="999" minOccurs="0"/>
 *         &lt;element name="NotificationEmailText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankData" type="{http://dhl.de/webservice/cisbase}BankType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentDetailsDDType", namespace = "http://de.ws.intraship", propOrder = {
    "ekp",
    "attendance",
    "customerReference",
    "description",
    "deliveryRemarks",
    "shipmentItems",
    "services",
    "notifications",
    "notificationEmailText",
    "bankData"
})
public class ShipmentDetailsDDType
    extends ShipmentDetailsType
{

    @XmlElement(name = "EKP", namespace = "http://dhl.de/webservice/cisbase", required = true)
    protected String ekp;
    @XmlElement(name = "Attendance", required = true)
    protected ShipmentDetailsDDType.Attendance attendance;
    @XmlElement(name = "CustomerReference")
    protected String customerReference;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "DeliveryRemarks")
    protected String deliveryRemarks;
    @XmlElement(name = "ShipmentItem", required = true)
    protected List<ShipmentItemDDType> shipmentItems;
    @XmlElement(name = "Service")
    protected List<ShipmentServiceDD> services;
    @XmlElement(name = "Notification")
    protected List<ShipmentNotificationType> notifications;
    @XmlElement(name = "NotificationEmailText")
    protected String notificationEmailText;
    @XmlElement(name = "BankData")
    protected BankTypeType bankData;

    /**
     * EKP (mandatory)
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
     * Ruft den Wert der attendance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentDetailsDDType.Attendance }
     *     
     */
    public ShipmentDetailsDDType.Attendance getAttendance() {
        return attendance;
    }

    /**
     * Legt den Wert der attendance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentDetailsDDType.Attendance }
     *     
     */
    public void setAttendance(ShipmentDetailsDDType.Attendance value) {
        this.attendance = value;
    }

    /**
     * Ruft den Wert der customerReference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerReference() {
        return customerReference;
    }

    /**
     * Legt den Wert der customerReference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerReference(String value) {
        this.customerReference = value;
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
     * Ruft den Wert der deliveryRemarks-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryRemarks() {
        return deliveryRemarks;
    }

    /**
     * Legt den Wert der deliveryRemarks-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryRemarks(String value) {
        this.deliveryRemarks = value;
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
     * {@link ShipmentItemDDType }
     * 
     * 
     */
    public List<ShipmentItemDDType> getShipmentItems() {
        if (shipmentItems == null) {
            shipmentItems = new ArrayList<ShipmentItemDDType>();
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
     * {@link ShipmentServiceDD }
     * 
     * 
     */
    public List<ShipmentServiceDD> getServices() {
        if (services == null) {
            services = new ArrayList<ShipmentServiceDD>();
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
     * Ruft den Wert der bankData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BankTypeType }
     *     
     */
    public BankTypeType getBankData() {
        return bankData;
    }

    /**
     * Legt den Wert der bankData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BankTypeType }
     *     
     */
    public void setBankData(BankTypeType value) {
        this.bankData = value;
    }

    /**
     * Sets the value of the shipmentItems property.
     * 
     * @param shipmentItems
     *     allowed object is
     *     {@link ShipmentItemDDType }
     *     
     */
    public void setShipmentItems(List<ShipmentItemDDType> shipmentItems) {
        this.shipmentItems = shipmentItems;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param services
     *     allowed object is
     *     {@link ShipmentServiceDD }
     *     
     */
    public void setServices(List<ShipmentServiceDD> services) {
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
     *         &lt;element ref="{http://dhl.de/webservice/cisbase}partnerID"/>
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
        "partnerID"
    })
    public static class Attendance {

        @XmlElement(namespace = "http://dhl.de/webservice/cisbase", required = true)
        protected String partnerID;

        /**
         * Ruft den Wert der partnerID-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPartnerID() {
            return partnerID;
        }

        /**
         * Legt den Wert der partnerID-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPartnerID(String value) {
            this.partnerID = value;
        }

    }

}
