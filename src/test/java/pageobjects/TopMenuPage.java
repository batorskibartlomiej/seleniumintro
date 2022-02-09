package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.manager.DriverManager;
import waits.WaitForElement;

public class TopMenuPage {

    @FindBy(css = "#MenuContent a[href*='signonForm']")
    WebElement signOnLink;




    public TopMenuPage(){


        PageFactory.initElements(DriverManager.getWebDriver(),this);
    }

    public void clickOnSignInLink(){
        WaitForElement.waitUntilElementIsClickable(signOnLink);

        signOnLink.click();
    }


}
