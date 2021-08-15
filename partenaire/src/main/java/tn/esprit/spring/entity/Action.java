package tn.esprit.spring.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Action {
    @JacksonXmlProperty(localName = "verb")
    private String verb;
    @JacksonXmlProperty(localName = "option-list")
    private String optionList;

    public String getVerb() {
        return verb;
    }

    public void setVerb(String verb) {
        this.verb = verb;
    }

    public String getOptionList() {
        return optionList;
    }

    public void setOptionList(String optionList) {
        this.optionList = optionList;
    }

    public Action(String verb, String optionList) {
        this.verb = verb;
        this.optionList = optionList;
    }

    public Action() {
        super();
    }
}
