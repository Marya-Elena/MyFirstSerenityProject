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

    public void clickOnViewCartButton() {
        clickOn(clickViewCart);
    }

    public void clickOnButtonProceedCheckout()
    {
        clickOn(clickButtonProceedToCheckout);
    }

    public void setBillingFistName(String firstName){
        typeInto(setBillingFirstName,firstName);
    }

    public void setBillingLastName(String lastName) {
        typeInto(setBillingLastName,lastName);
    }

    public void setBillingCompany( String nameCompany){
        typeInto(setBillingCompany,nameCompany);
    }


     public void setBillingCountryField(String nameCountry){
        setCountryField.selectByVisibleText(nameCountry);
    }

     public  void setBillingAdress(String tapeAdress){
        typeInto(setBillingAdress,tapeAdress);
     }

     public void setBillingAdressTwo(String tapeAdressOptional){
        typeInto(setBillingAdressTwo,tapeAdressOptional);
     }

    public void setBillingCity(String cityName) {
        typeInto(setBillingCity,cityName);
    }

    public void setBillingCountyField(String countyName) {
        setBillingCounty.selectByVisibleText(countyName);
    }

     public void setBillingPostcode(String postCode){
        typeInto(setBillingPostcode,postCode);
     }

    public void setBillingPhone(String phone){
        typeInto(setBillingPhone,phone);
    }

    public void setBillingEmail(String emailAdress){
        typeInto(SetBillingEmail,emailAdress);
    }

    public void clickButtonPlaceOrder(){
        withTimeoutOf(17, TimeUnit.SECONDS).waitFor(clickButtonPlaceOrder);
        clickOn(clickButtonPlaceOrder);
    }

}
