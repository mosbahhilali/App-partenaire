package tn.esprit.spring.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

public class Value {
	private int amount;
private String value_type;
//@XmlAttribute(name = "value-type")
public String getValue_type() {
	return value_type;
}
public void setValue_type(String value_type) {
	this.value_type = value_type;
}
	@JacksonXmlProperty
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
public Value() {
	super();
	// TODO Auto-generated constructor stub
}
public Value(String value_type, int amount) {
	super();
	this.value_type = value_type;
	this.amount = amount;
}

}
