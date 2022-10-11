package com.StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import com.Baseclass.BaseClass;
import com.Pojo.PojoClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
PojoClass p;

@Given("User need to click forgetpassword button using chrome browser")
public void user_need_to_click_forgetpassword_button_using_chrome_browser() {
	browserLaunch();
	getUrl("https://www.facebook.com");

}

@Given("Need to click forgetpassword button")
public void need_to_click_forgetpassword_button() {
	  p= new PojoClass();
	  WebElement frgtPass = p.getFrgtPass();
	  select(frgtPass);
}

@When("User need to enter linked phone numner or email")
public void user_need_to_enter_linked_phone_numner_or_email() {
p=new PojoClass();
WebElement frgtEmail = p.getFrgtEmail();
fill(frgtEmail, "shyamala@gmail.com");

 }

@When("Need to click select button")
public void need_to_click_select_button() {
   p=new PojoClass();
   WebElement frgtSelect = p.getFrgtSelect();
   select(frgtSelect);
		   
}

@Then("is that you page should be shown")
public void is_that_you_page_should_be_shown() {
    
}

	@Given("User need to enter invalid username and password using chrome browser")
	public void user_need_to_enter_invalid_username_and_password_using_chrome_browser() {
		
		browserLaunch();
		getUrl("https://www.facebook.com");
	    
	}

	@When("User need to enter invalid username and password")
	public void user_need_to_enter_invalid_username_and_password() {
		
		p=new PojoClass();
		WebElement email = p.getEmail();
		fill(email, "shyamala@gmail.com");
		WebElement password = p.getPass();
		fill(password, "shyamala@123");
	   
	}

	@When("Need to click login button")
	public void need_to_click_login_button() throws InterruptedException {
	WebElement loginButton = p.getLoginButton();
	select(loginButton);
	Thread.sleep(5000);
	String currentUrl = driver.getCurrentUrl();
	System.out.println("After browser launch:"+currentUrl);
	
	}
	
	@When("User need to enter valid username and invalid password")
	public void user_need_to_enter_valid_username_and_invalid_password() {
	   p=new PojoClass();
	   WebElement email = p.getEmail();
	   fill(email, "amala@gmail.com");
		WebElement password = p.getPass();
		fill(password, "amala@123");
	}


	@Then("Wrong credential page need to be shown")
	public void wrong_credential_page_need_to_be_shown() {
		String currentUrl = driver.getCurrentUrl();
		if (currentUrl.contains("privacy_mutation_token")) {
			System.out.println("Invalid user credentials entered");
		}
		else {
			System.out.println("bug in the website");
		}
	}



}
