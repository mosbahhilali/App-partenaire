package tn.esprit.spring.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
public class Discount {
private Breakdown breakdown_list;
private Value value;
@JacksonXmlProperty(localName = "breakdown-list")
public Breakdown getBreakdown_list() {
	return breakdown_list;
}
public void setBreakdown_list(Breakdown breakdown_list) {
	this.breakdown_list = breakdown_list;
}
@JacksonXmlProperty
public Value getValue() {
	return value;
}
public void setValue(Value value) {
	this.value = value;
}
public Discount(Breakdown breakdown_list, Value value) {
	super();
	this.breakdown_list = breakdown_list;
	this.value = value;
}
public Discount() {
	super();
	// TODO Auto-generated constructor stub
}

}
