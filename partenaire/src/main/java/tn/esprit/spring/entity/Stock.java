package tn.esprit.spring.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement
public class Stock {
private ValueList valueList;
private Availability availability;
private String personInternalId;
@JacksonXmlProperty(localName = "value-list")
public ValueList getValueList() {
	return valueList;
}
public void setValueList(ValueList valueList) {
	this.valueList = valueList;
}
@JacksonXmlProperty
public Availability getAvailability() {
	return availability;
}
public void setAvailability(Availability availability) {
	this.availability = availability;
}
@JacksonXmlProperty(localName = "person-internal-id",isAttribute = true)
public String getPersonInternalId() {
	return personInternalId;
}
public void setPersonInternalId(String personInternalId) {
	this.personInternalId = personInternalId;
}
public Stock(ValueList valueList, Availability availability, String personInternalId) {
	super();
	this.valueList = valueList;
	this.availability = availability;
	this.personInternalId = personInternalId;
}
public Stock() {
	super();
	// TODO Auto-generated constructor stub
}

}
