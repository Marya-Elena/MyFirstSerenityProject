package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

@DefaultUrl("http://qa2.fasttrackit.org:8008/?page_id=7")
public class MyAccountPage extends PageObject {

    @FindBy(css = "div.woocommerce-MyAccount-content strong:nth-child(1)")
    private WebElementFacade welcomeMessageStrong;


    public boolean checkLoggedIn(){
        waitFor(welcomeMessageStrong);
        return welcomeMessageStrong.containsText("kyalcin.a");
    }

    @FindBy( css = "li.woocommerce-MyAccount-navigation-link.woocommerce-MyAccount-navigation-link--edit-account > a")
     private WebElementFacade buttonAccountDetails;

    @FindBy (id="account_first_name")
    private WebElementFacade writeFirstName;

    @FindBy (id="account_last_name")
    private WebElementFacade writeLastName;

    @FindBy(id="account_email")
    private WebElementFacade writeEmailAddress;


    @FindBy(css="button[value='Save changes']")
    private WebElementFacade buttonSaveChanges;


    public void clickOnButtonAccountDetails(){
        clickOn(buttonAccountDetails);
    }
    public void setFirstNameDataAccount(){
        waitFor(writeFirstName);
        typeInto(writeFirstName,"Chis");

    }
    public void setLastNameDataAccount(){
        waitFor(writeLastName);
        typeInto(writeLastName,"Maria-Elena");
    }

    public void setEmailAddress(){
        waitFor(writeEmailAddress);
        typeInto(writeEmailAddress,"kyalcin.a@qzvbxqe5dx.tk");
    }

    public void clickOnButtonSaveChanges(){
        clickOn(buttonSaveChanges);
    }

}
