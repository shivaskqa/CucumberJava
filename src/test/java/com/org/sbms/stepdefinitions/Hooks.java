package com.org.sbms.stepdefinitions;


import java.io.File;
import java.time.Duration;
import java.util.ResourceBundle;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.org.sbms.pages.BaseTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseTest {
	
	
@After(order = 1)
public void takeScraenshotOnFailure(Scenario scenario) {

if (scenario.isFailed()) {

TakesScreenshot ts = (TakesScreenshot) driver;

byte[] src= ts.getScreenshotAs(OutputType.BYTES);
scenario.attach(src, "image/png", "screenshot");
}

}

@After(order = 0)
public void tearDown() {
driver.close();

}
}