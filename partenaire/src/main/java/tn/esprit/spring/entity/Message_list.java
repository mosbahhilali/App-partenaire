package tn.esprit.spring.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

public class Message_list {
    @JacksonXmlProperty(localName = "message")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Message> message_list;

    public List<Message> getMessage_list() {
        return message_list;
    }

    public void setMessage_list(List<Message> message_list) {
        this.message_list = message_list;
    }
}
