//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.06.21 at 04:07:05 PM IST 
//


package com.ck.framework.pojo.canoe;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionEventStage4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CorporateActionEventStage4Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FULL"/&gt;
 *     &lt;enumeration value="PART"/&gt;
 *     &lt;enumeration value="RESC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CorporateActionEventStage4Code")
@XmlEnum
public enum CorporateActionEventStage4Code {

    FULL,
    PART,
    RESC;

    public String value() {
        return name();
    }

    public static CorporateActionEventStage4Code fromValue(String v) {
        return valueOf(v);
    }

}
