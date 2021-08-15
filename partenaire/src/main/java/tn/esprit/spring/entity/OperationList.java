package tn.esprit.spring.entity;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

public class OperationList {
    @JacksonXmlProperty(localName = "operation")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Operation> operation;

    public OperationList(List<Operation> operation) {
        this.operation = operation;
    }

    public List<Operation> getOperation() {
        return operation;
    }

    public void setOperation(List<Operation> operation) {
        this.operation = operation;
    }

    public OperationList() {
        super();
    }
}
