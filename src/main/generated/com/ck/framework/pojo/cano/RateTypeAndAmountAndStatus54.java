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
 * <p>Java class for RateTypeAndAmountAndStatus54 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RateTypeAndAmountAndStatus54"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RateTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}DeemedRateType2Choice"/&gt;
 *         &lt;element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RestrictedFINActiveCurrencyAnd13DecimalAmount"/&gt;
 *         &lt;element name="RateSts" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}RateStatus4Choice" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateTypeAndAmountAndStatus54", propOrder = {
    "rateTp",
    "amt",
    "rateSts"
})
public class RateTypeAndAmountAndStatus54 {

    @XmlElement(name = "RateTp", required = true)
    protected DeemedRateType2Choice rateTp;
    @XmlElement(name = "Amt", required = true)
    protected RestrictedFINActiveCurrencyAnd13DecimalAmount amt;
    @XmlElement(name = "RateSts")
    protected RateStatus4Choice rateSts;

    /**
     * Gets the value of the rateTp property.
     * 
     * @return
     *     possible object is
     *     {@link DeemedRateType2Choice }
     *     
     */
    public DeemedRateType2Choice getRateTp() {
        return rateTp;
    }

    /**
     * Sets the value of the rateTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeemedRateType2Choice }
     *     
     */
    public void setRateTp(DeemedRateType2Choice value) {
        this.rateTp = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAnd13DecimalAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public void setAmt(RestrictedFINActiveCurrencyAnd13DecimalAmount value) {
        this.amt = value;
    }

    /**
     * Gets the value of the rateSts property.
     * 
     * @return
     *     possible object is
     *     {@link RateStatus4Choice }
     *     
     */
    public RateStatus4Choice getRateSts() {
        return rateSts;
    }

    /**
     * Sets the value of the rateSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateStatus4Choice }
     *     
     */
    public void setRateSts(RateStatus4Choice value) {
        this.rateSts = value;
    }

}
