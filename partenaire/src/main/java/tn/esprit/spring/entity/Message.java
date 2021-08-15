package tn.esprit.spring.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
//@XmlRootElement
public class Message {
	private String source;
private String message_category;
private User_description user_description;
private String technical_description;
private Classification_list classification_list;
@JacksonXmlProperty(isAttribute = true)
public String getSource() {
	return source;
}
public void setSource(String source) {
	this.source = source;
}
@JacksonXmlProperty(localName = "message-category")
public String getMessage_category() {
	return message_category;
}
public void setMessage_category(String message_category) {
	this.message_category = message_category;
}
@JacksonXmlProperty(localName = "user-description")
public User_description getUser_description() {
	return user_description;
}
public void setUser_description(User_description user_description) {
	this.user_description = user_description;
}
@JacksonXmlProperty(localName = "technical-description")
public String getTechnical_description() {
	return technical_description;
}
public void setTechnical_description(String technical_description) {
	this.technical_description = technical_description;
}
@JacksonXmlProperty(localName = "classification-list")
public Classification_list getClassification_list() {
	return classification_list;
}
public void setClassification_list(Classification_list classification_list) {
	this.classification_list = classification_list;
}
public Message() {
	super();
	// TODO Auto-generated constructor stub
}
	public Message(String source, String message_category, User_description user_description, String technical_description,
				   Classification_list classification_list) {
		super();
		this.source = source;
		this.message_category = message_category;
		this.user_description = user_description;
		this.technical_description = technical_description;
		this.classification_list = classification_list;
	}

	public Message( String message_category, String technical_description,
					Classification_list classification_list) {
		super();
		this.message_category = message_category;
		this.user_description = user_description;
		this.technical_description = technical_description;
		this.classification_list = classification_list;
	}
}
