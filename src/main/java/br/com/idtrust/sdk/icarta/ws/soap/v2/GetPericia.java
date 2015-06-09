
package br.com.idtrust.sdk.icarta.ws.soap.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPericia complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPericia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://webservice.icarta.pro/}sendPericia" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPericia", propOrder = {
    "sendPericia"
})
public class GetPericia {

    @XmlElement(namespace = "http://webservice.icarta.pro/")
    protected SendPericiaRequest sendPericia;

    /**
     * Gets the value of the sendPericia property.
     * 
     * @return
     *     possible object is
     *     {@link SendPericiaRequest }
     *     
     */
    public SendPericiaRequest getSendPericia() {
        return sendPericia;
    }

    /**
     * Sets the value of the sendPericia property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendPericiaRequest }
     *     
     */
    public void setSendPericia(SendPericiaRequest value) {
        this.sendPericia = value;
    }

}
