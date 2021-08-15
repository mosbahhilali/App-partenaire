package tn.esprit.spring.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@JacksonXmlRootElement
public class Explicit_date {
private Breakdown breakdown_list;
private Date date;
@JacksonXmlProperty(localName = "breakdown-list")
public Breakdown getBreakdown_list() {
	return breakdown_list;
}
public void setBreakdown_list(Breakdown breakdown_list) {
	this.breakdown_list = breakdown_list;
}
@JacksonXmlProperty
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public Explicit_date(Breakdown breakdown_list, Date date) {
	super();
	this.breakdown_list = breakdown_list;
	this.date = date;
}
public Explicit_date() {
	super();
	// TODO Auto-generated constructor stub
}

}
