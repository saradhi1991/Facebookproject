package com.test.ng.pac;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Date;

import org.junit.BeforeClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseclass.methods.NewBaseClass;
import com.pojo.pack.PojoStoreElements;

public class TestngPackag extends NewBaseClass{
	
//	@Berofre Class ---->launch browser
	

//	@BforeMethod  ----> Start time
	
	
	//@Test ----> Business logic

//	@AfterMethod------>EndTime
	
//	@AfterClass -----End browser
	
	
	
//	@BeforeClass
//	public void startDate() {
//	Date d =new Date();
//			System.out.println(d);
//	}
//	@AfterClass
//	public void endDate() {
//		Date d= new Date();
//		System.out.println(d);
//	}
//	
//	
//	@BeforeMethod
//	private void launchBrowser() {
//		chromeBrowser();
//		launchUrl("http://adactinhotelapp.com/");
//		tomaximize();
//		deletCookiesall();
//		
//		System.out.println("Browser Launched");
//	}
//
//	@AfterMethod
//	private void endBrowser() {
//		System.out.println("End Browser");
//
//	}

	@Test
	public void tc1() throws AWTException {
		
		chromeBrowser();
		launchUrl("http://adactinhotelapp.com/");
		tomaximize();
		deletCookiesall();
		
		System.out.println("Browser Launched");
		
		
		
		PojoStoreElements pj= new PojoStoreElements();
		WebElement txtUserid = pj.getTxtUserid();
		filltext(txtUserid, "pardhu1991");
		
				
		System.out.println("test1");
	
		//PojoStoreElements pj= new PojoStoreElements();
		WebElement txtpassword = pj.getTxtpassword();
		filltext(txtpassword, "Insqea2029");
				System.out.println("test2");
	}
	
	@Test
	public void tc2() throws AWTException, InterruptedException {
		PojoStoreElements pj= new PojoStoreElements();
		
		//WebElement checkoutdate = pj.getCheckoutdate();
		PojoStoreElements.toClick(pj.getLoginbtn());
		
		WebElement location = pj.getLocation();
		toSelect(location, 5);
		
		WebElement hotel = pj.getHotel();
		toSelect(hotel, 3);
		
		WebElement roomtype = pj.getRoomtype();
		toSelect(roomtype, 4);
	
		WebElement numberofrooms = pj.getNumberofrooms();
		toSelect(numberofrooms, 1);
		
		//WebElement checkindate = pj.getCheckindate();
		
		//Check in date 
//		WebElement checkindate = pj.getCheckindate();
//		checkindate.click();
//		selectALL();
//		deletAll();
//		filltext(checkindate, "20/04/2021");
//		
//		WebElement checkoutdate1 = pj.getCheckoutdate();
//		checkoutdate1.click();
//		
//		selectALL();
//		deletAll();
//		filltext(checkoutdate1, "10/5/2021");
//		
		
		WebElement adultroom = pj.getAdultroom();
		toSelect(adultroom, 1);
		
		WebElement childroom = pj.getChildroom();
		toSelect(childroom, 1);
		hold(3000);
		
		WebElement searchstart = pj.getSearchstart();
		toClick(searchstart);
		
		
	
	}
	@Test
	public void tc3() throws IOException, InterruptedException{
	PojoStoreElements pj= new PojoStoreElements();
	pj.getRadioselect().click();
	pj.getClickcontinue().click();
	
	WebElement firstnameH = pj.getFirstnameH();
	NewBaseClass.filltext(firstnameH, "John");
	WebElement lastnameh = pj.getLastnameh();
	filltext(lastnameh, "Jackob");
	
	WebElement billingPaddress = pj.getBillingPaddress();
	filltext(billingPaddress, "India Tamil Nadu Chennai OMR 600097");
	
	WebElement cardnum = pj.getCardnum();
	filltext(cardnum, "1234567890123456");
	
	WebElement cardtype = pj.getCardtype();
	toSelect(cardtype, 1);
	
	WebElement expirymonthc = pj.getExpirymonthc();
	toSelect(expirymonthc, 7);
	
	WebElement expiryyesr = pj.getExpiryyesr();
	toSelect(expiryyesr, 12);
	WebElement cvv = pj.getCVV();
	filltext(cvv, "124");
	
	WebElement booknow = pj.getBooknow();
	toClick(booknow);
	
	hold(10000);
	takeSnap(null);
	}
	
	
	
	
}


