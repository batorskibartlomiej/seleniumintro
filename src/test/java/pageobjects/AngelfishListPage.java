package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.manager.DriverManager;

public class AngelfishListPage {

    @FindBy(css="a.Button[href$='EST-2']")
    private WebElement smallAngelfishAddToCartButton;





    public AngelfishListPage(){

        PageFactory.initElements(DriverManager.getWebDriver(),this);
    }


    public void clickOnAddToCartSmallAngelfish(){
        smallAngelfishAddToCartButton.click();
    }
}
