package com.org.sbms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BaseTest{
	
	By img=By.xpath("//img[@title='naveenopencart']");
	By editEmailID=By.cssSelector("input[id='input-email']");
	By editPassword=By.cssSelector("input[id='input-password']");
	By btnSubmit=By.xpath("//input[@type='submit']");
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
    public boolean verifyLoginPage()
    {
    	return driver.findElement(img).isDisplayed();
    }
	
    public void setEmailID(String emailID)
    {
      waitForWebElement(editEmailID);
      driver.findElement(editEmailID).sendKeys(emailID);
    }

    public void setPassword(String password)
    {
    	waitForWebElement(editPassword);
        driver.findElement(editPassword).sendKeys(password);
      
    }
    public void clickLoginButton() {
    	waitForWebElement(btnSubmit);
    	//driver.findElement(btnSubmit).submit();
    }
}
