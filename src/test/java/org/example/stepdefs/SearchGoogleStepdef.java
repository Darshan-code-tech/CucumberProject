package org.example.stepdefs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.example.pages.SearchGooglePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import factory.DriverFact;


public class SearchGoogleStepdef{
    WebDriver driver;
    SearchGooglePage searchGooglePage;

    @Given("^I am on search page$")
    public void i_am_on_search_page(){
        driver = DriverFact.getDriver();
        driver.get("https://www.google.com/");
        searchGooglePage = new SearchGooglePage(driver);

    }

    @Given("I have entered a {string} in the search box")
    public void i_have_entered_a_in_the_search_box(String string) {

        searchGooglePage.enterText(string);
    }

    @When("^I click on the search button$")
    public void i_click_on_the_search_button(){

        searchGooglePage.clickGoogleSearchButton();
    }

    @Then("I should see the {string} successfully")
    public void i_should_see_the_successfully(String expectedResult){
        Assert.assertEquals(expectedResult,searchGooglePage.getDynamicElement(expectedResult).getText());
    }
}
