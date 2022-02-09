package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.manager.DriverManager;
import waits.WaitForElement;

public class FooterPage {


    @FindBy(id = "Banner")
    private WebElement bannerAfterLoginLogo;



    public FooterPage(){

        PageFactory.initElements(DriverManager.getWebDriver(),this);
    }

    public boolean isBannerAfterLoginDisplayed(){
        WaitForElement.waitUntilElementsVisible(bannerAfterLoginLogo);
        boolean isDisplayed = bannerAfterLoginLogo.isDisplayed();
        return isDisplayed;
    }




}
