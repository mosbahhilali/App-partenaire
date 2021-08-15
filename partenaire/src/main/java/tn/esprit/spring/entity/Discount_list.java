package tn.esprit.spring.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

public class Discount_list {
    @JacksonXmlProperty(localName = "Discount")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Discount> discountList;

    public List<Discount> getDiscountList() {
        return discountList;
    }

    public void setDiscountList(List<Discount> discountList) {
        this.discountList = discountList;
    }

    public Discount_list(List<Discount> discountList) {
        this.discountList = discountList;
    }
}
