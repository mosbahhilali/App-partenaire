package tn.esprit.spring.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import tn.esprit.spring.entity.Adminlist;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;

//@XmlRootElement
public class Person {
	private Breakdown breakdown_list;
	private String name;
	private Place place;
	private int number;
	private String source;
	private String internal_id;
	private ContactList contact_list;
	private Agreementlist agreement_list;
	private Adminlist admin_list;
	@JacksonXmlProperty(localName = "contact-list")

	public ContactList getContact_list() {
		return contact_list;
	}

	public void setContact_list(ContactList contact_list) {
		this.contact_list = contact_list;
	}
	@JacksonXmlProperty(localName = "agreement-list")

	public Agreementlist getAgreement_list() {
		return agreement_list;
	}

	public void setAgreement_list(Agreementlist agreement_list) {
		this.agreement_list = agreement_list;
	}
	@JacksonXmlProperty(localName = "admin-list")
	public Adminlist getAdmin_list() {
		return admin_list;
	}

	public void setAdmin_list(Adminlist admin_list) {
		this.admin_list = admin_list;
	}
	@JacksonXmlProperty(localName = "breakdown-list")
	public Breakdown getBreakdown_list() {
		return breakdown_list;
	}
	public void setBreakdown_list(Breakdown breakdown_list) {
		this.breakdown_list = breakdown_list;
	}
	@JacksonXmlProperty
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@JacksonXmlProperty
	public Place getPlace() {
		return place;
	}
	public void setPlace(Place place) {
		this.place = place;
	}
	@JacksonXmlProperty(localName = "number",isAttribute = true)
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	 @JacksonXmlProperty(localName = "source",isAttribute = true)
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	@JacksonXmlProperty(localName= "internal-id",isAttribute = true)
	public String getInternal_id() {
		return internal_id;
	}
	public void setInternal_id(String internal_id) {
		this.internal_id = internal_id;
	}
	public Person(Breakdown breakdown_list, String name, Place place, int number, String source,
			String internal_id) {
		super();
		this.breakdown_list = breakdown_list;
		this.name = name;
		this.place = place;
		this.number = number;
		this.source = source;
		this.internal_id = internal_id;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
