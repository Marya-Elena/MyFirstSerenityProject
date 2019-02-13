package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

@DefaultUrl("http://qa2.fasttrackit.org:8008/?product=beanie")
public class QuantityCartPage extends PageObject {

    @FindBy(css="input.search-field")
    private WebElement searchWord;

    @FindBy(css = "div > form > button>i[class= 'fa fa-search']")
    private WebElementFacade PushSearchButton;

    @FindBy(css="#post-19 a[rel='bookmark']")
    private WebElementFacade beanieTitle;

    @FindBy(css= "button[name='add-to-cart']")
    private WebElementFacade buttonAddToCart;

    @FindBy(css="div.woocommerce-message")
    private WebElementFacade addToCartMessages;

    @FindBy (css = "#primary > div.woocommerce-message > a")
    private WebElementFacade clickButtonViewCart;

    @FindBy(css="div.quantity input[step='1']")
    private WebElementFacade fieldButtonQty;

    @FindBy(css="input[id*='quantity']")
    private WebElementFacade buttonChangeQty;

    @FindBy(css="tr:nth-child(2) > td > button[name='update_cart']")
    private WebElementFacade buttonUpadateCart;

    public void setWordSearchField() {
        withTimeoutOf(10,TimeUnit.SECONDS).waitFor(searchWord);
        typeInto(searchWord, "beanie");

    }
    public void clickOnTheSearchButton(){
        clickOn( PushSearchButton);
    }

    public void clickOnBeanieTitle(){
        clickOn(beanieTitle);
    }

    public void clickOnButtonAddToCart() {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(buttonAddToCart);
        clickOn(buttonAddToCart);
    }

    public boolean checkProductIsAddToCart() {
        waitFor(addToCartMessages);
        return addToCartMessages.containsText("Beanie");
    }


    public void clickToButtonViewCart (){
        clickOn(clickButtonViewCart);
    }

    public void setProductQuantity (){
        clickOn(fieldButtonQty);
        withTimeoutOf(10,TimeUnit.SECONDS).waitFor(buttonChangeQty);
        typeInto(buttonChangeQty,"3");

    }

    public void clickToButtonUpdateCart(){
        withTimeoutOf(15,TimeUnit.SECONDS).waitFor(buttonUpadateCart);
        clickOn(buttonUpadateCart);
    }

}

