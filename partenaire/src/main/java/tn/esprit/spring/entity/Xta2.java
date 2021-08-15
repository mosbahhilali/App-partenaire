package tn.esprit.spring.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@JacksonXmlRootElement(localName = "xat2")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Xta2 {
	@JacksonXmlProperty(localName = "session-context")
	private Sessioncontext sessioncontext;
	@JacksonXmlProperty(localName = "date-list")
private Date_list date_list;
	@JacksonXmlProperty(localName= "message-list")
	private Message_list message_list;
	@JacksonXmlProperty(localName = "Shuttle")
	private Shuttle shuttle;
	@JacksonXmlProperty(isAttribute = true)
	private String xmlns="http://xat2.etai.fr";
	@JacksonXmlProperty(isAttribute = true)
	private String version;
	@JacksonXmlProperty(localName = "message-id",isAttribute = true)
	private String message_id;
	@JacksonXmlProperty(localName = "correlation-id",isAttribute = true)
	private String correlationId;

public Date_list getDate_list() {
		return date_list;
	}
	public void setDate_list(Date_list date_list) {
		this.date_list = date_list;
	}
public Message_list getMessage_list() {
	return message_list;
}
public void setMessage_list(Message_list message_list) {
	this.message_list = message_list;
}
public Shuttle getShuttle() {
	return shuttle;
}
	public void setShuttle(Shuttle shuttle) {
	this.shuttle = shuttle;
}

public String getVersion() {	return version;}
	public void setVersion(String version) {	this.version = version; }

public String getMessage_id() {
	return message_id;
}
public void setMessage_id(String message_id) {
	this.message_id = message_id;
}

public String getCorrelationId() {
	return correlationId;
}
public void setCorrelationId(String correlationId) {
	this.correlationId = correlationId;
}

public Xta2(Date_list date_list, Message_list message_list, Shuttle shuttle, String version, String message_id,
		String correlationId) {
	super();
	this.date_list = date_list;
	this.message_list = message_list;
	this.shuttle = shuttle;
	this.version = version;
	this.message_id = message_id;
	this.correlationId = correlationId;
}
public Xta2() {
	super();
	// TODO Auto-generated constructor stub
}

}