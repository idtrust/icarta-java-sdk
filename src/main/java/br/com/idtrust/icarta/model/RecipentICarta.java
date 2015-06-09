package br.com.idtrust.icarta.model;

import java.io.Serializable;

public class RecipentICarta implements Serializable {

    private static final long serialVersionUID = -8732932751608342142L;

    private EmailAddress emailAddress;
    private RecipentType type;

    private RecipentICarta() {
    }

    public RecipentICarta(String name, String email, RecipentType type) {
        this();
        this.emailAddress = new EmailAddress(name, email);
        this.type = type;
    }

    public EmailAddress getEmailAddress() {
        return emailAddress;
    }

    public RecipentType getType() {
        return type;
    }

}
