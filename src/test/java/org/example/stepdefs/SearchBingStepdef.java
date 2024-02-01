package org.example.stepdefs;

import factory.DriverFact;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.SearchBingPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SearchBingStepdef {
    WebDriver driver;
    SearchBingPage searchBingPage;

    @Given("^I am on bing search page$")
    public void i_am_on_bing_search_page(){
        driver = DriverFact.getDriver();
        driver.get("https://www.bing.com/");
        searchBingPage = new SearchBingPage(driver);
    }

    @Given("I have entered a {string} in the bing search box")
    public void i_have_entered_a_in_the_bing_search_box(String string) {

        searchBingPage.enterBingText(string);
    }

    @When("^I click on the bing search button$")
    public void i_click_on_the_bing_search_button() throws InterruptedException {

        searchBingPage.clickBingSearchButton();
    }

    @Then("I should see the {string} successfully on bing")
    public void i_should_see_the_successfully_on_bing(String expectedResult){
        System.out.println(searchBingPage.getBingElement(expectedResult).getText());
        System.out.println("Here");
        Assert.assertEquals(expectedResult,searchBingPage.getBingElement(expectedResult).getText());

    }
}
