package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ElementUtils {

    WebDriver driver;

    public ElementUtils(WebDriver driver) {
        this.driver = driver;

    }
    public WebElement waitForElement(WebElement element, long durationInSeconds) {
        WebElement webElement = null;
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(durationInSeconds));
            webElement = wait.until(ExpectedConditions.visibilityOf(element));
        }catch(Throwable e) {
            e.printStackTrace();
        }
        return webElement;

    }
    public String getTextFromElement(WebElement element,long durationInSeconds) {
        WebElement webElement = waitForElement(element,durationInSeconds);
        return webElement.getText();

    }
}
