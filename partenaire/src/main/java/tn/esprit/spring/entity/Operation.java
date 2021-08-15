package tn.esprit.spring.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Operation {
    @JacksonXmlProperty(localName = "breakdown-List")
    private BreakdownList breakdownList;
    @JacksonXmlProperty(localName = "reference-List")
    private ReferenceList referenceList;

    public BreakdownList getBreakdownList() {
        return breakdownList;
    }

    public void setBreakdownList(BreakdownList breakdownList) {
        this.breakdownList = breakdownList;
    }

    public ReferenceList getReferenceList() {
        return referenceList;
    }

    public void setReferenceList(ReferenceList referenceList) {
        this.referenceList = referenceList;
    }

    public Operation(BreakdownList breakdownList, ReferenceList referenceList) {
        this.breakdownList = breakdownList;
        this.referenceList = referenceList;
    }

    public Operation() {
        super();
    }
}
