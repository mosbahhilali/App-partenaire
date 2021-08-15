package tn.esprit.spring.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Transport {
    @JacksonXmlProperty(localName = "partner")
    private Partner partner;
    @JacksonXmlProperty(localName = "action-list")
    private Action_list actionList;
    @JacksonXmlProperty(localName = "admin-list")
    private Adminlist adminList;

    public Transport(Partner partner, Action_list actionList, Adminlist adminList) {
        this.partner = partner;
        this.actionList = actionList;
        this.adminList = adminList;
    }

    public Transport() {
    }

    public Partner getPartner() {
        return partner;
    }

    public void setPartner(Partner partner) {
        this.partner = partner;
    }

    public Action_list getActionList() {
        return actionList;
    }

    public void setActionList(Action_list actionList) {
        this.actionList = actionList;
    }

    public Adminlist getAdminList() {
        return adminList;
    }

    public void setAdminList(Adminlist adminList) {
        this.adminList = adminList;
    }
}
