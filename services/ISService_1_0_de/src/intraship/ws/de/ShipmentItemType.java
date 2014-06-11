
package intraship.ws.de;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Item/Piece data.
 * 
 * <p>Java-Klasse für ShipmentItemType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ShipmentItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WeightInKG">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minInclusive value="0.0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LengthInCM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WidthInCM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HeightInCM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="0"/>
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
@XmlType(name = "ShipmentItemType", namespace = "http://de.ws.intraship", propOrder = {
    "weightInKG",
    "lengthInCM",
    "widthInCM",
    "heightInCM"
})
@XmlSeeAlso({
    ShipmentItemTDType.class,
    ShipmentItemDDType.class
})
public class ShipmentItemType {

    @XmlElement(name = "WeightInKG", required = true)
    protected BigDecimal weightInKG;
    @XmlElement(name = "LengthInCM")
    protected BigInteger lengthInCM;
    @XmlElement(name = "WidthInCM")
    protected BigInteger widthInCM;
    @XmlElement(name = "HeightInCM")
    protected BigInteger heightInCM;

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
     * Ruft den Wert der lengthInCM-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLengthInCM() {
        return lengthInCM;
    }

    /**
     * Legt den Wert der lengthInCM-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLengthInCM(BigInteger value) {
        this.lengthInCM = value;
    }

    /**
     * Ruft den Wert der widthInCM-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWidthInCM() {
        return widthInCM;
    }

    /**
     * Legt den Wert der widthInCM-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWidthInCM(BigInteger value) {
        this.widthInCM = value;
    }

    /**
     * Ruft den Wert der heightInCM-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHeightInCM() {
        return heightInCM;
    }

    /**
     * Legt den Wert der heightInCM-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHeightInCM(BigInteger value) {
        this.heightInCM = value;
    }

}
