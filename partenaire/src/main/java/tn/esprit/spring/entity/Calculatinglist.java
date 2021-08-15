package tn.esprit.spring.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

public class Calculatinglist {
    @JacksonXmlProperty(localName = "calculating")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Calculating> calculating;

    public Calculatinglist(List<Calculating> calculating) {
        this.calculating = calculating;
    }

    public Calculatinglist() {
        super();
    }

    public List<Calculating> getCalculating() {
        return calculating;
    }

    public void setCalculating(List<Calculating> calculating) {
        this.calculating = calculating;
    }
}
