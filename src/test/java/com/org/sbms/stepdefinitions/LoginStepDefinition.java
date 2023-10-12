package com.org.sbms.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.org.sbms.pages.BaseTest;
import com.org.sbms.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	
	
	//BaseTest basetest=new BaseTest();
	WebDriver driver;
	LoginPage lpage;
	
	
	public LoginStepDefinition() {
	
		driver=BaseTest.driverInit();
		lpage=new LoginPage(driver);
	}
	
	@Given("user is on login page")
	public void user_is_on_login_page() {

	   
		lpage.verifyHomePage();
	    lpage.navigateToLoginPage();
	
	}

	@When("user enters username, password")
	public void user_enters_username_password() {

	   lpage.verifyLoginPage();
	   lpage.setEmailID("eeshaan");
	   lpage.setPassword("agasthya");
	
	}

	@When("click on login button")
	public void click_on_login_button() {

	lpage.clickLoginButton();
	
	
	}

	@Then("user navigates to home page")
	public void user_navigates_to_home_page() {

	   
		
	}

	@When("user enters {string}, {string}")
	public void user_enters_user1_pass1(String username,String password) {

         lpage.setEmailID(username);
         lpage.setPassword(password);
	
	}
	

}
