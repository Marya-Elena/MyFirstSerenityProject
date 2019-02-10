package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://qa2.fasttrackit.org:8008/?product=beanie")
public class QuantityCartPage extends PageObject {

    @FindBy (css = "#primary > div.woocommerce-message > a")
    private WebElementFacade clickButtonViewCart;

    @FindBy(css="div.quantity input[step='1']")
    private WebElementFacade fieldButtonQty;

    @FindBy(css="input[id*='quantity']")
    private WebElementFacade buttonChangeQty;

    @FindBy(css="tr:nth-child(2) > td > button[name='update_cart']")
    private WebElementFacade buttonUpadateCart;

    public void clickToButtonViewCart (){
        clickOn(clickButtonViewCart);
    }

    public void setProductQuantity (){
        clickOn(fieldButtonQty);
        waitABit(10);
        typeInto(buttonChangeQty,"3");

    }

    public void clickToButtonUpdateCart(){
        waitABit(15);
        clickOn(buttonUpadateCart);
    }


}

