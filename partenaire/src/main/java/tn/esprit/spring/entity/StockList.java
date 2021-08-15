package tn.esprit.spring.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

public class StockList {
    @JacksonXmlProperty(localName = "stock")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Stock> sl;

    public List<Stock> getSl() {
        return sl;
    }

    public void setSl(List<Stock> sl) {
        this.sl = sl;
    }

    public StockList(List<Stock> sl) {
        this.sl = sl;
    }

    public StockList() {
    }
}
