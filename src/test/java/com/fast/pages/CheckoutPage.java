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
   //button[id*='place_order']//#payment
    @FindBy(id="payment")
    private WebElementFacade clickButtonPlaceOrder;

//    // p[class='woocommerce-notice woocommerce-notice--success woocommerce-thankyou-order-received']
//    @FindBy(css="#post-6 > div > div > div > p.woocommerce-notice.woocommerce-notice--success.woocommerce-thankyou-order-received")
//    private WebElementFacade checkTheOrderIsPlaced;


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

    public void goToSetBillingFistName(){
        typeInto(setBillingFirstName,"Chis");
    }

    public void goToSetBillingLastName() {
        typeInto(setBillingLastName, "Maria-Elena");
    }

    public void goToSetBillingCompany(){
        typeInto(setBillingCompany,"Nu e cazul");
    }


     public void goTosetBillingCountryField(){
        setCountryField.selectByVisibleText("Romania");
    }


     public  void goTosetBillingAdress(){
        typeInto(setBillingAdress,"N.Teclu, nr.1");
     }

     public void goToSetBillingAdressTwo(){
        typeInto(setBillingAdressTwo,"N.Teclu, nr.1");
     }

     public void goTosetBillingCity(){
        typeInto(setBillingCity, "Cluj-Napoca");
     }

     public void goTosetBillingCountyField(){
        setBillingCounty.selectByVisibleText("Cluj");
     }

     public void goTosetBillingPostcode(){
        typeInto(setBillingPostcode,"400252");
     }

    public void goTosetBillingPhone(){
        typeInto(setBillingPhone,"0735112111");
    }

    public void goToSetBillingEmail(){
        typeInto(SetBillingEmail,"kyalcin.a@qzvbxqe5dx.tk");
    }

    public void clickButtonPlaceOrder(){
        withTimeoutOf(17, TimeUnit.SECONDS).waitFor(clickButtonPlaceOrder);
        clickOn(clickButtonPlaceOrder);
    }

}
