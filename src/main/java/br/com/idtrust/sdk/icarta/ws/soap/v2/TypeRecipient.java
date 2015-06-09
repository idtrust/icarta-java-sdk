
package br.com.idtrust.sdk.icarta.ws.soap.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeRecipient.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeRecipient">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TO"/>
 *     &lt;enumeration value="CC"/>
 *     &lt;enumeration value="BCC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeRecipient")
@XmlEnum
public enum TypeRecipient {

    TO,
    CC,
    BCC;

    public String value() {
        return name();
    }

    public static TypeRecipient fromValue(String v) {
        return valueOf(v);
    }

}
