//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.06.21 at 04:07:04 PM IST 
//


package com.ck.framework.pojo.cano;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Quantity57Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Quantity57Choice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="OrgnlAndCurFaceAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}OriginalAndCurrentQuantities7"/&gt;
 *         &lt;element name="SgndQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}SignedQuantityFormat13"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Quantity57Choice", propOrder = {
    "orgnlAndCurFaceAmt",
    "sgndQty"
})
public class Quantity57Choice {

    @XmlElement(name = "OrgnlAndCurFaceAmt")
    protected OriginalAndCurrentQuantities7 orgnlAndCurFaceAmt;
    @XmlElement(name = "SgndQty")
    protected SignedQuantityFormat13 sgndQty;

    /**
     * Gets the value of the orgnlAndCurFaceAmt property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalAndCurrentQuantities7 }
     *     
     */
    public OriginalAndCurrentQuantities7 getOrgnlAndCurFaceAmt() {
        return orgnlAndCurFaceAmt;
    }

    /**
     * Sets the value of the orgnlAndCurFaceAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalAndCurrentQuantities7 }
     *     
     */
    public void setOrgnlAndCurFaceAmt(OriginalAndCurrentQuantities7 value) {
        this.orgnlAndCurFaceAmt = value;
    }

    /**
     * Gets the value of the sgndQty property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat13 }
     *     
     */
    public SignedQuantityFormat13 getSgndQty() {
        return sgndQty;
    }

    /**
     * Sets the value of the sgndQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat13 }
     *     
     */
    public void setSgndQty(SignedQuantityFormat13 value) {
        this.sgndQty = value;
    }

}