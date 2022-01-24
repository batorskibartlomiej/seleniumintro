import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class FluentWaitTests2 {



    private WebDriver driver;


    @BeforeMethod
    public void beforeMethod(){
        System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
        driver= new ChromeDriver();


    }


    @Test
    public void fluentWaitExceptionTest(){
        driver.navigate().to("http://theinternet.przyklady.javastart.pl/dynamic_loading/2");
        WebElement button = driver.findElement(By.xpath("//*[@id='start']/button"));
        button.click();
        //*[@id="finish"]/h4



//        WaitUntil waitUntil = new WaitUntil(driver);
//        waitUntil.waitUntilPresenceOfElementLocated(By.xpath("//*[@id='finish']/h4"));
//

        FluentWait<WebDriver>fluentWait= new FluentWait(driver);
        WebElement helloMsg=
        fluentWait.withTimeout(Duration.ofSeconds(10))
        .pollingEvery(Duration.ofMillis(250))
        .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='finish']/h4")));

        Assert.assertTrue(helloMsg.isDisplayed());









    }

    @AfterMethod
    public void afterTest() {
        driver.close();
        driver.quit();
    }

}
