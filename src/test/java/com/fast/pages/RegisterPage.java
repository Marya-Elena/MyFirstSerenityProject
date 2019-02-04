package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
@DefaultUrl ("http://qa2.fasttrackit.org:8008/?page_id=7")

public class RegisterPage extends PageObject {
//#customer_login > div.u-column2.col-2 > h2// link titlu register//var.refacut:
// #customer_login > div.u-column2.col-2 > form > p:nth-child(1) > label// label[for='reg_email']
//   @FindBy (css = " #customer_login > div.u-column2.col-2 > h2")
//    private WebElementFacade titleRegisterEmail;

    @FindBy (id="reg_email")
    private WebElementFacade emailRegisterField;

    @FindBy(id="reg_password")
    private WebElementFacade paswwordRegisterField;

    //button.button[name='register']//#customer_login > div.u-column2.col-2 > form > p.woocommerce-FormRow.form-row > button

    @FindBy (css="button.button[name='register']")
    private WebElementFacade registerButton;

//    public void clickRegisterEmailField (){
//       clickOn(titleRegisterEmail);
//     }
    public void setEmailRegisterField (){
        waitABit(10);
        typeInto(emailRegisterField,"kyalcin.a@qzvbxqe5dx.tk");
    }

    public void setPaswwordRegisterField(){
       typeInto( paswwordRegisterField, "test2019test20");

    }
    public void clickRegisterButton(){
        clickOn(registerButton);
    }

}
