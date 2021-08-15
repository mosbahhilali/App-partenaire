package tn.esprit.spring.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Partner {
    @JacksonXmlProperty(localName = "name")
    private String name;
    @JacksonXmlProperty(localName = "editor")
    private Classification editor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Classification getEditor() {
        return editor;
    }

    public void setEditor(Classification editor) {
        this.editor = editor;
    }

    public Partner(String name, Classification editor) {
        this.name = name;
        this.editor = editor;
    }

    public Partner() {
        super();
    }
}
