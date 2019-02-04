package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://qa2.fasttrackit.org:8008/?product=beanie")
public class QuantityCartPage extends PageObject {

    @FindBy (css = "#primary > div.woocommerce-message > a")
    private WebElementFacade ButtonViewCart;
     //#post-5 > div > div > form > table > tbody > tr.woocommerce-cart-form__cart-item.cart_item > td.product-quantity

    @FindBy(css="#post-5 > div > div > form > table > tbody > tr.woocommerce-cart-form__cart-item.cart_item > td.product-quantity")
    private WebElementFacade fieldButtonQnty;

    //#quantity_5c57285643cf4
    //#quantity_5c5722887b6b7
    @FindBy(id="quantity_5c57285643cf4")
    private WebElementFacade buttonChangeQnty;

    //tr:nth-child(2) > td > button[name='update_cart']
    @FindBy(css="#post-5 > div > div > form > table > tbody > tr:nth-child(2) > td > button")
    private WebElementFacade buttonUpadateCart;

    public void clickToButtonViewCart (){
        clickOn(ButtonViewCart);
    }

    public void setProductQuantity (){
        clickOn(fieldButtonQnty);
        waitABit(10);
        typeInto(buttonChangeQnty,"3");

    }
      // din 2 metode am facut 1 sus
//    public void clickToTheFieldQnty(){
//        clickOn(fieldButtonQnty);
//    }
//    //metoda urmatoare nu ruleaza!ar putea fi cu click on
//    public void setButtonChangeQnty(){
//        waitABit(10);
//        typeInto(buttonChangeQnty,"3");
//    }

    public void clickToButtonUpdateCart(){
        waitABit(15);
        clickOn(buttonUpadateCart);
    }


}

