import {Component, OnInit, ViewChild} from '@angular/core';
import {CataComponent} from "../cata/cata.component";
import {Subject} from "rxjs";
import {
  Action,
  Action_list, Admin_list, Agreement, Agreementlist, Breakdown, BreakdownList,
  Classification, Contact, ContactList, Label, Part, PartList,
  Partner, Person, PersonList, Place, ReferencesList,
  ServiceService,
  Sessioncontext, Shuttle, Supplie, Transport, Xta2
} from "../services/service.service";
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
 m: number=1;
t:any;
  constructor( private cata : CataComponent,private service: ServiceService, private httpClient: HttpClient) { }
  ngOnInit(): void {
    this.cata.ref.subscribe(() => {
      this.m=this.cata.m;
      console.log(this.m);

    });
    //this.m=this.cata.m;
//console.log(this.m);
  }
  a():void {
    let s = new Sessioncontext("s7755x", "546f4e8c36", "u60950s13912g1198", "s13912g1198");
    let c1 = new Classification("ETAI:edito", "etai", "", "");
    let p = new Partner("AMI",c1);
    let a = new Action("getPriceAndStock", "",);
    let all = new Array<Action>();
    all.push(a);
    let actionl = new Action_list(all);
    let c2=new Classification("ETAI:admin","clientNumber","","idClientETAI");
    let c3=new Classification("ETAI:admin","clientNumber","","codeGroupeETAI");
    let admin=new Array<Classification>();
    admin.push(c2,c3);
    let adminl=new Admin_list(admin);
    let t=new Transport(p,actionl,adminl);
    let c4=new Classification("ETAI:person","repairer","","");
    let bl=new Array<Breakdown>();
    let breackdown=new Breakdown(c4);
    bl.push(breackdown);
    let breackdownl=new BreakdownList(bl);
    let place=new Place("danylas peruzzo","14 avenue gay lussac",91600,"savigny sur orge");
    let c5=new Classification("ETAI:contact","phone","","");
    let c6=new Classification("ETAI:contact","email","","");
    let contact1=new Contact(c5,"0687368801");
    let contact2=new Contact(c6,"danylas.peruzzo@infopro-digital.com");
    let contactl=new Array<Contact>();
    contactl.push(contact1,contact2);
    let list_contact=new ContactList(contactl);

    let c7=new Classification("ETAI:agreement","siretGarage","123456789","");
    let c8=new Classification("ETAI:admin","clientNumber","","");

    let agreement =new Agreement(c7);
    let agreement_list=new Array<Agreement>();
    agreement_list.push(agreement);
    let agreement_l=new Agreementlist(agreement_list);
    let adl=new Array<Classification>();
    adl.push(c8);
    let ad=new Admin_list(adl);
    let person=new Person(breackdown,"danylas peruzzo",place,list_contact,agreement_l,ad);
    let pl=new Array<Person>();
    pl.push(person);
    let personl=new PersonList(pl);
    let b1=new Breakdown(new Classification("ETAI:breakdown","part","",""));
    let b2=new Breakdown(new Classification("ETAI:partIdentification","elementAM","",""));
    let llbb=new Array<Breakdown>();
    llbb.push(b1,b2);
    let brekdl=new BreakdownList(llbb);
    let label=new Label("");
    let cl = new Array<Classification>();
    cl.push(new Classification("","LS932","","catalog"));
    cl.push(new Classification("","LS932","","clean"));
    let ref =new ReferencesList(cl);
    let cl1 = new Array<Classification>();
    cl1.push(new Classification("ETAI:supplier","PUR","",""));
    cl1.push(new Classification("","1114","","etai"));
    let ref1 =new ReferencesList(cl1);

    let label1=new Label("PURFLUX");

    let supplier=new Supplie("PUR",label1,ref1);
    let part=new Part(brekdl,ref,supplier);
    let partl=new Array<Part>();
    partl.push(part);
    let part_list=new PartList(partl);
    let suttle=new Shuttle(t,personl,part_list)
    let xta2=new Xta2(s,suttle,"2.0","f97d7376-e02a-4d63-bfa2-1bc7483332df","");
    this.service.getPriceAndStock(xta2).subscribe(res => {
      console.log(res);
      this.t = res;
    });

}

}
