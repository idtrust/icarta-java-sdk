
package br.com.idtrust.sdk.icarta.ws.soap.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPericiaResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPericiaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://webservice.icarta.pro/}sendPericiaResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPericiaResponse", propOrder = {
    "sendPericiaResponse"
})
public class GetPericiaResponse {

    @XmlElement(namespace = "http://webservice.icarta.pro/")
    protected SendPericiaResponse sendPericiaResponse;

    /**
     * Gets the value of the sendPericiaResponse property.
     * 
     * @return
     *     possible object is
     *     {@link SendPericiaResponse }
     *     
     */
    public SendPericiaResponse getSendPericiaResponse() {
        return sendPericiaResponse;
    }

    /**
     * Sets the value of the sendPericiaResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendPericiaResponse }
     *     
     */
    public void setSendPericiaResponse(SendPericiaResponse value) {
        this.sendPericiaResponse = value;
    }

}
