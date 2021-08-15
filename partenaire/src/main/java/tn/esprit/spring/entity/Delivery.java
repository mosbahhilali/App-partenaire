package tn.esprit.spring.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

public class Delivery {
private Label label;
private Date date;
private Carriage carriage;
@JacksonXmlProperty
public Label getLabel() {
	return label;
}
public void setLabel(Label label) {
	this.label = label;
}
@JacksonXmlProperty
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
@JacksonXmlProperty
public Carriage getCarriage() {
	return carriage;
}
public void setCarriage(Carriage carriage) {
	this.carriage = carriage;
}
public Delivery(Label label, Date date, Carriage carriage) {
	super();
	this.label = label;
	this.date = date;
	this.carriage = carriage;
}
public Delivery() {
	super();
	// TODO Auto-generated constructor stub
}

}
