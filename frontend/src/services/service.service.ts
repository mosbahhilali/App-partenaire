import { Injectable } from '@angular/core';
import {Observable} from "rxjs";
import {HttpClient, HttpHeaders} from "@angular/common/http";
@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  constructor(private httpClient: HttpClient) { }
  getPriceAndStock(m : Xta2): Observable<any>{
    //let headers = new Headers();
    let headers = new HttpHeaders();
    headers.append('Content-Type', 'text/plain');
    return this.httpClient.post( "http://localhost:8085/get",m,{headers: headers});
  }
}
export class Sessioncontext{

  constructor(applicationid: string, dmslogin: string, usersharedid: string, garagesharedid: string) {
    this.applicationid = applicationid;
    this.dmslogin = dmslogin;
    this.usersharedid = usersharedid;
    this.garagesharedid = garagesharedid;
  }

  applicationid:String;
  dmslogin:String;
  usersharedid:String;
  garagesharedid:String;
}

export class Classification {

  constructor(dictionary: string, ref: string, value: string, source: string) {
    this.dictionary = dictionary;
    this.ref = ref;
    this.value = value;
    this.source = source;
  }

  dictionary:String;
  ref:String;
  value:String;
  source:String;

}

export class Breakdown {

  constructor(classification: Classification) {
    this.classification = classification;
  }

  classification:Classification;
}

export class Partner {

  constructor(name: string, editor: Classification) {
    this.name = name;
    this.editor = editor;
  }

  name:String;
  editor:Classification;
}
export class Action {

  constructor(verb: string, optionList: string) {
    this.verb = verb;
    this.optionList = optionList;
  }

  verb:String;
  optionList:String;
}
export class Action_list {

  constructor(action: Action[]) {
    this.action = action;
  }

  action:Action[];
}

export class Admin_list {

  constructor(classification: Classification[]) {
    this.classification = classification;
  }

  classification:Classification[];
}

export class Transport {

  constructor(partner: Partner, actionList: Action_list, adminList: Admin_list) {
    this.partner = partner;
    this.actionList = actionList;
    this.adminList = adminList;
  }

  partner: Partner;
  actionList: Action_list;
  adminList: Admin_list;

}

export class Place {

  constructor(name: String, address: String, zip_code: number, city: String) {
    this.name = name;
    this.address = address;
    this.zip_code = zip_code;
    this.city = city;
  }

  name:String;
  address:String;
  zip_code:number;
  city:String;
}

export class Contact {

  constructor(contact_categorie: Classification, contact_value: String) {
    this.contact_categorie = contact_categorie;
    this.contact_value = contact_value;
  }

  contact_categorie:Classification;
  contact_value:String;

}

export class ContactList {

  constructor(contact_list: Contact[]) {
    this.contact_list = contact_list;
  }

  contact_list:Contact[];

}

export class Agreement {

  constructor(agreement: Classification) {
    this.agreement = agreement;
  }

  agreement:Classification;
}

export class Agreementlist {

  constructor(agrrement_list: Agreement[]) {
    this.agrrement_list = agrrement_list;
  }

  agrrement_list:Agreement[];
}

export class Person {


  constructor(breakdown_list: Breakdown, name: String, place: Place, contact_List: ContactList, agreement_list: Agreementlist, admin_list: Admin_list) {
    this.breakdown_list = breakdown_list;
    this.name = name;
    this.place = place;
    this.contact_List = contact_List;
    this.agreement_list = agreement_list;
    this.admin_list = admin_list;
  }

  breakdown_list:Breakdown;
  name:String;
  place:Place;
  contact_List:ContactList;
  agreement_list:Agreementlist;
  admin_list:Admin_list;



}
export class PersonList {

  constructor(person: Person[]) {
    this.person = person;
  }

  person:Person[];
}

export class BreakdownList {

  constructor(breakdownList: Breakdown[]) {
    this.breakdownList = breakdownList;
  }

  breakdownList:Breakdown[];
}

export class ReferencesList {

  constructor(ref: Classification[]) {
    this.ref = ref;
  }

  ref:Classification[];
}

export class Label {

  constructor(shortLabel: string) {
    this.shortLabel = shortLabel;
  }

  shortLabel:String;
}

export class Supplie {

  constructor(abbreviation: string, label: Label, classificationList: ReferencesList) {
    this.abbreviation = abbreviation;
    this.label = label;
    this.classificationList = classificationList;
  }

  abbreviation:String;
  label: Label;
  classificationList: ReferencesList;
}

export class Part {

  constructor(breakdown_list: BreakdownList, references_list: ReferencesList, supplier: Supplie) {
    this.breakdown_list = breakdown_list;
    this.references_list = references_list;
    this.supplier = supplier;
  }

  breakdown_list: BreakdownList;
  references_list: ReferencesList;
  supplier: Supplie;
}

export class PartList {

  constructor(partList: Part[]) {
    this.partList = partList;
  }

  partList:Part[];
}

export class Shuttle{

  constructor(transport: Transport, person_list: PersonList, part_list: PartList) {
    this.transport = transport;
    this.person_list = person_list;
    this.part_list = part_list;
  }

  transport: Transport;
  person_list: PersonList;
  part_list:PartList;
}
export class Xta2{


  constructor(sessioncontext: Sessioncontext, shuttle: Shuttle, version: string, message_id: string, correlationId: string) {
    this.sessioncontext = sessioncontext;
    this.shuttle = shuttle;
    this.version = version;
    this.message_id = message_id;
    this.correlationId = correlationId;
  }

  sessioncontext:Sessioncontext;
  shuttle:Shuttle;
  xmlns="http://xat2.etai.fr";
  version:String;
  message_id:String;
  correlationId:String;
}

