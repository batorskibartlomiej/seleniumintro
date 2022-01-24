import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FluentWaitTest {

    private WebDriver driver;


    @BeforeMethod
    public void beforeMethod() {
        System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://theinternet.przyklady.javastart.pl/dynamic_loading/1");
    }



    @Test
    public void fluentWaitTest(){
        WebElement text= driver.findElement(By.cssSelector("#finish > h4"));
        Assert.assertFalse(text.isDisplayed());

        WebElement button = driver.findElement(By.xpath("//*[@id='start']/button"));
        button.click();

        //FluentWait<WebDriver> fluentWait = new FluentWait<>();
        FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver);
        fluentWait
                .pollingEvery(Duration.ofMillis(250))
                .withTimeout(Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOf(text));

        Assert.assertTrue(text.isDisplayed());





    }


    @AfterMethod
    public void quit(){
        driver.close();
        driver.quit();
    }


}
