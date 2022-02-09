package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.manager.DriverManager;
import waits.WaitForElement;

public class LandingPage {

    @FindBy(css = "#Content a" )
    WebElement enterStoreLink;




    public LandingPage(){

        PageFactory.initElements(DriverManager.getWebDriver(),this);
    }

    public void clickOnEnterStoreLink(){
        WaitForElement.waitUntilElementIsClickable(enterStoreLink);
        enterStoreLink.click();

    }
}