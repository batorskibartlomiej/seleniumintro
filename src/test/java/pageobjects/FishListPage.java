package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.manager.DriverManager;

public class FishListPage {

    //@FindBy(xpath = "//*[@id='Catalog']/table/tbody/tr[2]/td[1]/a")
    //@FindBy(partialLinkText = "FI-SW-01")
    @FindBy(css = "tr:nth-child(2) a")
    private WebElement angelfishIdLink;


    public FishListPage() {

        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void clickOnAngelfishId() {
        angelfishIdLink.click();
    }
}