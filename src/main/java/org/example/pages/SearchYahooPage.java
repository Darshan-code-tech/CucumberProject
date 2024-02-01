package org.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchYahooPage {

    WebDriver driver;

    public SearchYahooPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    // Locators
    @FindBy(id="ybar-sbq")
    WebElement searchLocator;

    // Methods
    public void enterInput(String text) {
        searchLocator.click();
        searchLocator.clear();
        searchLocator.sendKeys(text);
    }

    public void enterSearch(){
        searchLocator.sendKeys(Keys.ENTER);
    }

    public  WebElement getElement(String searchText){
        return driver.findElement(By.xpath("//a[@aria-label='"+searchText+"']"));
    }
}
