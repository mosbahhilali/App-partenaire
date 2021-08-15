package tn.esprit.spring.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
public class Breakdown {
	@JacksonXmlProperty
private Classification classification;

public Classification getClassification() {
	return classification;
}

public void setClassification(Classification classification) {
	this.classification = classification;
}

public Breakdown() {
	super();
	// TODO Auto-generated constructor stub
}

public Breakdown(Classification classification) {
	super();
	this.classification = classification;
}

}
