package tn.esprit.spring.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
//@XmlRootElement
public class Supplie {
private String abbreviation;
private Label label;
private ReferenceList classificationList;
@JacksonXmlProperty
public String getAbbreviation() {
	return abbreviation;
}
public void setAbbreviation(String abbreviation) {
	this.abbreviation = abbreviation;
}
@JacksonXmlProperty
public Label getLabel() {
	return label;
}
public void setLabel(Label label) {
	this.label = label;
}
@JacksonXmlProperty(localName = "classification-list")
public ReferenceList getClassificationList() {
	return classificationList;
}
public void setClassificationList(ReferenceList classificationList) {
	this.classificationList = classificationList;
}
public Supplie(String abbreviation, Label label, ReferenceList classificationList) {
	super();
	this.abbreviation = abbreviation;
	this.label = label;
	this.classificationList = classificationList;
}
public Supplie() {
	super();
	// TODO Auto-generated constructor stub
}


}
