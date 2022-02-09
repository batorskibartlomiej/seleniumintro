package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.*;
import tests.TestBase;

public class ShoppingCartTest extends TestBase {


    @Test
    public void asNotLoggedInUserIShallNotProceedToCheckout() {
        LandingPage landingPage = new LandingPage();
        landingPage.clickOnEnterStoreLink();

        LoginPage loginPage = new LoginPage();
        loginPage.clickFish();

        FishListPage fishListPage = new FishListPage();
        fishListPage.clickOnAngelfishId();

        AngelfishListPage angelfishListPage= new AngelfishListPage();
        angelfishListPage.clickOnAddToCartSmallAngelfish();

        ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
        shoppingCartPage.setProceedToCheckout();

        loginPage = new LoginPage();
        String warningMessage= loginPage.getWarningMessage();
        Assert.assertEquals(warningMessage, "You must sign on before attempting to check out. Please sign on and try checking out again.");


    }




}
