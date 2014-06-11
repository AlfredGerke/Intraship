
package intraship.ws.de;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The data of the pickup order.
 * 
 * <p>Java-Klasse für PickupBookingInformationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PickupBookingInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductID">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="TDI"/>
 *               &lt;enumeration value="TDN"/>
 *               &lt;enumeration value="DDI"/>
 *               &lt;enumeration value="DDN"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Account" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Attendance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PickupDate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="10"/>
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ReadyByTime">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="5"/>
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ClosingTime">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="5"/>
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PickupLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AmountOfPieces" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AmountOfPallets" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WeightInKG" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minInclusive value="0.0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CountOfShipments" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TotalVolumeWeight" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minInclusive value="0.0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MaxLengthInCM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minInclusive value="0.0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MaxWidthInCM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minInclusive value="0.0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MaxHeightInCM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minInclusive value="0.0"/>
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
@XmlType(name = "PickupBookingInformationType", namespace = "http://de.ws.intraship", propOrder = {
    "productID",
    "account",
    "attendance",
    "pickupDate",
    "readyByTime",
    "closingTime",
    "remark",
    "pickupLocation",
    "amountOfPieces",
    "amountOfPallets",
    "weightInKG",
    "countOfShipments",
    "totalVolumeWeight",
    "maxLengthInCM",
    "maxWidthInCM",
    "maxHeightInCM"
})
public class PickupBookingInformationType {

    @XmlElement(name = "ProductID", required = true)
    protected String productID;
    @XmlElement(name = "Account", required = true)
    protected String account;
    @XmlElement(name = "Attendance")
    protected String attendance;
    @XmlElement(name = "PickupDate", required = true)
    protected String pickupDate;
    @XmlElement(name = "ReadyByTime", required = true)
    protected String readyByTime;
    @XmlElement(name = "ClosingTime", required = true)
    protected String closingTime;
    @XmlElement(name = "Remark")
    protected String remark;
    @XmlElement(name = "PickupLocation")
    protected String pickupLocation;
    @XmlElement(name = "AmountOfPieces")
    protected BigInteger amountOfPieces;
    @XmlElement(name = "AmountOfPallets")
    protected BigInteger amountOfPallets;
    @XmlElement(name = "WeightInKG")
    protected BigDecimal weightInKG;
    @XmlElement(name = "CountOfShipments")
    protected BigInteger countOfShipments;
    @XmlElement(name = "TotalVolumeWeight")
    protected BigDecimal totalVolumeWeight;
    @XmlElement(name = "MaxLengthInCM")
    protected BigDecimal maxLengthInCM;
    @XmlElement(name = "MaxWidthInCM")
    protected BigDecimal maxWidthInCM;
    @XmlElement(name = "MaxHeightInCM")
    protected BigDecimal maxHeightInCM;

    /**
     * Ruft den Wert der productID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductID() {
        return productID;
    }

    /**
     * Legt den Wert der productID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductID(String value) {
        this.productID = value;
    }

    /**
     * Ruft den Wert der account-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccount() {
        return account;
    }

    /**
     * Legt den Wert der account-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccount(String value) {
        this.account = value;
    }

    /**
     * Ruft den Wert der attendance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttendance() {
        return attendance;
    }

    /**
     * Legt den Wert der attendance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttendance(String value) {
        this.attendance = value;
    }

    /**
     * Ruft den Wert der pickupDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickupDate() {
        return pickupDate;
    }

    /**
     * Legt den Wert der pickupDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickupDate(String value) {
        this.pickupDate = value;
    }

    /**
     * Ruft den Wert der readyByTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReadyByTime() {
        return readyByTime;
    }

    /**
     * Legt den Wert der readyByTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReadyByTime(String value) {
        this.readyByTime = value;
    }

    /**
     * Ruft den Wert der closingTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClosingTime() {
        return closingTime;
    }

    /**
     * Legt den Wert der closingTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClosingTime(String value) {
        this.closingTime = value;
    }

    /**
     * Ruft den Wert der remark-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Legt den Wert der remark-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

    /**
     * Ruft den Wert der pickupLocation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickupLocation() {
        return pickupLocation;
    }

    /**
     * Legt den Wert der pickupLocation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickupLocation(String value) {
        this.pickupLocation = value;
    }

    /**
     * Ruft den Wert der amountOfPieces-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAmountOfPieces() {
        return amountOfPieces;
    }

    /**
     * Legt den Wert der amountOfPieces-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAmountOfPieces(BigInteger value) {
        this.amountOfPieces = value;
    }

    /**
     * Ruft den Wert der amountOfPallets-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAmountOfPallets() {
        return amountOfPallets;
    }

    /**
     * Legt den Wert der amountOfPallets-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAmountOfPallets(BigInteger value) {
        this.amountOfPallets = value;
    }

    /**
     * Ruft den Wert der weightInKG-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeightInKG() {
        return weightInKG;
    }

    /**
     * Legt den Wert der weightInKG-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWeightInKG(BigDecimal value) {
        this.weightInKG = value;
    }

    /**
     * Ruft den Wert der countOfShipments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCountOfShipments() {
        return countOfShipments;
    }

    /**
     * Legt den Wert der countOfShipments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCountOfShipments(BigInteger value) {
        this.countOfShipments = value;
    }

    /**
     * Ruft den Wert der totalVolumeWeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalVolumeWeight() {
        return totalVolumeWeight;
    }

    /**
     * Legt den Wert der totalVolumeWeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalVolumeWeight(BigDecimal value) {
        this.totalVolumeWeight = value;
    }

    /**
     * Ruft den Wert der maxLengthInCM-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxLengthInCM() {
        return maxLengthInCM;
    }

    /**
     * Legt den Wert der maxLengthInCM-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxLengthInCM(BigDecimal value) {
        this.maxLengthInCM = value;
    }

    /**
     * Ruft den Wert der maxWidthInCM-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxWidthInCM() {
        return maxWidthInCM;
    }

    /**
     * Legt den Wert der maxWidthInCM-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxWidthInCM(BigDecimal value) {
        this.maxWidthInCM = value;
    }

    /**
     * Ruft den Wert der maxHeightInCM-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxHeightInCM() {
        return maxHeightInCM;
    }

    /**
     * Legt den Wert der maxHeightInCM-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxHeightInCM(BigDecimal value) {
        this.maxHeightInCM = value;
    }

}
