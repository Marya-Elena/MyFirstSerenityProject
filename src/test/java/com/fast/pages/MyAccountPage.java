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

    @FindBy(css=".woocommerce-error strong")
    private WebElementFacade errorInvalidUsernameStrong;

    public boolean checkLoggedIn( String messageText){
        waitFor(welcomeMessageStrong);
        return welcomeMessageStrong.containsText(messageText);
    }
    public void clickOnButtonAccountDetails(){
        clickOn(buttonAccountDetails);
    }
    public void setFirstNameDataAccount(String firstname){
        waitFor(writeFirstName);
        typeInto(writeFirstName,firstname);

    }
    public void setLastNameDataAccount(String lastName){
        waitFor(writeLastName);
        typeInto(writeLastName,lastName);
    }

    public void setEmailAddress(String emailAdress){
        waitFor(writeEmailAddress);
        typeInto(writeEmailAddress,emailAdress);
    }

    public void clickOnButtonSaveChanges(){
        clickOn(buttonSaveChanges);
    }
    public boolean checkLoggedInvalid( String messageErrorText){
        waitFor(errorInvalidUsernameStrong);
        return errorInvalidUsernameStrong.containsText(messageErrorText);
    }
}
