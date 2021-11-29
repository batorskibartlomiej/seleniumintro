import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class MyTest {

    private WebDriver driver;

    @BeforeMethod
    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
        driver= new ChromeDriver();
    }


    @Test
    public void myTest(){
        driver.navigate().to("https://selenium.dev/");
        String pageTitle= driver.getTitle();
        //assertTrue(pageTitle.equals("Selenium1"));
        Assert.assertEquals(pageTitle, "Selenium");


    }

    @AfterTest
    public void aftertest(){
        driver.close();
        driver.quit();
    }


}
