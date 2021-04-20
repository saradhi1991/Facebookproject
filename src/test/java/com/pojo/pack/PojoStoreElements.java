package com.pojo.pack;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.baseclass.methods.NewBaseClass;

public class PojoStoreElements extends NewBaseClass {
	
	public PojoStoreElements() {
		PageFactory.initElements(driver, this);
	}
	
		//User ID
		@FindBy(xpath="//input[@id='username']")
		private WebElement txtUserid;
		

	
	
		@FindBy(xpath="//input[@id='password']")
		private WebElement txtpassword;
		//LoginBts
		@FindBy(xpath="//input[@id='login']")
		private WebElement loginbtn;
		
		
		//location dropdown
		@FindBy(xpath="//select[@id='location']")
		private WebElement location;
		
		//Hotel name 
		@FindBy(xpath="//select[@id='hotels']")
		private WebElement hotel;
		
		//RoomType
		@FindBy(xpath="//select[@id='room_type']")
		private WebElement roomtype;
		
		//number of rooms 
		@FindBy(xpath="//select[@id='room_nos']")
		private WebElement numberofrooms;
		
		//Check In Date
		@FindBy(xpath="//input[@id='datepick_in']")
		private WebElement checkindate;
		
		

		//Check out Date
		@FindBy(xpath="//input[@id='datepick_out']")
		private WebElement checkoutdate;
		
	

		//Adults per Room
		@FindBy(xpath="//select[@id='adult_room']")
		private WebElement adultroom;
		
		//Children per Room
		@FindBy(xpath="//select[@id='child_room']")
		private WebElement childroom;
		
		//serch
		@FindBy(xpath="//input[@id='Submit']")
		private WebElement searchstart;
		
		
		
		@FindBy(xpath="//input[@id='radiobutton_0']")
		private WebElement radioselect;
		
		@FindBy(xpath="//input[@id='continue']")
		private WebElement clickcontinue;
		
		//Book A Hotel first name
		@FindBy(xpath="//input[@id='first_name']")
		private WebElement firstnameH;
		
		

		@FindBy(xpath="//input[@id='last_name']")
		private WebElement lastnameh;
		
		@FindBy(xpath="//textarea[@id='address']")
		private WebElement billingPaddress;
		
		
		
		
		@FindBy(xpath="//input[@id='cc_num']")
		private WebElement cardnum;
		
		
		

		@FindBy(xpath="//select[@id='cc_type']")
		private WebElement cardtype;
		
		@FindBy(xpath="//select[@id='cc_exp_month']")
		private WebElement Expirymonthc;
		
		@FindBy(xpath="//select[@id='cc_exp_year']")
		private WebElement expiryyesr;
		
		@FindBy(xpath="//input[@id='cc_cvv']")
		private  WebElement CVV;
		
		@FindBy(xpath="//input[@id='book_now']")
		private WebElement booknowk;
		
		
		
	
				

				

		public WebElement getTxtUserid() {
			return txtUserid;
		}

		public WebElement getSearchstart() {
			return searchstart;
		}

		public WebElement getTxtpassword() {
			return txtpassword;
		}

		public WebElement getLoginbtn() {
			return loginbtn;
		}

		public WebElement getLocation() {
			return location;
		}

		public WebElement getHotel() {
			return hotel;
		}

		public WebElement getRoomtype() {
			return roomtype;
		}

		public WebElement getNumberofrooms() {
			return numberofrooms;
		}

		public WebElement getCheckindate() {
			return checkindate;
		}

		public WebElement getCheckoutdate() {
			return checkoutdate;
		}

		public WebElement getAdultroom() {
			return adultroom;
		}

		public WebElement getChildroom() {
			return childroom;
		}
		public WebElement getRadioselect() {
			return radioselect;
		}

		public WebElement getClickcontinue() {
			return clickcontinue;
		}
		
		public WebElement getFirstnameH() {
			return firstnameH;
		}

		public WebElement getLastnameh() {
			return lastnameh;
		}

		public WebElement getBillingPaddress() {
			return billingPaddress;
			
		}
		public WebElement getCardnum() {
			return cardnum;
		}

	
		public WebElement getCardtype() {
			return cardtype;
		}

		public WebElement getExpirymonthc() {
			return Expirymonthc;
		}

		public WebElement getExpiryyesr() {
			return expiryyesr;
		}

		public WebElement getCVV() {
			return CVV;
		}

		public WebElement getBooknow() {
			return booknowk;
		}

		
		

		
		
		
		
		
		
//		WebElement datedd = driver.findElement(By.xpath("//select[@id='day']"));
//		Select d = new Select(datedd); 
//		d.selectByIndex(17);
		
		
	}
	
	
	
	
	


