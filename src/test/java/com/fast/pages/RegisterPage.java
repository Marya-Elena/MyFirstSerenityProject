package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import java.util.concurrent.TimeUnit;

@DefaultUrl ("http://qa2.fasttrackit.org:8008/?page_id=7")

public class RegisterPage extends PageObject {
//private String searchTermLength = RandomStringUtils.randomAlphabetic(25);
    @FindBy (id="reg_email")
    private WebElementFacade emailRegisterField;

    @FindBy(id="reg_password")
    private WebElementFacade paswwordRegisterField;

    @FindBy (css="button.button[name='register']")
    private WebElementFacade registerButton;

    public void setEmailRegisterField (String registerEmail){
       withTimeoutOf(10, TimeUnit.SECONDS).waitFor(emailRegisterField);
        typeInto(emailRegisterField,registerEmail);
    }

    public void setPaswwordRegisterField(String registerPassword){
       typeInto( paswwordRegisterField, registerPassword);

    }
    public void clickRegisterButton(){
        clickOn(registerButton);
    }

}
