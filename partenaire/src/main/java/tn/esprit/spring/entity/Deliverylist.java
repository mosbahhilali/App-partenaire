package tn.esprit.spring.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

public class Deliverylist {
    @JacksonXmlProperty(localName = "delivery")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Delivery> ld;

    public Deliverylist(List<Delivery> ld) {
        this.ld = ld;
    }

    public List<Delivery> getLd() {
        return ld;
    }

    public void setLd(List<Delivery> ld) {
        this.ld = ld;
    }
}
