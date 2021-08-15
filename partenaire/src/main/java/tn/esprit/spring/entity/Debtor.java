package tn.esprit.spring.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Debtor {
    @JacksonXmlProperty(localName = "Classification")
    private Classification deb;

    public Classification getDeb() {
        return deb;
    }

    public void setDeb(Classification deb) {
        this.deb = deb;
    }

    public Debtor(Classification deb) {
        this.deb = deb;
    }

    public Debtor() {
        super();
    }
}
