package tn.esprit.spring.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

public class Agreementlist {
    @JacksonXmlProperty(localName = "agreement")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Agreement> agreement_list;
}
