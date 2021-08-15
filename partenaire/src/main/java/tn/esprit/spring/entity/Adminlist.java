package tn.esprit.spring.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

public class Adminlist {
    @JacksonXmlProperty(localName = "Classification")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Classification> classification;

    public Adminlist(List<Classification> classification) {
        this.classification = classification;
    }

    public Adminlist() {
    }

    public List<Classification> getClassification() {
        return classification;
    }

    public void setClassification(List<Classification> classification) {
        this.classification = classification;
    }
}
