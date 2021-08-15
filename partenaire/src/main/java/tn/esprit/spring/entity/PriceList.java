package tn.esprit.spring.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

public class PriceList {
    @JacksonXmlProperty(localName = "price")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Price> pl;

    public List<Price> getPl() {
        return pl;
    }

    public void setPl(List<Price> pl) {
        this.pl = pl;
    }

    public PriceList(List<Price> pl) {
        this.pl = pl;
    }

    public PriceList() {
        super();
    }
}
