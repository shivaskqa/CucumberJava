package com.org.sbms.pages;

import java.time.Duration;
import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {
	
	public static WebDriver driver;
	public static ResourceBundle resourceBundle;

	By linkMyAccount=By.xpath("//a[@title='My Account']");
	By loginLink= By.xpath("//li/a[text()='Login']");
	By registerLink=By.xpath("//li/a[text()='Register']");
	
	
	public static WebDriver driverInit()
	{
		resourceBundle=ResourceBundle.getBundle("config");
		String browserName=resourceBundle.getString("browser");
		String implictWaitTime=resourceBundle.getString("implicitWaitTime");
		String appURL=resourceBundle.getString("appURL");
				
		if(browserName.equalsIgnoreCase("chrome"))
			       driver=new ChromeDriver();
		else
			driver=new EdgeDriver();

		   driver.get(appURL);
		   driver.manage().window().maximize();
	       driver.manage().deleteAllCookies();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(implictWaitTime)));
		
	     return driver;  
	}
	
	
	
	
	public WebElement waitForWebElement(By byLocator)
	{
		WebDriverWait webDriverWait=new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement we=webDriverWait.until(ExpectedConditions.presenceOfElementLocated(byLocator));
		return we;
	}
	
	public void verifyHomePage()
	{
		WebElement we=waitForWebElement(linkMyAccount);
		we.click();
		
        waitForWebElement(loginLink);
        waitForWebElement(registerLink);
        	
	}

	public void navigateToLoginPage()
	{
		WebElement we=waitForWebElement(loginLink);
		we.click();
	}
	public void navigateToRegisterPage()
	{
		waitForWebElement(registerLink).click();
	}
	
}
