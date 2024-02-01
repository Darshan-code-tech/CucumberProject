package org.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchBingPage {

    WebDriver driver;
    public SearchBingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="//textarea[@id='sb_form_q']")
    WebElement searchBingLocator;

    public void enterBingText(String text){

        searchBingLocator.clear();
        searchBingLocator.click();
        searchBingLocator.sendKeys(text);
    }
    public void clickBingSearchButton() throws InterruptedException {
        Thread.sleep(2000);
        searchBingLocator.sendKeys(Keys.ENTER);
    }
    public  WebElement getBingElement(String searchText){
        return driver.findElement(By.xpath("//a[normalize-space()='"+searchText+"']"));
    }
}
