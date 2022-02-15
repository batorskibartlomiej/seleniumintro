package pageobjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.manager.DriverManager;
import waits.WaitForElement;

public class FooterPage {

    private Logger logger= LogManager.getRootLogger();


    @FindBy(id = "Banner")
    private WebElement bannerAfterLoginLogo;



    public FooterPage(){

        PageFactory.initElements(DriverManager.getWebDriver(),this);
    }

    public boolean isBannerAfterLoginDisplayed(){
        WaitForElement.waitUntilElementsVisible(bannerAfterLoginLogo);
        boolean isDisplayed = bannerAfterLoginLogo.isDisplayed();
        logger.info("Returning status of banner after login: {}", isDisplayed);
        return isDisplayed;
    }




}
