package tn.esprit.spring.entity;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

public class Label {
private String shortLabel;
@JacksonXmlProperty(localName = "short-label")
public String getShortLabel() {
	return shortLabel;
}

public void setShortLabel(String shortLabel) {
	this.shortLabel = shortLabel;
}

public Label(String shortLabel) {
	super();
	this.shortLabel = shortLabel;
}

public Label() {
	super();
	// TODO Auto-generated constructor stub
}

}
