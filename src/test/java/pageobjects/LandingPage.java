package pageobjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.manager.DriverManager;
import waits.WaitForElement;

public class LandingPage {


    private Logger logger = LogManager.getRootLogger();

    @FindBy(css = "#Content a" )
    WebElement enterStoreLink;




    public LandingPage(){

        PageFactory.initElements(DriverManager.getWebDriver(),this);
    }

    public void clickOnEnterStoreLink(){
        WaitForElement.waitUntilElementIsClickable(enterStoreLink);
        enterStoreLink.click();
        logger.info("Clicked on Enter Store link");

    }
}
