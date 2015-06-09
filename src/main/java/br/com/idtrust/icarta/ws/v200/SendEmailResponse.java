
package br.com.idtrust.icarta.ws.v200;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sendEmailResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendEmailResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://webservice.icarta.pro/}sendTrackedEmailResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendEmailResponse", propOrder = {
    "sendTrackedEmailResponse"
})
public class SendEmailResponse {

    @XmlElement(namespace = "http://webservice.icarta.pro/")
    protected SendTrackedEmailResponse sendTrackedEmailResponse;

    /**
     * Gets the value of the sendTrackedEmailResponse property.
     * 
     * @return
     *     possible object is
     *     {@link SendTrackedEmailResponse }
     *     
     */
    public SendTrackedEmailResponse getSendTrackedEmailResponse() {
        return sendTrackedEmailResponse;
    }

    /**
     * Sets the value of the sendTrackedEmailResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendTrackedEmailResponse }
     *     
     */
    public void setSendTrackedEmailResponse(SendTrackedEmailResponse value) {
        this.sendTrackedEmailResponse = value;
    }

}
