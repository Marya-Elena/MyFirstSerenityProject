package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa2.fasttrackit.org:8008/?product=beanie")
public class ProductPage extends PageObject {



    @FindBy (css = "div.woocommerce-message")
    private WebElementFacade addToCartMessage;

    public boolean checkAddToCart(String messageAddToCart){
        waitFor(addToCartMessage);
       return addToCartMessage.containsText(messageAddToCart);
   }


}
