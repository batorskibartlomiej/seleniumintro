package pageobjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.manager.DriverManager;

public class ShoppingCartPage {

    private Logger logger = LogManager.getRootLogger();

    @FindBy(css= "a.Button[href$='newOrderForm=']" )
    private WebElement proceedToCheckout;




    public ShoppingCartPage(){

        PageFactory.initElements(DriverManager.getWebDriver(),this);

    }

    public LoginPage setProceedToCheckout(){
        proceedToCheckout.click();
        logger.info("Clicked on Proceed to checkout Button");
        return new LoginPage();
    }
}
