
package intraship.ws.de;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Details of a shipment.
 * 
 * <p>Java-Klasse für ShipmentDetailsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ShipmentDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ShipmentDate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="10"/>
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DeclaredValueOfGoods" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float">
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DeclaredValueOfGoodsCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentDetailsType", namespace = "http://de.ws.intraship", propOrder = {
    "productCode",
    "shipmentDate",
    "declaredValueOfGoods",
    "declaredValueOfGoodsCurrency"
})
@XmlSeeAlso({
    ShipmentDetailsDDType.class,
    ShipmentDetailsTDType.class
})
public class ShipmentDetailsType {

    @XmlElement(name = "ProductCode", required = true)
    protected String productCode;
    @XmlElement(name = "ShipmentDate", required = true)
    protected String shipmentDate;
    @XmlElement(name = "DeclaredValueOfGoods")
    protected Float declaredValueOfGoods;
    @XmlElement(name = "DeclaredValueOfGoodsCurrency")
    protected String declaredValueOfGoodsCurrency;

    /**
     * Ruft den Wert der productCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * Legt den Wert der productCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCode(String value) {
        this.productCode = value;
    }

    /**
     * Ruft den Wert der shipmentDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentDate() {
        return shipmentDate;
    }

    /**
     * Legt den Wert der shipmentDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentDate(String value) {
        this.shipmentDate = value;
    }

    /**
     * Ruft den Wert der declaredValueOfGoods-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDeclaredValueOfGoods() {
        return declaredValueOfGoods;
    }

    /**
     * Legt den Wert der declaredValueOfGoods-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDeclaredValueOfGoods(Float value) {
        this.declaredValueOfGoods = value;
    }

    /**
     * Ruft den Wert der declaredValueOfGoodsCurrency-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeclaredValueOfGoodsCurrency() {
        return declaredValueOfGoodsCurrency;
    }

    /**
     * Legt den Wert der declaredValueOfGoodsCurrency-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeclaredValueOfGoodsCurrency(String value) {
        this.declaredValueOfGoodsCurrency = value;
    }

}
