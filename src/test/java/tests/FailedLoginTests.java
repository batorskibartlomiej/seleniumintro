package tests;

import driver.manager.DriverUtils;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import pageobjects.LoginPage;
import utils.testng.listeners.RetryAnalyzer;

import static navigation.ApplicationURLs.LOGIN_URL;
import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

public class FailedLoginTests extends TestBase {

    @Issue("DEFECT-1")
    @TmsLink("ID-1")
    @Severity(SeverityLevel.NORMAL)
    @Test(retryAnalyzer = RetryAnalyzer.class)
    @Description("The goal of this test is to log in using not proper username and password" +
            " and check if warning message Invalid username or password is displayed")
    public void asUserTryToLogInWithIncorrectLoginAndPassword(){

        DriverUtils.navigateToPage(LOGIN_URL);

       LoginPage loginPage = new LoginPage();
       loginPage

                .typeIntoUserNameField("NotExistingLogin")
                .typeIntoPasswordField("NotProperPassword")
                .clickOnLoginButton();
       loginPage
               .assertThatWarningIsDisplayed("Invalid username or password. Signon failed.");

//        TopMenuPage topMenuPage = new TopMenuPage();
//        topMenuPage.clickOnSignInLink();

//        LoginPage loginPage = new LoginPage();
//        //PageFactory.initElements(driver,loginPage);
//        loginPage.typeIntoUserNameField("NotExistingLogin");
//        loginPage.typeIntoPasswordField("NotProperPassword");
//        loginPage.clickOnLoginButton();
        LoginPage loginPage = new LoginPage();
        String warningMessage = loginPage.getWarningMessage();

        assertEquals(warningMessage, "Invalid username or password. Signon failed.");


    }









}
