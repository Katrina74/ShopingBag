package ru.sf;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class StepDefinitions {
    WebDriver driver = new ChromeDriver();

    @Given("url of h&m  \\({string})")
    public void url_of_h_m(String url) {
        driver.get(url);
    }
    @When("website is open choose location")
    public void website_is_open_choose_location() {
        driver.findElement(By.id("suggestion-continue")).click();
    }
    @Then("accept all cookies")
    public void accept_all_cookies() {
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
    }
    @Then("start search {string}")
    public void start_search(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("click on first image")
    public void click_on_first_image() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("choose the size")
    public void choose_the_size() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("click add button")
    public void click_add_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}



