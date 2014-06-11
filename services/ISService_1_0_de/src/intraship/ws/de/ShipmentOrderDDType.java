
package intraship.ws.de;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Data for the creation of a DD shipment.
 * 			
 * 
 * <p>Java-Klasse für ShipmentOrderDDType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ShipmentOrderDDType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SequenceNumber" type="{http://de.ws.intraship}SequenceNumber"/>
 *         &lt;element name="Shipment">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ShipmentDetails" type="{http://de.ws.intraship}ShipmentDetailsDDType"/>
 *                   &lt;element name="Shipper" type="{http://de.ws.intraship}ShipperDDType"/>
 *                   &lt;element name="Receiver" type="{http://de.ws.intraship}ReceiverDDType"/>
 *                   &lt;element name="ExportDocument" type="{http://de.ws.intraship}ExportDocumentDDType" minOccurs="0"/>
 *                   &lt;element name="Identity" type="{http://de.ws.intraship}IdentityType" minOccurs="0"/>
 *                   &lt;element name="FurtherAddresses" type="{http://de.ws.intraship}FurtherAddressesDDType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Pickup" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PickupDetails" type="{http://de.ws.intraship}PickupDetailsType"/>
 *                   &lt;element name="PickupAddress" type="{http://de.ws.intraship}PickupAddressType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="LabelResponseType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="URL"/>
 *               &lt;enumeration value="XML"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PRINTONLYIFCODEABLE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentOrderDDType", namespace = "http://de.ws.intraship", propOrder = {
    "sequenceNumber",
    "shipment",
    "pickup",
    "labelResponseType",
    "printonlyifcodeable"
})
public class ShipmentOrderDDType {

    @XmlElement(name = "SequenceNumber", required = true)
    protected String sequenceNumber;
    @XmlElement(name = "Shipment", required = true)
    protected ShipmentOrderDDType.Shipment shipment;
    @XmlElement(name = "Pickup")
    protected ShipmentOrderDDType.Pickup pickup;
    @XmlElement(name = "LabelResponseType")
    protected String labelResponseType;
    @XmlElement(name = "PRINTONLYIFCODEABLE")
    protected String printonlyifcodeable;

    /**
     * Ruft den Wert der sequenceNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Legt den Wert der sequenceNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequenceNumber(String value) {
        this.sequenceNumber = value;
    }

    /**
     * Ruft den Wert der shipment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentOrderDDType.Shipment }
     *     
     */
    public ShipmentOrderDDType.Shipment getShipment() {
        return shipment;
    }

    /**
     * Legt den Wert der shipment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentOrderDDType.Shipment }
     *     
     */
    public void setShipment(ShipmentOrderDDType.Shipment value) {
        this.shipment = value;
    }

    /**
     * Ruft den Wert der pickup-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentOrderDDType.Pickup }
     *     
     */
    public ShipmentOrderDDType.Pickup getPickup() {
        return pickup;
    }

    /**
     * Legt den Wert der pickup-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentOrderDDType.Pickup }
     *     
     */
    public void setPickup(ShipmentOrderDDType.Pickup value) {
        this.pickup = value;
    }

    /**
     * Ruft den Wert der labelResponseType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelResponseType() {
        return labelResponseType;
    }

    /**
     * Legt den Wert der labelResponseType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelResponseType(String value) {
        this.labelResponseType = value;
    }

    /**
     * Ruft den Wert der printonlyifcodeable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRINTONLYIFCODEABLE() {
        return printonlyifcodeable;
    }

    /**
     * Legt den Wert der printonlyifcodeable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRINTONLYIFCODEABLE(String value) {
        this.printonlyifcodeable = value;
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
     *         &lt;element name="PickupDetails" type="{http://de.ws.intraship}PickupDetailsType"/>
     *         &lt;element name="PickupAddress" type="{http://de.ws.intraship}PickupAddressType" minOccurs="0"/>
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
        "pickupDetails",
        "pickupAddress"
    })
    public static class Pickup {

        @XmlElement(name = "PickupDetails", required = true)
        protected PickupDetailsType pickupDetails;
        @XmlElement(name = "PickupAddress")
        protected PickupAddressType pickupAddress;

        /**
         * Ruft den Wert der pickupDetails-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link PickupDetailsType }
         *     
         */
        public PickupDetailsType getPickupDetails() {
            return pickupDetails;
        }

        /**
         * Legt den Wert der pickupDetails-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link PickupDetailsType }
         *     
         */
        public void setPickupDetails(PickupDetailsType value) {
            this.pickupDetails = value;
        }

        /**
         * Ruft den Wert der pickupAddress-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link PickupAddressType }
         *     
         */
        public PickupAddressType getPickupAddress() {
            return pickupAddress;
        }

        /**
         * Legt den Wert der pickupAddress-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link PickupAddressType }
         *     
         */
        public void setPickupAddress(PickupAddressType value) {
            this.pickupAddress = value;
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
     *         &lt;element name="ShipmentDetails" type="{http://de.ws.intraship}ShipmentDetailsDDType"/>
     *         &lt;element name="Shipper" type="{http://de.ws.intraship}ShipperDDType"/>
     *         &lt;element name="Receiver" type="{http://de.ws.intraship}ReceiverDDType"/>
     *         &lt;element name="ExportDocument" type="{http://de.ws.intraship}ExportDocumentDDType" minOccurs="0"/>
     *         &lt;element name="Identity" type="{http://de.ws.intraship}IdentityType" minOccurs="0"/>
     *         &lt;element name="FurtherAddresses" type="{http://de.ws.intraship}FurtherAddressesDDType" minOccurs="0"/>
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
        "shipmentDetails",
        "shipper",
        "receiver",
        "exportDocument",
        "identity",
        "furtherAddresses"
    })
    public static class Shipment {

        @XmlElement(name = "ShipmentDetails", required = true)
        protected ShipmentDetailsDDType shipmentDetails;
        @XmlElement(name = "Shipper", required = true)
        protected ShipperDDType shipper;
        @XmlElement(name = "Receiver", required = true)
        protected ReceiverDDType receiver;
        @XmlElement(name = "ExportDocument")
        protected ExportDocumentDDType exportDocument;
        @XmlElement(name = "Identity")
        protected IdentityType identity;
        @XmlElement(name = "FurtherAddresses")
        protected FurtherAddressesDDType furtherAddresses;

        /**
         * Ruft den Wert der shipmentDetails-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link ShipmentDetailsDDType }
         *     
         */
        public ShipmentDetailsDDType getShipmentDetails() {
            return shipmentDetails;
        }

        /**
         * Legt den Wert der shipmentDetails-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link ShipmentDetailsDDType }
         *     
         */
        public void setShipmentDetails(ShipmentDetailsDDType value) {
            this.shipmentDetails = value;
        }

        /**
         * Ruft den Wert der shipper-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link ShipperDDType }
         *     
         */
        public ShipperDDType getShipper() {
            return shipper;
        }

        /**
         * Legt den Wert der shipper-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link ShipperDDType }
         *     
         */
        public void setShipper(ShipperDDType value) {
            this.shipper = value;
        }

        /**
         * Ruft den Wert der receiver-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link ReceiverDDType }
         *     
         */
        public ReceiverDDType getReceiver() {
            return receiver;
        }

        /**
         * Legt den Wert der receiver-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link ReceiverDDType }
         *     
         */
        public void setReceiver(ReceiverDDType value) {
            this.receiver = value;
        }

        /**
         * Ruft den Wert der exportDocument-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link ExportDocumentDDType }
         *     
         */
        public ExportDocumentDDType getExportDocument() {
            return exportDocument;
        }

        /**
         * Legt den Wert der exportDocument-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportDocumentDDType }
         *     
         */
        public void setExportDocument(ExportDocumentDDType value) {
            this.exportDocument = value;
        }

        /**
         * Ruft den Wert der identity-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link IdentityType }
         *     
         */
        public IdentityType getIdentity() {
            return identity;
        }

        /**
         * Legt den Wert der identity-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link IdentityType }
         *     
         */
        public void setIdentity(IdentityType value) {
            this.identity = value;
        }

        /**
         * Ruft den Wert der furtherAddresses-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link FurtherAddressesDDType }
         *     
         */
        public FurtherAddressesDDType getFurtherAddresses() {
            return furtherAddresses;
        }

        /**
         * Legt den Wert der furtherAddresses-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link FurtherAddressesDDType }
         *     
         */
        public void setFurtherAddresses(FurtherAddressesDDType value) {
            this.furtherAddresses = value;
        }

    }

}
