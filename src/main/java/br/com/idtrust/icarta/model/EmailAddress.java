package br.com.idtrust.icarta.model;

import java.io.Serializable;

public class EmailAddress implements Serializable {

    private static final long serialVersionUID = -2921690050241438783L;

    private String name;
    private String email;

    private EmailAddress() {
    }

    public EmailAddress(String name, String email) {
        this();
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
