package br.com.idtrust.icarta.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class EmailICarta implements Serializable {

    private static final long serialVersionUID = 70145774783097110L;

    private String subject;
    private EmailAddress from;
    private List<RecipentICarta> recipients;
    private String message;
    private String emailUniqueId;
    private List<AttachmentICarta> attachments;

    public void setFrom(String email) {
        this.from = new EmailAddress(email, email);
    }

    public void setFrom(String name, String email) {
        this.from = new EmailAddress(name, email);
    }

    public void addRecipientTO(String emailAddress) {
        addRecipientTO(emailAddress, emailAddress);
    }

    public void addRecipientTO(String name, String emailAddress) {
        RecipentICarta recipent = new RecipentICarta(name, emailAddress,
                RecipentType.TO);
        getRecipients().add(recipent);
    }

    public void addRecipientCC(String emailAddress) {
        addRecipientTO(emailAddress, emailAddress);
    }

    public void addRecipientCC(String name, String emailAddress) {
        RecipentICarta recipent = new RecipentICarta(name, emailAddress,
                RecipentType.CC);
        getRecipients().add(recipent);
    }

    public void addRecipientBCC(String emailAddress) {
        addRecipientTO(emailAddress, emailAddress);
    }

    public void addRecipientBCC(String name, String emailAddress) {
        RecipentICarta recipent = new RecipentICarta(name, emailAddress,
                RecipentType.BCC);
        getRecipients().add(recipent);
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public List<RecipentICarta> getRecipients() {
        if (recipients == null) {
            recipients = new ArrayList<RecipentICarta>();
        }
        return recipients;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setEmailUniqueId(String emailUniqueId) {
        this.emailUniqueId = emailUniqueId;
    }

    public String getSubject() {
        return subject;
    }

    public String getMessage() {
        return message;
    }

    public String getEmailUniqueId() {
        return emailUniqueId;
    }

    public EmailAddress getFrom() {
        return from;
    }

    public void addAttachmentICarta(String fileName, String contentType,
            byte[] content) {
        AttachmentICarta attachment = new AttachmentICarta(fileName,
                contentType, content);
        getAttachments().add(attachment);
    }

    public List<AttachmentICarta> getAttachments() {
        if (attachments == null) {
            attachments = new ArrayList<>();
        }
        return attachments;
    }

}
