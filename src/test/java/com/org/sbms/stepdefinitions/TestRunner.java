package com.org.sbms.stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
                 glue = "com.org.sbms.stepdefinitions",
                 tags="@loginwithvalidcreds",
                 dryRun = false,
                 plugin = { "pretty", "html:target/cucumber-reports.html"}
                 )
public class TestRunner {

}
