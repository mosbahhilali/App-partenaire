package tn.esprit.spring.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

public class Date_list {
private List<Explicit_date> explicit_date;
@JacksonXmlProperty(localName = "explicit-date")
@JacksonXmlElementWrapper(useWrapping = false)
public List<Explicit_date> getExplicit_date() {
	return explicit_date;
}

public void setExplicit_date(List<Explicit_date> explicit_date) {
	this.explicit_date = explicit_date;
}

public Date_list() {
	super();
	// TODO Auto-generated constructor stub
}

public Date_list(List<Explicit_date> explicit_date) {
	super();
	this.explicit_date = explicit_date;
}

}
