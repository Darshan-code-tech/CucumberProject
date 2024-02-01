package org.example.stepdefs;
import factory.DriverFact;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.SearchYahooPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SearchYahooStepdef {
    WebDriver driver;
    SearchYahooPage searchYahooPage;

    @Given("^I am on yahoo search page$")
    public void i_am_on_yahoo_search_page() {
        driver = DriverFact.getDriver();
        driver.get("https://www.yahoo.com/");
        searchYahooPage = new SearchYahooPage(driver);
    }

    @Given("I have entered a yahoo {string} in the search box")
    public void i_have_entered_a_yahoo_in_the_search_box(String string)
    {

        searchYahooPage.enterInput(string);
    }

    @When("I click on the enter button")
    public void i_click_on_the_enter_button(){

        searchYahooPage.enterSearch();
    }

    @Then("I should see the {string} successfully on yahoo")
    public void i_should_see_the_successfully_on_yahoo(String expectedResult) {
        Assert.assertEquals(expectedResult,searchYahooPage.getElement(expectedResult).getAttribute("aria-label"));
    }
}
