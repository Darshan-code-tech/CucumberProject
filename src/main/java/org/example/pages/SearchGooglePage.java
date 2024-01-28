package org.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ElementUtils;
import utils.CommonUtils;
public class SearchGooglePage {

    // Locators
    @FindBy(id = "APjFqb")
    WebElement searchInputLocator;
    WebElement parentElement;

    @FindBy(name="btnK")
    WebElement googleSearchButtonLocator;

//    @FindBy(xpath = "//div[@class='yuRUbf']//descendant::h3[contains(text(), 'Selenium')]")
//    WebElement searchResult;

    @FindBy(id="result-stats")
    WebElement searchPage;

    private WebDriver driver;
    private ElementUtils elementUtils;

    //Constructor
    public SearchGooglePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        elementUtils = new ElementUtils(driver);
    }

    // Methods
    public void enterText(String text) {
        searchInputLocator.sendKeys(text);
    }
    public void clickGoogleSearchButton(){
        googleSearchButtonLocator.click();
    }

//    public String getMessageText() {
//        return elementUtils.getTextFromElement(searchResult,CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
//    }

    public Boolean isAvailable() {
        Boolean Display = searchPage.isDisplayed();
        return Display;
    }

    public  WebElement getDynamicElement(String searchText){
        return driver.findElement(By.xpath("//h3[normalize-space()='"+searchText+"']"));
    }
}
