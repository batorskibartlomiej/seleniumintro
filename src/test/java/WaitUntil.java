import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUntil {

    private WebDriverWait webDriverWait;

    public WaitUntil(WebDriver driver){

        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void waitUntilElementIsInvisible(WebElement checkbox){
        webDriverWait.until(ExpectedConditions.invisibilityOf(checkbox));
    }


    public WebElement waitUntilPresenceOfElementLocated(By By){
        return webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By));
    }

    public void waitUntilElementIsVisible(WebElement x){
        webDriverWait.until(ExpectedConditions.visibilityOf(x));
    }



}
