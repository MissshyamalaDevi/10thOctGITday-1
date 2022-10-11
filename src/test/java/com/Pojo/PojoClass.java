package com.Pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.BaseClass;

public class PojoClass extends BaseClass {
	public PojoClass() {
		PageFactory.initElements(driver, this);
	}
	
		@FindBy(name="username")
		private WebElement userId;
		@FindBy(id="password")
		private WebElement passWord;
		@FindBy(id="login")
		private WebElement logIn;
		
		
		
		public WebElement getUserId() {
			return userId;
		}
		public WebElement getPassWord() {
			return passWord;
		}
		public WebElement getLogIn() {
			return logIn;
		}
	
	//hotel bookings
		@FindBy(xpath="//option[text()='Sydney']")
		private WebElement location;
		@FindBy(xpath="//option[text()='Hotel Creek']")
		private WebElement hotels;
		@FindBy(xpath="//option[text()='Standard']")
		private WebElement roomType;
		@FindBy(xpath="(//option[text()='2 - Two'])[1]")
		private WebElement noOfRooms;
		@FindBy(id="Submit")
		private WebElement submitButton;
		@FindBy(id="radiobutton_0")
		private WebElement radioSelect;
		@FindBy(id="continue")
		private WebElement conti;
		@FindBy(id="first_name")
		private WebElement firstName;
		@FindBy(id="last_name")
		private WebElement lastName;
		@FindBy(id="address")
		private WebElement billingAddress;
		@FindBy(id="cc_num")
		private WebElement creditCardNo;
		@FindBy(xpath="//option[text()='VISA']")
		private WebElement creditCardType;
		@FindBy(xpath="//option[text()='February']")
		private WebElement expiryDate;
		@FindBy(xpath="//option[text()='2022']")
		private WebElement selectYear;
		@FindBy(id="cc_cvv")
		private WebElement cvv;
		@FindBy(id="book_now")
		private WebElement bookNow;
		@FindBy(xpath="//a[text()='Booked Itinerary']")
		private WebElement itenary;
		@FindBy(xpath="//strong[text()='Order Id ']")
		private WebElement orderId;



		public WebElement getOrderId() {
			return orderId;
		}
		public WebElement getItenary() {
			return itenary;
		}
		public WebElement getBookNow() {
			return bookNow;
		}
		public WebElement getLocation() {
			return location;
		}
		public WebElement getHotels() {
			return hotels;
		}
		public WebElement getRoomType() {
			return roomType;
		}
		public WebElement getNoOfRooms() {
			return noOfRooms;
		}
		public WebElement getSubmitButton() {
			return submitButton;
		}
		public WebElement getRadioSelect() {
			return radioSelect;
		}
		public WebElement getConti() {
			return conti;
		}
		public WebElement getFirstName() {
			return firstName;
		}
		public WebElement getLastName() {
			return lastName;
		}
		public WebElement getBillingAddress() {
			return billingAddress;
		}
		public WebElement getCreditCardNo() {
			return creditCardNo;
		}
		public WebElement getCreditCardType() {
			return creditCardType;
		}
		public WebElement getExpiryDate() {
			return expiryDate;
		}
		public WebElement getSelectYear() {
			return selectYear;
		}
		public WebElement getCvv() {
			return cvv;
		}
		
		//facebook details
		@FindBy(id="email")
		private WebElement email;
		@FindBy(id="pass")
		private WebElement pass;
		@FindBy(name="login")
		private WebElement loginButton;
		@FindBy(xpath="//a[text()='Forgotten password?']")
		private WebElement frgtPass;
		@FindBy(id="identify_email")
		private WebElement frgtEmail;
		@FindBy(id="did_submit")
		private WebElement frgtSelect;



		public WebElement getFrgtPass() {
			return frgtPass;
		}
		public WebElement getFrgtEmail() {
			return frgtEmail;
		}
		public WebElement getFrgtSelect() {
			return frgtSelect;
		}
		public WebElement getEmail() {
			return email;
		}
		public WebElement getPass() {
			return pass;
		}
		public WebElement getLoginButton() {
			return loginButton;
		}
		
	//redbus
		@FindBy (id="sign-in-icon-down")
		private WebElement sign;
		@FindBy(id="signInLink")
		private WebElement signup;
		@FindBy(id="newFbId")
		private WebElement fblog;



		public WebElement getSign() {
			return sign;
		}
		public WebElement getSignup() {
			return signup;
		}
		public WebElement getFblog() {
			return fblog;
		}
		
	//flipkart login
		@FindBy (xpath="(//input[@autocomplete='off'])[2]")
		private WebElement flipEmail;
		@FindBy (xpath="(//input[@autocomplete='off'])[3]")
		private WebElement flipPass;



		public WebElement getFlipEmail() {
			return flipEmail;
		}
		public WebElement getFlipPass() {
			return flipPass;
		}
		
	
	
	
	
	
	
	
	
	
	
}

