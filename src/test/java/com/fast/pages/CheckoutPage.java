package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import java.util.concurrent.TimeUnit;

@DefaultUrl("http://qa2.fasttrackit.org:8008/?page_id=6")

public class CheckoutPage extends PageObject {

    @FindBy( css="button[name='add-to-cart']")
    private WebElementFacade clickaddToCartButton;

    @FindBy(css="div.woocommerce-message>a")
    private WebElementFacade clickViewCart;

    @FindBy(css="div.wc-proceed-to-checkout>a")
     private WebElementFacade clickButtonProceedToCheckout;

    @FindBy(id="billing_first_name")
    private WebElementFacade setBillingFirstName;

    @FindBy(id="billing_last_name")
    private WebElementFacade setBillingLastName;

   @FindBy(id="billing_company")
    private WebElementFacade setBillingCompany;

   @FindBy(id="billing_country")
    private WebElementFacade setCountryField;

    @FindBy(id="billing_address_1")
    private WebElementFacade setBillingAdress;

    @FindBy(id="billing_address_2")
    private WebElementFacade setBillingAdressTwo;

    @FindBy(id="billing_city")
    private WebElementFacade setBillingCity;

    @FindBy(id="billing_state")
    private WebElementFacade setBillingCounty;

    @FindBy(id="billing_postcode")
    private WebElementFacade setBillingPostcode;

    @FindBy(id="billing_phone")
    private WebElementFacade setBillingPhone;

    @FindBy(id="billing_email")
    private WebElementFacade SetBillingEmail;
    @FindBy(id="payment")
    private WebElementFacade clickButtonPlaceOrder;

    public void clickOnaddToCartButton(){
        clickOn(clickaddToCartButton);
    }

    public void clickOnViewCartButton()
    {
        clickOn(clickViewCart);
    }

    public void clickOnButtonProceedCheckout()
    {
        clickOn(clickButtonProceedToCheckout);
    }

    public void setBillingFistName(){
        typeInto(setBillingFirstName,"Chis");
    }

    public void setBillingLastName() {
        typeInto(setBillingLastName, "Maria-Elena");
    }

    public void setBillingCompany(){
        typeInto(setBillingCompany,"Nu e cazul");
    }


     public void setBillingCountryField(){
        setCountryField.selectByVisibleText("Romania");
    }

     public  void setBillingAdress(){
        typeInto(setBillingAdress,"N.Teclu, nr.1");
     }

     public void setBillingAdressTwo(){
        typeInto(setBillingAdressTwo,"N.Teclu, nr.1");
     }

     public void setBillingCity(){
        typeInto(setBillingCity, "Cluj-Napoca");
     }

     public void setBillingCountyField(){
        setBillingCounty.selectByVisibleText("Cluj");
     }

     public void setBillingPostcode(){
        typeInto(setBillingPostcode,"400252");
     }

    public void setBillingPhone(){
        typeInto(setBillingPhone,"0735112111");
    }

    public void setBillingEmail(){
        typeInto(SetBillingEmail,"kyalcin.a@qzvbxqe5dx.tk");
    }

    public void clickButtonPlaceOrder(){
        withTimeoutOf(17, TimeUnit.SECONDS).waitFor(clickButtonPlaceOrder);
        clickOn(clickButtonPlaceOrder);
    }

}
