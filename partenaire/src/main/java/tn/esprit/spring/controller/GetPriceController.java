package tn.esprit.spring.controller;

import java.util.ArrayList;
import java.util.List;
import java.io.*;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entity.*;

@RestController
@CrossOrigin(origins = "*")
public class GetPriceController {
	@PostMapping("/get")
	@ResponseBody
	public Xta2  get (@RequestBody String x) throws IOException {
		/*JSONObject json = XML.toJSONObject(x);
		Iterator a = json.keys();

		JSONObject json1 = json.getJSONObject(a.next().toString());
		Iterator<String> a1 = json1.keys();

		//float json2 = json1.getFloat("version");
		String jsonString = json1.toString(4);
*/
		Breakdown breakdown=new Breakdown(new Classification("ETAI:date","receive","receive date",""));
		Date date=new Date("03.07.2021 12:41:23:596 +0100","dd.MM.yyyy HH:mm:ss:S Z");
		Breakdown breakdown1=new Breakdown(new Classification("ETAI:date","dispatch","completion date",""));
		Date date1=new Date("03.07.2021 12:41:24:390 +0100","dd.MM.yyyy HH:mm:ss:S Z");

		Explicit_date explicit_date1 =new Explicit_date(breakdown,date);
		Explicit_date explicit_date =new Explicit_date(breakdown1,date1);
List<Explicit_date> le=new ArrayList<>();
		le.add(explicit_date1);
		le.add(explicit_date);
		Date_list date_list=new Date_list(le);
	List<Message> lm =new ArrayList<Message>();
	Classification classification = new Classification("ETAI:message","complete","","");
		List<Classification> lc=new ArrayList<>();
		lc.add(classification);
		User_description User_description= new User_description("getPriceAndStock processing complete","Xta2/message","complete");
		Classification_list classification_list =new Classification_list();
		classification_list.setClassificationList(lc);
		Message message1 =new Message("ack","getPriceAndStock processing complete",classification_list);
		Message message2 =new Message("xta2","ack",User_description,"getPriceAndStock processing complete",classification_list);
		lm.add(message1);
		lm.add(message2);
		Message_list message_list=new Message_list();
		message_list.setMessage_list(lm);
		Breakdown breakdown2=new Breakdown(new Classification("ETAI:applicability","part","",""));
		Value value =new Value("percent",26);
		Discount discount =new Discount(breakdown2,value);
		Breakdown breakdown3=new Breakdown(new Classification("ETAI:applicability","part","",""));
		Value value1 =new Value("percent",45);
		Discount discount1 =new Discount(breakdown3,value1);
		Breakdown breakdown5=new Breakdown(new Classification("ETAI:applicability","part","",""));
		Value value3 =new Value("percent",45);
		Discount discount3 =new Discount(breakdown5,value3);
		Breakdown breakdown4=new Breakdown(new Classification("ETAI:applicability","part","",""));
		Value value4 =new Value("percent",76);
		Discount discount4 =new Discount(breakdown4,value4);
		List<Discount> ld=new ArrayList<>();
		ld.add(discount);
		ld.add(discount1);
		ld.add(discount3);
		ld.add(discount4);
		Discount_list discount_list=new Discount_list(ld);
		Settings settings =new Settings(discount_list);
		Breakdown breakdownP1=new Breakdown(new Classification("ETAI:breakdown","storageLocation","",""));
		Breakdown breakdownP2=new Breakdown(new Classification("ETAI:breakdown","storageLocation","",""));
		Place place1=new Place("place.name","place.address",75001,"place.city");
		Place place2=new Place("place.name","place.address",75001,"place.city");

		Person person1=new Person(breakdownP1,"Plateforme rapide",place1,1,"Plateforme rapide","ID1");
		Person person2=new Person(breakdownP2,"Plateforme lente",place1,2,"Plateforme lente","ID2");
List<Person> lp=new ArrayList<>();
lp.add(person1);
lp.add(person2);
		PersonList personList=new PersonList(lp);
		List<Classification> lcc=new ArrayList<>();
		lcc.add(new Classification("ETAI:breakdown","part","",""));
		lcc.add(new Classification("ETAI:partIdentification","elementAM","",""));
		List<Classification> lccc=new ArrayList<>();
		lccc.add(new Classification("","LS932","","catalog"));
		lccc.add(new Classification("","LS932","","clean"));
		BreakdownList breakdownList=new BreakdownList(lcc);
		ReferenceList referenceList=new ReferenceList(lcc);
		List<Classification> l=new ArrayList<>();
		l.add(new Classification("ETAI:supplier","PUR","",""));
		l.add(new Classification("","1114","","etai"));
		Label label=new Label("PURFLUX");
		ReferenceList referenceList1=new ReferenceList(l);
		Supplie supplie =new Supplie("PUR",label,referenceList1);
List<Value> lv=new ArrayList<>();
lv.add(new Value("percent",76));
		ValueList valueList=new ValueList(lv);
		Label label1=new Label("PURFLUX");
		Date date2=new Date("04/07/2021","dd/MM/yyyy");
		List<Classification> lcd=new ArrayList<>();
		List<Classification> lcdd=new ArrayList<>();
		lcd.add(new Classification("ETAI:carriage","removalOnSite","",""));
		lcdd.add(new Classification("ETAI:unit","unit","",""));
		BreakdownList breakdownListd=new BreakdownList(lcd);
		BreakdownList breakdownListdd=new BreakdownList(lcdd);
		List<Value> lvv=new ArrayList<>();
		lvv.add(new Value("percent",76));
		ValueList valueListd=new ValueList(lv);
		Price price=new Price(breakdownListdd,valueListd,null);
		Carriage carriage=new Carriage(breakdownListd,price);
		List<Delivery> ldd=new ArrayList<>();
		ldd.add(new Delivery(label1,date2,carriage));
		Deliverylist deliverylist=new Deliverylist(ldd);
		Availability availability=new Availability(deliverylist);
		Stock stock =new Stock(valueList,availability,"ID1");
		Stock stock1 =new Stock(valueList,availability,"ID2");
		List<Stock> lstk=new ArrayList<>();
		lstk.add(stock);
		lstk.add(stock1);
		List<Price> lpr=new ArrayList<>();
		Debtor debtor=new Debtor(new Classification("ETAI:Person","client","",""));
		Price price1=new Price(breakdownListdd,valueListd,debtor);
		Debtor debtor1=new Debtor(new Classification("ETAI:Person","repairer","",""));
		Price price2=new Price(breakdownListdd,valueListd,debtor1);
		lpr.add(price1);
		lpr.add(price2);
		PriceList priceList=new PriceList(lpr);
		StockList stockList=new StockList(lstk);
		Part part=new Part(breakdownList,referenceList,supplie,stockList,priceList,new Classification("ETAI:status","known","",""));
		List<Part> lprt=new ArrayList<>();
lprt.add(part);
		PartList partList =new PartList(lprt);
		Shuttle shuttle=new Shuttle(settings,personList,partList);
		Xta2 cc = new Xta2(date_list,message_list,shuttle,"2.0","9f596f5b-3fc5-4b55-977b-\n" +
				"b33e465b6559","f97d7376-e02a-4d63-bfa2-1bc7483332df");
		return cc;
	}
}
