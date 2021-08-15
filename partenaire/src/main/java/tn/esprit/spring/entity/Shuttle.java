package tn.esprit.spring.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Shuttle {
	private Transport transport;
	private Settings settings;
	private PersonList person_list;
	private PartList part_list;
	@JacksonXmlProperty(localName = "calculating-list")
	private Calculatinglist calculatinglist;

	public Calculatinglist getCalculatinglist() {
		return calculatinglist;
	}

	public void setCalculatinglist(Calculatinglist calculatinglist) {
		this.calculatinglist = calculatinglist;
	}

	@JacksonXmlProperty
	public Settings getSettings() {
		return settings;
	}
	public void setSettings(Settings settings) {
		this.settings = settings;
	}
	 @JacksonXmlProperty(localName = "person-list")
	public PersonList getPerson_list() {
		return person_list;
	}
	public void setPerson_list(PersonList person_list) {
		this.person_list = person_list;
	}
	 @JacksonXmlProperty(localName = "part-list")
	public PartList getPart_list() {
		return part_list;
	}
	public void setPart_list(PartList part_list) {
		this.part_list = part_list;
	}
	@JacksonXmlProperty
	public Transport getTransport() {
		return transport;
	}

	public void setTransport(Transport transport) {
		this.transport = transport;
	}

	public Shuttle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Shuttle(Settings settings, PersonList person_list, PartList part_list) {
		super();
		this.settings = settings;
		this.person_list = person_list;
		this.part_list = part_list;
	}
	public Shuttle(Transport transport, PersonList person_list, PartList part_list) {
		super();
		this.transport = transport;
		this.person_list = person_list;
		this.part_list = part_list;
	}

	public Shuttle(Transport transport, Settings settings, PersonList person_list, PartList part_list, Calculatinglist calculatinglist) {
		this.transport = transport;
		this.settings = settings;
		this.person_list = person_list;
		this.part_list = part_list;
		this.calculatinglist = calculatinglist;
	}
}
