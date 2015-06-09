
package br.com.idtrust.sdk.icarta.ws.soap.v2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.idtrust.icarta.ws.v200 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetPericiaResponse_QNAME = new QName("http://webservice.icarta.pro/", "getPericiaResponse");
    private final static QName _SendPericiaResponse_QNAME = new QName("http://webservice.icarta.pro/", "sendPericiaResponse");
    private final static QName _SendTrackedEmailResponse_QNAME = new QName("http://webservice.icarta.pro/", "sendTrackedEmailResponse");
    private final static QName _SendEmailResponse_QNAME = new QName("http://webservice.icarta.pro/", "sendEmailResponse");
    private final static QName _GetPericia_QNAME = new QName("http://webservice.icarta.pro/", "getPericia");
    private final static QName _SendPericia_QNAME = new QName("http://webservice.icarta.pro/", "sendPericia");
    private final static QName _SendEmail_QNAME = new QName("http://webservice.icarta.pro/", "sendEmail");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.idtrust.icarta.ws.v200
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TrackedEmail }
     * 
     */
    public TrackedEmail createTrackedEmail() {
        return new TrackedEmail();
    }

    /**
     * Create an instance of {@link SendTrackedEmailRequest }
     * 
     */
    public SendTrackedEmailRequest createSendTrackedEmailRequest() {
        return new SendTrackedEmailRequest();
    }

    /**
     * Create an instance of {@link SendTrackedEmailResponse }
     * 
     */
    public SendTrackedEmailResponse createSendTrackedEmailResponse() {
        return new SendTrackedEmailResponse();
    }

    /**
     * Create an instance of {@link GetPericia }
     * 
     */
    public GetPericia createGetPericia() {
        return new GetPericia();
    }

    /**
     * Create an instance of {@link SendPericiaRequest }
     * 
     */
    public SendPericiaRequest createSendPericiaRequest() {
        return new SendPericiaRequest();
    }

    /**
     * Create an instance of {@link SendEmail }
     * 
     */
    public SendEmail createSendEmail() {
        return new SendEmail();
    }

    /**
     * Create an instance of {@link SendEmailResponse }
     * 
     */
    public SendEmailResponse createSendEmailResponse() {
        return new SendEmailResponse();
    }

    /**
     * Create an instance of {@link GetPericiaResponse }
     * 
     */
    public GetPericiaResponse createGetPericiaResponse() {
        return new GetPericiaResponse();
    }

    /**
     * Create an instance of {@link SendPericiaResponse }
     * 
     */
    public SendPericiaResponse createSendPericiaResponse() {
        return new SendPericiaResponse();
    }

    /**
     * Create an instance of {@link Credentials }
     * 
     */
    public Credentials createCredentials() {
        return new Credentials();
    }

    /**
     * Create an instance of {@link TrackedEmailResponse }
     * 
     */
    public TrackedEmailResponse createTrackedEmailResponse() {
        return new TrackedEmailResponse();
    }

    /**
     * Create an instance of {@link Attachment }
     * 
     */
    public Attachment createAttachment() {
        return new Attachment();
    }

    /**
     * Create an instance of {@link Sender }
     * 
     */
    public Sender createSender() {
        return new Sender();
    }

    /**
     * Create an instance of {@link Recipient }
     * 
     */
    public Recipient createRecipient() {
        return new Recipient();
    }

    /**
     * Create an instance of {@link TrackedEmail.Recipients }
     * 
     */
    public TrackedEmail.Recipients createTrackedEmailRecipients() {
        return new TrackedEmail.Recipients();
    }

    /**
     * Create an instance of {@link TrackedEmail.Attachments }
     * 
     */
    public TrackedEmail.Attachments createTrackedEmailAttachments() {
        return new TrackedEmail.Attachments();
    }

    /**
     * Create an instance of {@link SendTrackedEmailRequest.TrackedEmails }
     * 
     */
    public SendTrackedEmailRequest.TrackedEmails createSendTrackedEmailRequestTrackedEmails() {
        return new SendTrackedEmailRequest.TrackedEmails();
    }

    /**
     * Create an instance of {@link SendTrackedEmailResponse.TrackedEmailResponses }
     * 
     */
    public SendTrackedEmailResponse.TrackedEmailResponses createSendTrackedEmailResponseTrackedEmailResponses() {
        return new SendTrackedEmailResponse.TrackedEmailResponses();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPericiaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.icarta.pro/", name = "getPericiaResponse")
    public JAXBElement<GetPericiaResponse> createGetPericiaResponse(GetPericiaResponse value) {
        return new JAXBElement<GetPericiaResponse>(_GetPericiaResponse_QNAME, GetPericiaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendPericiaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.icarta.pro/", name = "sendPericiaResponse")
    public JAXBElement<SendPericiaResponse> createSendPericiaResponse(SendPericiaResponse value) {
        return new JAXBElement<SendPericiaResponse>(_SendPericiaResponse_QNAME, SendPericiaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendTrackedEmailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.icarta.pro/", name = "sendTrackedEmailResponse")
    public JAXBElement<SendTrackedEmailResponse> createSendTrackedEmailResponse(SendTrackedEmailResponse value) {
        return new JAXBElement<SendTrackedEmailResponse>(_SendTrackedEmailResponse_QNAME, SendTrackedEmailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendEmailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.icarta.pro/", name = "sendEmailResponse")
    public JAXBElement<SendEmailResponse> createSendEmailResponse(SendEmailResponse value) {
        return new JAXBElement<SendEmailResponse>(_SendEmailResponse_QNAME, SendEmailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPericia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.icarta.pro/", name = "getPericia")
    public JAXBElement<GetPericia> createGetPericia(GetPericia value) {
        return new JAXBElement<GetPericia>(_GetPericia_QNAME, GetPericia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendPericiaRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.icarta.pro/", name = "sendPericia")
    public JAXBElement<SendPericiaRequest> createSendPericia(SendPericiaRequest value) {
        return new JAXBElement<SendPericiaRequest>(_SendPericia_QNAME, SendPericiaRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendEmail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.icarta.pro/", name = "sendEmail")
    public JAXBElement<SendEmail> createSendEmail(SendEmail value) {
        return new JAXBElement<SendEmail>(_SendEmail_QNAME, SendEmail.class, null, value);
    }

}
