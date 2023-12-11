package io.cucumber.skeleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.After;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class StepDefinitions {
    WebDriver driver = new ChromeDriver();

    @Given("I am on a chrome browser")
    public void i_am_on_a_chrome_browser() {
        
    }
    @When("I get google")
    public void i_get_google() {
        driver.get("https://www.google.co.uk");
    }
    @Then("I should see google title")
    public void i_should_see_google_title() {
        driver.getTitle();
    }

    @After
    public void tearDown(){
        driver.close();
    }
}
