package org.sample.baseclass;

import org.openqa.selenium.WebDriver;

public class SampleLogin extends BaseClass {
public static void main(String[] args) {
	WebDriver driver=getDriver();
	loadurl("https://adactin.com/HotelApp/");
	LoginPage page=new LoginPage();
	
	type(page.getTxtPass(),"chennai");
	type(page.getTxtuser(),"ramya12345");
	btnclick(page.getBtnlogin());
	
	SearchHotel h=new SearchHotel();
	
	dropdown(h.getTxtSelect(),"Melbourne");
	dropdown(h.getTxtHotel(),"Hotel Hervey");
	dropdown(h.getTxtRoom(),"Double");
	dropdown(h.getChildRoom(),"3 - Three");
	type(h.getTxtdate(),"02/07/2019");
	type(h.getTxt1date(),"03/07/2019");
	dropdown(h.getRoom(),"1 - One");
	btnclick(h.getSearch());
	
	Hotel k=new Hotel();
	
	btnclick(k.getClickradiobtn());
	btnclick(k.getClksearch());
	type(k.getTypefrst(),"ramya");
	type(k.getTypelast(),"venkat");
	type(k.getTypeadd(),"chennai");
	type(k.getTypecredit(),"4578961236547896");
	dropdown(k.getTypecard(),"VISA");
	dropdown(k.getTypemon(),"February");
	dropdown(k.getTypeyr(),"2020");
	type(k.getTypecvv(),"123");
	btnclick(k.getClkbook());
	
	
}
}
