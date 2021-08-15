package tn.esprit.spring.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
//@XmlRootElement
public class Settings {
	private Discount_list discount_list;
	 @JacksonXmlProperty(localName = "discount-list")
	public Discount_list getDiscount_list() {
		return discount_list;
	}

	public void setDiscount_list(Discount_list discount_list) {
		this.discount_list = discount_list;
	}

	public Settings(Discount_list discount_list) {
		super();
		this.discount_list = discount_list;
	}

	public Settings() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
