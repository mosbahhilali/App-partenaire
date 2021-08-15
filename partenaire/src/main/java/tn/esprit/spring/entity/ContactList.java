package tn.esprit.spring.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

public class ContactList {
    @JacksonXmlProperty(localName = "contact")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Contact> contact_list;

    public List<Contact> getContact_list() {
        return contact_list;
    }

    public void setContact_list(List<Contact> contact_list) {
        this.contact_list = contact_list;
    }

    public ContactList(List<Contact> contact_list) {
        this.contact_list = contact_list;
    }
    public ContactList() {
super();
    }
}
