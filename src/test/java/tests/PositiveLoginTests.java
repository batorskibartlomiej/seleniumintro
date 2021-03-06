package tests;

import driver.manager.DriverUtils;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.TmsLink;
import org.testng.annotations.Test;
import pageobjects.FooterPage;
import pageobjects.LandingPage;
import pageobjects.LoginPage;
import pageobjects.TopMenuPage;

import static navigation.ApplicationURLs.LOGIN_URL;
import static org.testng.Assert.assertTrue;

public class PositiveLoginTests extends TestBase {


    @TmsLink("ID-2")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    @Description("The goal of this test is to log in using proper username and password" +
            " and check if Dog Banner is displayed after")
    public void asUserLoginUsingValidLoginAndPassword() {

        DriverUtils.navigateToPage(LOGIN_URL);

       LoginPage loginPage = new LoginPage();
       loginPage
                .typeIntoUserNameField("j2ee")
                .typeIntoPasswordField("j2ee")
                .clickOnLoginButton()
                .assertThatDogBannerIsDisplayed();

//        TopMenuPage topMenuPage = new TopMenuPage();
//        topMenuPage.clickOnSignInLink();

//        LoginPage loginPage = new LoginPage();
//        loginPage.typeIntoUserNameField("j2ee");
//        loginPage.typeIntoPasswordField("j2ee");
//        loginPage.clickOnLoginButton();
//        FooterPage footerPage = new FooterPage();


    }


}