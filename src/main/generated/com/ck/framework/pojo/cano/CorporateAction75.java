//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.06.21 at 04:07:04 PM IST 
//


package com.ck.framework.pojo.cano;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateAction75 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorporateAction75"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DtDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}CorporateActionDate89" minOccurs="0"/&gt;
 *         &lt;element name="EvtStag" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}CorporateActionEventStageFormat15Choice" minOccurs="0"/&gt;
 *         &lt;element name="AddtlBizPrcInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}AdditionalBusinessProcessFormat20Choice" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="IntrmdtSctiesDstrbtnTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}IntermediateSecuritiesDistributionTypeFormat18Choice" minOccurs="0"/&gt;
 *         &lt;element name="LtryTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}LotteryTypeFormat5Choice" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateAction75", propOrder = {
    "dtDtls",
    "evtStag",
    "addtlBizPrcInd",
    "intrmdtSctiesDstrbtnTp",
    "ltryTp"
})
public class CorporateAction75 {

    @XmlElement(name = "DtDtls")
    protected CorporateActionDate89 dtDtls;
    @XmlElement(name = "EvtStag")
    protected CorporateActionEventStageFormat15Choice evtStag;
    @XmlElement(name = "AddtlBizPrcInd")
    protected List<AdditionalBusinessProcessFormat20Choice> addtlBizPrcInd;
    @XmlElement(name = "IntrmdtSctiesDstrbtnTp")
    protected IntermediateSecuritiesDistributionTypeFormat18Choice intrmdtSctiesDstrbtnTp;
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
     * {@link AdditionalBusinessProcessFormat20Choice }
     * 
     * 
     */
    public List<AdditionalBusinessProcessFormat20Choice> getAddtlBizPrcInd() {
        if (addtlBizPrcInd == null) {
            addtlBizPrcInd = new ArrayList<AdditionalBusinessProcessFormat20Choice>();
        }
        return this.addtlBizPrcInd;
    }

    /**
     * Gets the value of the intrmdtSctiesDstrbtnTp property.
     * 
     * @return
     *     possible object is
     *     {@link IntermediateSecuritiesDistributionTypeFormat18Choice }
     *     
     */
    public IntermediateSecuritiesDistributionTypeFormat18Choice getIntrmdtSctiesDstrbtnTp() {
        return intrmdtSctiesDstrbtnTp;
    }

    /**
     * Sets the value of the intrmdtSctiesDstrbtnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntermediateSecuritiesDistributionTypeFormat18Choice }
     *     
     */
    public void setIntrmdtSctiesDstrbtnTp(IntermediateSecuritiesDistributionTypeFormat18Choice value) {
        this.intrmdtSctiesDstrbtnTp = value;
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
