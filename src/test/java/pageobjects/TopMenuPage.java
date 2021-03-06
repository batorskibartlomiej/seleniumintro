package pageobjects;

import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.manager.DriverManager;
import waits.WaitForElement;

public class TopMenuPage extends BasePage {


    @FindBy(css = "#MenuContent a[href*='signonForm']")
    WebElement signOnLink;






    @Step("Click on Sign In Link")
    public LoginPage clickOnSignInLink(){
        WaitForElement.waitUntilElementIsClickable(signOnLink);

        signOnLink.click();
        log().info("Clicked on Sign on Link");
        return new LoginPage();
    }


}
