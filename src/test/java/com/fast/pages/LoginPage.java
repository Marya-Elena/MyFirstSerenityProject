package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import java.util.concurrent.TimeUnit;

@DefaultUrl("http://qa2.fasttrackit.org:8008/?page_id=7")
public class LoginPage extends PageObject {
     //div[class='welcome-user'] input[id*='username']//"username"//input#username.woocommerce-Input

    @FindBy(css= "#customer_login #username")
    private WebElementFacade emailLoginField;

    //input#password.woocommerce-Input
    @FindBy(css= "#customer_login #password")
    private WebElementFacade passwordField;

    @FindBy(css= "#customer_login > div.u-column1.col-1 > form > p:nth-child(3) > button")
    private WebElementFacade loginButton;


     public void setEmailLoginField(){
       waitFor(emailLoginField);
       typeInto(emailLoginField,"kyalcin.a@qzvbxqe5dx.tk");}


     public void setPasswordField(){
        typeInto(passwordField, "test2019test20"); }

    public void clickLoginButton(){
        clickOn(loginButton);
    }
}

