
package br.com.idtrust.sdk.icarta.ws.soap.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sendTrackedEmailRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendTrackedEmailRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="credentials" type="{http://webservice.icarta.pro/}credentials"/>
 *         &lt;element name="trackedEmails">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="trackedEmail" type="{http://webservice.icarta.pro/}trackedEmail" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendTrackedEmailRequest", propOrder = {
    "credentials",
    "trackedEmails"
})
public class SendTrackedEmailRequest {

    @XmlElement(required = true)
    protected Credentials credentials;
    @XmlElement(required = true)
    protected SendTrackedEmailRequest.TrackedEmails trackedEmails;

    /**
     * Gets the value of the credentials property.
     * 
     * @return
     *     possible object is
     *     {@link Credentials }
     *     
     */
    public Credentials getCredentials() {
        return credentials;
    }

    /**
     * Sets the value of the credentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link Credentials }
     *     
     */
    public void setCredentials(Credentials value) {
        this.credentials = value;
    }

    /**
     * Gets the value of the trackedEmails property.
     * 
     * @return
     *     possible object is
     *     {@link SendTrackedEmailRequest.TrackedEmails }
     *     
     */
    public SendTrackedEmailRequest.TrackedEmails getTrackedEmails() {
        return trackedEmails;
    }

    /**
     * Sets the value of the trackedEmails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendTrackedEmailRequest.TrackedEmails }
     *     
     */
    public void setTrackedEmails(SendTrackedEmailRequest.TrackedEmails value) {
        this.trackedEmails = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="trackedEmail" type="{http://webservice.icarta.pro/}trackedEmail" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "trackedEmail"
    })
    public static class TrackedEmails {

        @XmlElement(required = true)
        protected List<TrackedEmail> trackedEmail;

        /**
         * Gets the value of the trackedEmail property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the trackedEmail property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTrackedEmail().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TrackedEmail }
         * 
         * 
         */
        public List<TrackedEmail> getTrackedEmail() {
            if (trackedEmail == null) {
                trackedEmail = new ArrayList<TrackedEmail>();
            }
            return this.trackedEmail;
        }

    }

}
