package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.manager.DriverManager;

public class ShoppingCartPage {

    @FindBy(css= "a.Button[href$='newOrderForm=']" )
    private WebElement proceedToCheckout;




    public ShoppingCartPage(){

        PageFactory.initElements(DriverManager.getWebDriver(),this);

    }

    public void setProceedToCheckout(){
        proceedToCheckout.click();
    }
}
