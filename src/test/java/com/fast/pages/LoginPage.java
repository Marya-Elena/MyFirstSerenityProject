package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import java.util.concurrent.TimeUnit;

@DefaultUrl("http://qa2.fasttrackit.org:8008/?page_id=7")
public class LoginPage extends PageObject {

    @FindBy(css= "#customer_login #username")
    private WebElementFacade emailLoginField;

    @FindBy(css= "#customer_login #password")
    private WebElementFacade passwordField;

    @FindBy(css= "div  p:nth-child(3) button[value= 'Login']")
    private WebElementFacade loginButton;

     public void setEmailLoginField(String email){
         typeInto(emailLoginField,email);

     }

    public void setPasswordField(String password) {
        typeInto(passwordField, password);
    }

    public void clickLoginButton() {
        clickOn(loginButton);
    }
}

