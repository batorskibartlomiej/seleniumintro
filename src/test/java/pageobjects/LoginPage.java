package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.manager.DriverManager;
import waits.WaitForElement;

public class LoginPage {

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
    }

    public void typeIntoPasswordField(String password){
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickOnLoginButton(){

        signOnButton.click();
    }

    public void clickFish(){
        btnFishImage.click();
    }

    public String getWarningMessage(){
        WaitForElement.waitUntilElementsVisible(messageLabel);

        String warningText = messageLabel.getText();
        return warningText;
    }
}
