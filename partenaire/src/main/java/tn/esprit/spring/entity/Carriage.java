package tn.esprit.spring.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
public class Carriage {
	private BreakdownList breakdown_list;
	private Price price;
	@JacksonXmlProperty(localName = "breakdown-list")
	public BreakdownList getBreakdown_list() {
		return breakdown_list;
	}
	public void setBreakdown_list(BreakdownList breakdown_list) {
		this.breakdown_list = breakdown_list;
	}
	 @JacksonXmlProperty
	public Price getPrice() {
		return price;
	}
	public void setPrice(Price price) {
		this.price = price;
	}
	public Carriage(BreakdownList breakdown_list, Price price) {
		super();
		this.breakdown_list = breakdown_list;
		this.price = price;
	}
	public Carriage() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
