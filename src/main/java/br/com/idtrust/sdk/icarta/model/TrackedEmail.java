package br.com.idtrust.sdk.icarta.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.validator.routines.EmailValidator;

public class TrackedEmail implements Serializable {

    private static final long serialVersionUID = 70145774783097110L;

    private String subject;
    private EmailAddress from;
    private List<Recipient> recipients;
    private String message;
    private String uniqueId;
    private List<Attachment> attachments;

    public TrackedEmail from(String email) {
        from(email, email);
        return this;
    }

    public TrackedEmail from(String name, String email) {
        validEmail(email);
        this.from = new EmailAddress(name, email);
        return this;
    }

    public TrackedEmail to(String emailAddress) {
        return to(emailAddress, emailAddress, RecipientType.TO);
    }

    public TrackedEmail to(String name, String emailAddress) {
        return to(name, emailAddress, RecipientType.TO);
    }

    private TrackedEmail to(String name, String emailAddress,
            RecipientType recipientType) {
        validEmail(emailAddress);
        Recipient recipient = new Recipient(name, emailAddress, recipientType);
        getRecipients().add(recipient);
        return this;
    }

    private void validEmail(String emailAddress) {
        if (!EmailValidator.getInstance().isValid(emailAddress)) {
            throw new RuntimeException("E-mail inválido: " + emailAddress);
        }
    }

    public TrackedEmail withCC(String emailAddress) {
        return to(emailAddress, emailAddress, RecipientType.CC);
    }

    public TrackedEmail withCC(String name, String emailAddress) {
        return to(name, emailAddress, RecipientType.CC);
    }

    public TrackedEmail withBCC(String emailAddress) {
        return to(emailAddress, emailAddress, RecipientType.BCC);
    }

    public TrackedEmail withBCC(String name, String emailAddress) {
        return to(name, emailAddress, RecipientType.BCC);
    }

    public TrackedEmail withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    public List<Recipient> getRecipients() {
        if (recipients == null) {
            recipients = new ArrayList<>();
        }
        return recipients;
    }

    public TrackedEmail withMessage(String message) {
        this.message = message;
        return this;
    }

    public TrackedEmail withUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }

    public TrackedEmail withAttachment(String fileName, String contentType,
            byte[] content) {
        Attachment attachment = new Attachment(fileName, contentType, content);
        getAttachments().add(attachment);
        return this;
    }

    public List<Attachment> getAttachments() {
        if (attachments == null) {
            attachments = new ArrayList<>();
        }
        return attachments;
    }

    public String getSubject() {
        return subject;
    }

    public String getMessage() {
        return message;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public EmailAddress getFrom() {
        return from;
    }

}
