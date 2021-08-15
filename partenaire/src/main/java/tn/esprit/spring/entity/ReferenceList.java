package tn.esprit.spring.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

public class ReferenceList {
    @JacksonXmlProperty(localName = "Classification")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Classification> ref;

    public ReferenceList(List<Classification> ref) {
        this.ref = ref;
    }

    public List<Classification> getRef() {
        return ref;
    }

    public void setRef(List<Classification> ref) {
        this.ref = ref;
    }
}
