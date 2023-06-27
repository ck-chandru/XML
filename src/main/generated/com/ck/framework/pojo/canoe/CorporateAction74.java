//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.06.21 at 04:07:05 PM IST 
//


package com.ck.framework.pojo.canoe;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateAction74 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorporateAction74"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DtDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.039.002.12}CorporateActionDate89" minOccurs="0"/&gt;
 *         &lt;element name="EvtStag" type="{urn:iso:std:iso:20022:tech:xsd:seev.039.002.12}CorporateActionEventStageFormat15Choice" minOccurs="0"/&gt;
 *         &lt;element name="AddtlBizPrcInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.039.002.12}AdditionalBusinessProcessFormat16Choice" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LtryTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.039.002.12}LotteryTypeFormat5Choice" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateAction74", propOrder = {
    "dtDtls",
    "evtStag",
    "addtlBizPrcInd",
    "ltryTp"
})
public class CorporateAction74 {

    @XmlElement(name = "DtDtls")
    protected CorporateActionDate89 dtDtls;
    @XmlElement(name = "EvtStag")
    protected CorporateActionEventStageFormat15Choice evtStag;
    @XmlElement(name = "AddtlBizPrcInd")
    protected List<AdditionalBusinessProcessFormat16Choice> addtlBizPrcInd;
    @XmlElement(name = "LtryTp")
    protected LotteryTypeFormat5Choice ltryTp;

    /**
     * Gets the value of the dtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionDate89 }
     *     
     */
    public CorporateActionDate89 getDtDtls() {
        return dtDtls;
    }

    /**
     * Sets the value of the dtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionDate89 }
     *     
     */
    public void setDtDtls(CorporateActionDate89 value) {
        this.dtDtls = value;
    }

    /**
     * Gets the value of the evtStag property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionEventStageFormat15Choice }
     *     
     */
    public CorporateActionEventStageFormat15Choice getEvtStag() {
        return evtStag;
    }

    /**
     * Sets the value of the evtStag property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionEventStageFormat15Choice }
     *     
     */
    public void setEvtStag(CorporateActionEventStageFormat15Choice value) {
        this.evtStag = value;
    }

    /**
     * Gets the value of the addtlBizPrcInd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the addtlBizPrcInd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlBizPrcInd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalBusinessProcessFormat16Choice }
     * 
     * 
     */
    public List<AdditionalBusinessProcessFormat16Choice> getAddtlBizPrcInd() {
        if (addtlBizPrcInd == null) {
            addtlBizPrcInd = new ArrayList<AdditionalBusinessProcessFormat16Choice>();
        }
        return this.addtlBizPrcInd;
    }

    /**
     * Gets the value of the ltryTp property.
     * 
     * @return
     *     possible object is
     *     {@link LotteryTypeFormat5Choice }
     *     
     */
    public LotteryTypeFormat5Choice getLtryTp() {
        return ltryTp;
    }

    /**
     * Sets the value of the ltryTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotteryTypeFormat5Choice }
     *     
     */
    public void setLtryTp(LotteryTypeFormat5Choice value) {
        this.ltryTp = value;
    }

}
