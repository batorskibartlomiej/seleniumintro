package pageobjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.manager.DriverManager;
import waits.WaitForElement;

public class LoginPage {

    private Logger logger = LogManager.getRootLogger();

    @FindBy(name="username")
    private WebElement usernameField;

    @FindBy(name = "password")
    private WebElement passwordField;

    @FindBy(name = "signon")
    private WebElement signOnButton;

    @FindBy(css = "#Content ul[class='messages'] li")
    private WebElement messageLabel;

    @FindBy(xpath = "//*[@id='SidebarContent']/a[1]/img")
    private WebElement btnFishImage;



    public LoginPage() {

        PageFactory.initElements(DriverManager.getWebDriver(),this);
    }

    public void typeIntoUserNameField(String username){
        WaitForElement.waitUntilElementsVisible(usernameField);
        usernameField.clear();
        usernameField.sendKeys(username);
        logger.info("Typed into User Name Field {}", username);
    }

    public void typeIntoPasswordField(String password){
        passwordField.clear();
        passwordField.sendKeys(password);
        logger.info("Typed into Password Field {}", password);
    }

    public void clickOnLoginButton(){

        signOnButton.click();
        logger.info("Clicked on Login Button");
    }

    public void clickFish(){
        btnFishImage.click();
        logger.info("Clicked on fish image");
    }

    public String getWarningMessage(){
        WaitForElement.waitUntilElementsVisible(messageLabel);

        String warningText = messageLabel.getText();
        logger.info("Returned warning message was: {}", warningText);
        return warningText;
    }
}
