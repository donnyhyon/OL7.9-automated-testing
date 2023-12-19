package io.cucumber.skeleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.After;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class StepDefinitions {
    WebDriver driver = null;
    @Given("I am on a chrome browser")
    public void i_am_on_a_chrome_browser() {
        driver = new ChromeDriver();
    }
    @When("I go to {string}")
    public void i_go_to(String url) {
        driver.get(url);
    }
    @Then("I should see the title {string}")
    public void i_should_see_google_title(String title) {
        String actual_title = driver.getTitle();
        Assertions.assertEquals(title, actual_title);
    }

    @After
    public void tearDown(){
        driver.close();
    }
}
