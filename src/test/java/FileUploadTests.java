import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUploadTests {

    private WebDriver driver;

    @BeforeMethod
    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://theinternet.przyklady.javastart.pl/upload");


    }

    @Test
    public void fileUploadTest(){
        WebElement fileUpload= driver.findElement(By.id("file-upload"));
        fileUpload.sendKeys("C:/testfile.txt");

        WebElement fileSubmit = driver.findElement(By.id("file-submit"));
        fileSubmit.click();

        WebElement uploadedFiles = driver.findElement(By.id("uploaded-files"));
        Assert.assertEquals(uploadedFiles.getText(), "testfile.txt");




    }


    @AfterMethod
    public void quit(){
        driver.close();
        driver.quit();
    }
}
