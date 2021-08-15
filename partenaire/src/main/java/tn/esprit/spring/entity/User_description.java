package tn.esprit.spring.entity;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

import javax.xml.bind.annotation.XmlRootElement;

public class User_description {
    private String value;
    private String dictionary;
    private String ref;
    @JacksonXmlText
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
    @JacksonXmlProperty(localName = "dictionary",isAttribute = true)
    public String getDictionary() {
        return dictionary;
    }
    public void setDictionary(String dictionary) {
        this.dictionary = dictionary;
    }
    @JacksonXmlProperty(localName = "ref",isAttribute = true)
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }
    public User_description(String value,String dictionary, String ref) {
        super();
        this.dictionary = dictionary;
        this.ref = ref;
        this.value = value;
    }
    public User_description() {
        super();
        // TODO Auto-generated constructor stub
    }

}
