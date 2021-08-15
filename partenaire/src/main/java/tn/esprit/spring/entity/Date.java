package tn.esprit.spring.entity;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;
public class Date {
	
    private String value;
    protected String format;
	@JacksonXmlText
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@JacksonXmlProperty(localName = "format", isAttribute = true)
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public Date(String value, String format) {
		super();
		this.value = value;
		this.format = format;
	}
	public Date() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
