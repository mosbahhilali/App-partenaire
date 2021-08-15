package tn.esprit.spring.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
//@XmlRootElement
public class Price {
	private BreakdownList breakdown_list;
	  private ValueList value_list;
	  private Debtor debtor;
	  
	  @JacksonXmlProperty(localName = "breakdown-list")
	public BreakdownList getBreakdown_list() {
		return breakdown_list;
	}
	public void setBreakdown_list(BreakdownList breakdown_list) {
		this.breakdown_list = breakdown_list;
	}
	  @JacksonXmlProperty(localName = "value-list")
	public ValueList getValue_list() {
		return value_list;
	}
	public void setValue_list(ValueList value_list) {
		this.value_list = value_list;
	}
	@JacksonXmlProperty
	public Debtor getDebtor() {
		return debtor;
	}
	public void setDebtor(Debtor debtor) {
		this.debtor = debtor;
	}
	public Price() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Price(BreakdownList breakdown_list, ValueList value_list, Debtor debtor) {
		super();
		this.breakdown_list = breakdown_list;
		this.value_list = value_list;
		this.debtor = debtor;
	}
	  

   
}
