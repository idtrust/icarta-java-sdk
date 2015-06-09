
package br.com.idtrust.icarta.ws.v200;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sendEmail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendEmail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sendTrackedEmail" type="{http://webservice.icarta.pro/}sendTrackedEmailRequest" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendEmail", propOrder = {
    "sendTrackedEmail"
})
public class SendEmail {

    @XmlElement(namespace = "http://webservice.icarta.pro/")
    protected SendTrackedEmailRequest sendTrackedEmail;

    /**
     * Gets the value of the sendTrackedEmail property.
     * 
     * @return
     *     possible object is
     *     {@link SendTrackedEmailRequest }
     *     
     */
    public SendTrackedEmailRequest getSendTrackedEmail() {
        return sendTrackedEmail;
    }

    /**
     * Sets the value of the sendTrackedEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendTrackedEmailRequest }
     *     
     */
    public void setSendTrackedEmail(SendTrackedEmailRequest value) {
        this.sendTrackedEmail = value;
    }

}
