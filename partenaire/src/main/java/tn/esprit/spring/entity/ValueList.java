package tn.esprit.spring.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

public class ValueList {
    @JacksonXmlProperty(localName = "Value-list")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Value> vl;

    public List<Value> getVl() {
        return vl;
    }

    public void setVl(List<Value> vl) {
        this.vl = vl;
    }

    public ValueList(List<Value> vl) {
        this.vl = vl;
    }
}
