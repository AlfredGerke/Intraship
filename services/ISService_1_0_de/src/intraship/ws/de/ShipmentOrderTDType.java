
package intraship.ws.de;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Data for a create shipment operation.
 * 			
 * 
 * <p>Java-Klasse für ShipmentOrderTDType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ShipmentOrderTDType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SequenceNumber" type="{http://de.ws.intraship}SequenceNumber"/>
 *         &lt;element name="Shipment">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ShipmentDetails" type="{http://de.ws.intraship}ShipmentDetailsTDType"/>
 *                   &lt;element name="Shipper" type="{http://de.ws.intraship}ShipperTDType"/>
 *                   &lt;element name="Receiver" type="{http://de.ws.intraship}ReceiverTDType"/>
 *                   &lt;element name="ExportDocument" type="{http://de.ws.intraship}ExportDocumentTDType" minOccurs="0"/>
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentOrderTDType", namespace = "http://de.ws.intraship", propOrder = {
    "sequenceNumber",
    "shipment",
    "pickup",
    "labelResponseType"
})
public class ShipmentOrderTDType {

    @XmlElement(name = "SequenceNumber", required = true)
    protected String sequenceNumber;
    @XmlElement(name = "Shipment", required = true)
    protected ShipmentOrderTDType.Shipment shipment;
    @XmlElement(name = "Pickup")
    protected ShipmentOrderTDType.Pickup pickup;
    @XmlElement(name = "LabelResponseType")
    protected String labelResponseType;

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
     *     {@link ShipmentOrderTDType.Shipment }
     *     
     */
    public ShipmentOrderTDType.Shipment getShipment() {
        return shipment;
    }

    /**
     * Legt den Wert der shipment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentOrderTDType.Shipment }
     *     
     */
    public void setShipment(ShipmentOrderTDType.Shipment value) {
        this.shipment = value;
    }

    /**
     * Ruft den Wert der pickup-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentOrderTDType.Pickup }
     *     
     */
    public ShipmentOrderTDType.Pickup getPickup() {
        return pickup;
    }

    /**
     * Legt den Wert der pickup-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentOrderTDType.Pickup }
     *     
     */
    public void setPickup(ShipmentOrderTDType.Pickup value) {
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
     *         &lt;element name="ShipmentDetails" type="{http://de.ws.intraship}ShipmentDetailsTDType"/>
     *         &lt;element name="Shipper" type="{http://de.ws.intraship}ShipperTDType"/>
     *         &lt;element name="Receiver" type="{http://de.ws.intraship}ReceiverTDType"/>
     *         &lt;element name="ExportDocument" type="{http://de.ws.intraship}ExportDocumentTDType" minOccurs="0"/>
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
        "exportDocument"
    })
    public static class Shipment {

        @XmlElement(name = "ShipmentDetails", required = true)
        protected ShipmentDetailsTDType shipmentDetails;
        @XmlElement(name = "Shipper", required = true)
        protected ShipperTDType shipper;
        @XmlElement(name = "Receiver", required = true)
        protected ReceiverTDType receiver;
        @XmlElement(name = "ExportDocument")
        protected ExportDocumentTDType exportDocument;

        /**
         * Ruft den Wert der shipmentDetails-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link ShipmentDetailsTDType }
         *     
         */
        public ShipmentDetailsTDType getShipmentDetails() {
            return shipmentDetails;
        }

        /**
         * Legt den Wert der shipmentDetails-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link ShipmentDetailsTDType }
         *     
         */
        public void setShipmentDetails(ShipmentDetailsTDType value) {
            this.shipmentDetails = value;
        }

        /**
         * Ruft den Wert der shipper-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link ShipperTDType }
         *     
         */
        public ShipperTDType getShipper() {
            return shipper;
        }

        /**
         * Legt den Wert der shipper-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link ShipperTDType }
         *     
         */
        public void setShipper(ShipperTDType value) {
            this.shipper = value;
        }

        /**
         * Ruft den Wert der receiver-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link ReceiverTDType }
         *     
         */
        public ReceiverTDType getReceiver() {
            return receiver;
        }

        /**
         * Legt den Wert der receiver-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link ReceiverTDType }
         *     
         */
        public void setReceiver(ReceiverTDType value) {
            this.receiver = value;
        }

        /**
         * Ruft den Wert der exportDocument-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link ExportDocumentTDType }
         *     
         */
        public ExportDocumentTDType getExportDocument() {
            return exportDocument;
        }

        /**
         * Legt den Wert der exportDocument-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportDocumentTDType }
         *     
         */
        public void setExportDocument(ExportDocumentTDType value) {
            this.exportDocument = value;
        }

    }

}
