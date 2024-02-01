package org.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class SearchGooglePage {

    WebDriver driver;

    public SearchGooglePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    // Locators
    @FindBy(id="APjFqb")
    WebElement searchInputLocator;

    @FindBy(name="btnK")
    WebElement googleSearchButtonLocator;


    @FindBy(id="result-stats")
    WebElement searchPage;

    // Methods
    public void enterText(String text) {

        searchInputLocator.sendKeys(text);
    }
    public void clickGoogleSearchButton(){

        googleSearchButtonLocator.click();
    }

    public  WebElement getDynamicElement(String searchText){
        return driver.findElement(By.xpath("//h3[normalize-space()='"+searchText+"']"));
    }
}
