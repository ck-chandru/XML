//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.06.21 at 04:07:04 PM IST 
//


package com.ck.framework.pojo.cano;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntermediateSecurityDistributionType5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="IntermediateSecurityDistributionType5Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BIDS"/&gt;
 *     &lt;enumeration value="DRIP"/&gt;
 *     &lt;enumeration value="DVCA"/&gt;
 *     &lt;enumeration value="DVOP"/&gt;
 *     &lt;enumeration value="EXRI"/&gt;
 *     &lt;enumeration value="PRIO"/&gt;
 *     &lt;enumeration value="DVSC"/&gt;
 *     &lt;enumeration value="DVSE"/&gt;
 *     &lt;enumeration value="INTR"/&gt;
 *     &lt;enumeration value="LIQU"/&gt;
 *     &lt;enumeration value="SOFF"/&gt;
 *     &lt;enumeration value="SPLF"/&gt;
 *     &lt;enumeration value="BONU"/&gt;
 *     &lt;enumeration value="EXOF"/&gt;
 *     &lt;enumeration value="MRGR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IntermediateSecurityDistributionType5Code")
@XmlEnum
public enum IntermediateSecurityDistributionType5Code {

    BIDS,
    DRIP,
    DVCA,
    DVOP,
    EXRI,
    PRIO,
    DVSC,
    DVSE,
    INTR,
    LIQU,
    SOFF,
    SPLF,
    BONU,
    EXOF,
    MRGR;

    public String value() {
        return name();
    }

    public static IntermediateSecurityDistributionType5Code fromValue(String v) {
        return valueOf(v);
    }

}
