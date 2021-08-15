package tn.esprit.spring.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

public class BreakdownList {
    @JacksonXmlProperty(localName = "Classification")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Classification> breakdownlist;

    public List<Classification> getBreakdownlist() {
        return breakdownlist;
    }

    public void setBreakdownlist(List<Classification> breakdownlist) {
        this.breakdownlist = breakdownlist;
    }

    public BreakdownList(List<Classification> breakdownlist) {
        this.breakdownlist = breakdownlist;
    }
}
