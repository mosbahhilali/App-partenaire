package tn.esprit.spring.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

public class Availability {
private Deliverylist deliveryList;
@JacksonXmlProperty(localName = "delivery-list")
public Deliverylist getDeliveryList() {
	return deliveryList;
}

public void setDeliveryList(Deliverylist deliveryList) {
	this.deliveryList = deliveryList;
}

public Availability(Deliverylist deliveryList) {
	super();
	this.deliveryList = deliveryList;
}

public Availability() {
	super();
	// TODO Auto-generated constructor stub
}

}
