package tests;

import driver.manager.DriverUtils;
import org.testng.annotations.Test;
import pageobjects.FooterPage;
import pageobjects.LandingPage;
import pageobjects.LoginPage;
import pageobjects.TopMenuPage;

import static navigation.ApplicationURLs.LOGIN_URL;
import static org.testng.Assert.assertTrue;

public class PositiveLoginTests extends TestBase {


    @Test
    public void asUserLoginUsingValidLoginAndPassword() {

        DriverUtils.navigateToPage(LOGIN_URL);

       LoginPage loginPage = new LoginPage();
       boolean isBannerAfterLoginDisplayed=loginPage
                .typeIntoUserNameField("j2ee")
                .typeIntoPasswordField("j2ee")
                .clickOnLoginButton()
                .isBannerAfterLoginDisplayed();

//        TopMenuPage topMenuPage = new TopMenuPage();
//        topMenuPage.clickOnSignInLink();

//        LoginPage loginPage = new LoginPage();
//        loginPage.typeIntoUserNameField("j2ee");
//        loginPage.typeIntoPasswordField("j2ee");
//        loginPage.clickOnLoginButton();
//        FooterPage footerPage = new FooterPage();

        assertTrue(isBannerAfterLoginDisplayed);
    }


}