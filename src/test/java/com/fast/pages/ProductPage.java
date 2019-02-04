package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa2.fasttrackit.org:8008/?product=beanie")
public class ProductPage extends PageObject {
    //.woocommerce-message[role='alert] -varianta scurta
    @FindBy (css = "#primary > div.woocommerce-message")
    private WebElementFacade addToCartMessage;

    public boolean checkAddToCart(){
        waitFor(addToCartMessage);
       return addToCartMessage.containsText("Beanie” has been added to your cart");
    }


}
