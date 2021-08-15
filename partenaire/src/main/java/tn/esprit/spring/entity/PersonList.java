package tn.esprit.spring.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

public class PersonList {
    @JacksonXmlProperty(localName = "Person")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Person> personList;

    public PersonList(List<Person> lp) {
        this.personList=lp;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }
}
