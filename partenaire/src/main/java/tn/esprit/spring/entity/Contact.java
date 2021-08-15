package tn.esprit.spring.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Contact {
    private Classification contact_categorie;
    private Classification contact_value;
    @JacksonXmlProperty(localName = "contact-categorie")

    public Classification getContact_categorie() {
        return contact_categorie;
    }

    public void setContact_categorie(Classification contact_categorie) {
        this.contact_categorie = contact_categorie;
    }
    @JacksonXmlProperty(localName = "contact-value")

    public Classification getContact_value() {
        return contact_value;
    }

    public void setContact_value(Classification contact_value) {
        this.contact_value = contact_value;
    }
}
