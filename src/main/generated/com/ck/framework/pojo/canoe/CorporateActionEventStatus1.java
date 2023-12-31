//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.06.21 at 04:07:05 PM IST 
//


package com.ck.framework.pojo.canoe;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionEventStatus1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorporateActionEventStatus1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EvtCmpltnsSts" type="{urn:iso:std:iso:20022:tech:xsd:seev.039.002.12}EventCompletenessStatus1Code"/&gt;
 *         &lt;element name="EvtConfSts" type="{urn:iso:std:iso:20022:tech:xsd:seev.039.002.12}EventConfirmationStatus1Code"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionEventStatus1", propOrder = {
    "evtCmpltnsSts",
    "evtConfSts"
})
public class CorporateActionEventStatus1 {

    @XmlElement(name = "EvtCmpltnsSts", required = true)
    @XmlSchemaType(name = "string")
    protected EventCompletenessStatus1Code evtCmpltnsSts;
    @XmlElement(name = "EvtConfSts", required = true)
    @XmlSchemaType(name = "string")
    protected EventConfirmationStatus1Code evtConfSts;

    /**
     * Gets the value of the evtCmpltnsSts property.
     * 
     * @return
     *     possible object is
     *     {@link EventCompletenessStatus1Code }
     *     
     */
    public EventCompletenessStatus1Code getEvtCmpltnsSts() {
        return evtCmpltnsSts;
    }

    /**
     * Sets the value of the evtCmpltnsSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventCompletenessStatus1Code }
     *     
     */
    public void setEvtCmpltnsSts(EventCompletenessStatus1Code value) {
        this.evtCmpltnsSts = value;
    }

    /**
     * Gets the value of the evtConfSts property.
     * 
     * @return
     *     possible object is
     *     {@link EventConfirmationStatus1Code }
     *     
     */
    public EventConfirmationStatus1Code getEvtConfSts() {
        return evtConfSts;
    }

    /**
     * Sets the value of the evtConfSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventConfirmationStatus1Code }
     *     
     */
    public void setEvtConfSts(EventConfirmationStatus1Code value) {
        this.evtConfSts = value;
    }

}
