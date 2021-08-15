package tn.esprit.spring.entity;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@JacksonXmlRootElement
public class Classification {
	
private String dictionary;
private String ref;
	private String value;
	private String source;
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
	@JacksonXmlProperty(localName = "source",isAttribute = true)
	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}
	@JacksonXmlProperty(localName = "ref",isAttribute = true)
	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}
public Classification(String dictionary, String ref,String value,String source) {
	super();
	this.dictionary = dictionary;
	this.ref = ref;
	this.value = value;
	this.source = source;

}
public Classification() {
	super();
	// TODO Auto-generated constructor stub
}

}
