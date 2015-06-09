package br.com.idtrust.sdk.icarta.model;

import java.io.Serializable;

public class Recipient implements Serializable {

    private static final long serialVersionUID = -8732932751608342142L;

    private EmailAddress emailAddress;
    private RecipientType type;

    private Recipient() {
    }

    public Recipient(String name, String email, RecipientType type) {
        this();
        this.emailAddress = new EmailAddress(name, email);
        this.type = type;
    }

    public EmailAddress getEmailAddress() {
        return emailAddress;
    }

    public RecipientType getType() {
        return type;
    }

}
