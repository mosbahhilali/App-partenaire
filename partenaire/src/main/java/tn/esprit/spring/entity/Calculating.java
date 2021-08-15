package tn.esprit.spring.entity;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

public class Calculating {
    @JacksonXmlProperty(localName = "operation-List")
    private OperationList operationList;

    public Calculating(OperationList operationList) {
        this.operationList = operationList;
    }

    public Calculating() {
        super();
    }

    public OperationList getOperationList() {
        return operationList;
    }

    public void setOperationList(OperationList operationList) {
        this.operationList = operationList;
    }
}

