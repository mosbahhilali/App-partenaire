package tn.esprit.spring.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
//@XmlRootElement
public class Part {
private BreakdownList breakdown_list;
private ReferenceList references_list;
private Supplie supplier;
private StockList stock_list;
private PriceList price_list;
private Classification Status;
@JacksonXmlProperty(localName = "breakdown-list")
public BreakdownList getBreakdown_list() {
	return breakdown_list;
}
public void setBreakdown_list(BreakdownList breakdown_list) {
	this.breakdown_list = breakdown_list;
}
@JacksonXmlProperty
public Supplie getSupplier() {
	return supplier;
}
public void setSupplier(Supplie supplier) {
	this.supplier = supplier;
}
@JacksonXmlProperty(localName = "stock-list")
public StockList getStock_list() {
	return stock_list;
}
public void setStock_list(StockList stock_list) {
	this.stock_list = stock_list;
}
@JacksonXmlProperty(localName = "price-list")
public PriceList getPrice_list() {
	return price_list;
}
public void setPrice_list(PriceList price_list) {
	this.price_list = price_list;
}
@JacksonXmlProperty
public Classification getStatus() {
	return Status;
}
public void setStatus(Classification status) {
	Status = status;
}

public Part(BreakdownList breakdown_list, ReferenceList references_list, Supplie supplier,
			StockList stock_list, PriceList price_list, Classification status) {
	super();
	this.breakdown_list = breakdown_list;
	this.references_list = references_list;
	this.supplier = supplier;
	this.stock_list = stock_list;
	this.price_list = price_list;
	Status = status;
}
public Part() {
	super();
	// TODO Auto-generated constructor stub
}
@JacksonXmlProperty(localName = "reference-list")
public ReferenceList getReferences_list() {
	return references_list;
}
public void setReferences_list(ReferenceList references_list) {
	this.references_list = references_list;
}

}
