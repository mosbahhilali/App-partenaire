package tn.esprit.spring.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Sessioncontext {
    @JacksonXmlProperty(localName = "application-id")
    private String applicationid;
    @JacksonXmlProperty(localName = "dms-login")
    private String dmslogin;
    @JacksonXmlProperty(localName = "user-shared-id")
    private String usersharedid;
    @JacksonXmlProperty(localName = "garage-shared-id")
    private String garagesharedid;

    public String getApplicationid() {
        return applicationid;
    }

    public void setApplicationid(String applicationid) {
        this.applicationid = applicationid;
    }

    public String getDmslogin() {
        return dmslogin;
    }

    public void setDmslogin(String dmslogin) {
        this.dmslogin = dmslogin;
    }

    public String getUsersharedid() {
        return usersharedid;
    }

    public void setUsersharedid(String usersharedid) {
        this.usersharedid = usersharedid;
    }

    public String getGaragesharedid() {
        return garagesharedid;
    }

    public void setGaragesharedid(String garagesharedid) {
        this.garagesharedid = garagesharedid;
    }

    public Sessioncontext(String applicationid) {
        this.applicationid = applicationid;
    }

    public Sessioncontext() {
        super();
    }
}
