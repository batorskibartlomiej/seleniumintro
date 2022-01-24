import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class ExplictWaitTests2 {


    private WebDriver driver;


    @BeforeMethod
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://theinternet.przyklady.javastart.pl/dynamic_controls");


    }


    @Test
    public void waitForPresenceOfTheElement() throws InterruptedException {
        WebElement checkbox = driver.findElement(By.id("checkbox"));
        assertFalse(checkbox.isSelected());
        assertTrue(checkbox.isDisplayed());

        WebElement removeButton = driver.findElement(By.xpath("//*[@id='checkbox-example']/button"));
        removeButton.click();


        WaitUntil waitUntil = new WaitUntil(driver);
        waitUntil.waitUntilElementIsInvisible(checkbox);


        WebElement text = driver.findElement(By.id("message"));
        //assertTrue(text.getText(), "It's gone!");
        Assert.assertEquals(text.getText(), "It's gone!");


        WebElement enableButton = driver.findElement(By.xpath("//*[@id='input-example']/button"));
        removeButton.click();

        //checkbox=waitUntil.waitUntilPreenceOfElementLocated(By.id("checkbox"));
        checkbox = waitUntil.waitUntilPresenceOfElementLocated(By.id("checkbox"));
        assertFalse(checkbox.isSelected());
        assertTrue(checkbox.isDisplayed());


    }

    @AfterMethod
    public void quit() {

        driver.close();
        driver.quit();
    }


}
