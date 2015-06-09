
package br.com.idtrust.sdk.icarta.ws.soap.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sendTrackedEmailResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendTrackedEmailResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://webservice.icarta.pro/}statusResponseWS"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="trackedEmailResponses" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="trackedEmailResponse" type="{http://webservice.icarta.pro/}trackedEmailResponse" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "sendTrackedEmailResponse", propOrder = {
    "status",
    "description",
    "trackedEmailResponses"
})
public class SendTrackedEmailResponse {

    @XmlElement(required = true)
    protected String status;
    @XmlElement(required = true)
    protected String description;
    protected SendTrackedEmailResponse.TrackedEmailResponses trackedEmailResponses;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the trackedEmailResponses property.
     * 
     * @return
     *     possible object is
     *     {@link SendTrackedEmailResponse.TrackedEmailResponses }
     *     
     */
    public SendTrackedEmailResponse.TrackedEmailResponses getTrackedEmailResponses() {
        return trackedEmailResponses;
    }

    /**
     * Sets the value of the trackedEmailResponses property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendTrackedEmailResponse.TrackedEmailResponses }
     *     
     */
    public void setTrackedEmailResponses(SendTrackedEmailResponse.TrackedEmailResponses value) {
        this.trackedEmailResponses = value;
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
     *         &lt;element name="trackedEmailResponse" type="{http://webservice.icarta.pro/}trackedEmailResponse" maxOccurs="unbounded" minOccurs="0"/>
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
        "trackedEmailResponse"
    })
    public static class TrackedEmailResponses {

        protected List<TrackedEmailResponse> trackedEmailResponse;

        /**
         * Gets the value of the trackedEmailResponse property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the trackedEmailResponse property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTrackedEmailResponse().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TrackedEmailResponse }
         * 
         * 
         */
        public List<TrackedEmailResponse> getTrackedEmailResponse() {
            if (trackedEmailResponse == null) {
                trackedEmailResponse = new ArrayList<TrackedEmailResponse>();
            }
            return this.trackedEmailResponse;
        }

    }

}
