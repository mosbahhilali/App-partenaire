package tn.esprit.spring.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;

//@XmlRootElement
public class Place {
	
private String name;
private String address;
private int zip_code;
private String city;
@JacksonXmlProperty
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@JacksonXmlProperty
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@JacksonXmlProperty(localName= "zip-code")
public int getZip_code() {
	return zip_code;
}
public void setZip_code(int zip_code) {
	this.zip_code = zip_code;
}
@JacksonXmlProperty
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public Place(String name, String address, int zip_code, String city) {
	super();
	this.name = name;
	this.address = address;
	this.zip_code = zip_code;
	this.city = city;
}
public Place() {
	super();
	// TODO Auto-generated constructor stub
}

}
