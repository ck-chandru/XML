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
 * <p>Java class for WithholdingTaxRateType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="WithholdingTaxRateType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BWIT"/&gt;
 *     &lt;enumeration value="FTCA"/&gt;
 *     &lt;enumeration value="NRAT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WithholdingTaxRateType1Code")
@XmlEnum
public enum WithholdingTaxRateType1Code {

    BWIT,
    FTCA,
    NRAT;

    public String value() {
        return name();
    }

    public static WithholdingTaxRateType1Code fromValue(String v) {
        return valueOf(v);
    }

}
