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
 * <p>Java class for CorporateActionPeriod13 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorporateActionPeriod13"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PricClctnPrd" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}Period11" minOccurs="0"/&gt;
 *         &lt;element name="ActnPrd" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}Period11" minOccurs="0"/&gt;
 *         &lt;element name="ParllTradgPrd" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}Period11" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionPeriod13", propOrder = {
    "pricClctnPrd",
    "actnPrd",
    "parllTradgPrd"
})
public class CorporateActionPeriod13 {

    @XmlElement(name = "PricClctnPrd")
    protected Period11 pricClctnPrd;
    @XmlElement(name = "ActnPrd")
    protected Period11 actnPrd;
    @XmlElement(name = "ParllTradgPrd")
    protected Period11 parllTradgPrd;

    /**
     * Gets the value of the pricClctnPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period11 }
     *     
     */
    public Period11 getPricClctnPrd() {
        return pricClctnPrd;
    }

    /**
     * Sets the value of the pricClctnPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period11 }
     *     
     */
    public void setPricClctnPrd(Period11 value) {
        this.pricClctnPrd = value;
    }

    /**
     * Gets the value of the actnPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period11 }
     *     
     */
    public Period11 getActnPrd() {
        return actnPrd;
    }

    /**
     * Sets the value of the actnPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period11 }
     *     
     */
    public void setActnPrd(Period11 value) {
        this.actnPrd = value;
    }

    /**
     * Gets the value of the parllTradgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period11 }
     *     
     */
    public Period11 getParllTradgPrd() {
        return parllTradgPrd;
    }

    /**
     * Sets the value of the parllTradgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period11 }
     *     
     */
    public void setParllTradgPrd(Period11 value) {
        this.parllTradgPrd = value;
    }

}