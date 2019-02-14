package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.List;
import java.util.concurrent.TimeUnit;

@DefaultUrl("http://qa2.fasttrackit.org:8008/?post_type=product")
public class CartPage extends PageObject {

    @FindBy(css = "li[id='menu-item-63']")
    private WebElementFacade menuButton;

    @FindBy(css = "li[id='menu-item-66']")
    private WebElementFacade shopPage;

    @FindBy(css = ".product")
    List<WebElementFacade> listOfProducts;

    @FindBy(css = "a[title='View cart']")
    private WebElementFacade viewCartButton;

    @FindBy(css="td.product-remove a[data-product_sku='woo-beanie']")
    private WebElementFacade removeButton;

    @FindBy (css = "div.content-area div[role='alert']")
    private WebElementFacade removeProductMessage;

    @FindBy(css="p.return-to-shop a.button ")
    private WebElementFacade returnToShopButton;


    public void goToHomeMenu() {
        clickOn(menuButton);
    }

    public void clickToShopPage() {
        clickOn(shopPage);
    }

    public boolean selectProductFromList(String text) {
        for (WebElementFacade product : listOfProducts){
            if (product.getText().contains(text)) {
                product.findElement(By.cssSelector("div.cart a.button ")).click();
                return true;
            }
        }
        return false;

    }

    public void clickOnViewCart() {
        clickOn(viewCartButton);
    }

    public void clickOnRemoveButton(){
        withTimeoutOf(12,TimeUnit.SECONDS).waitFor(removeButton);
        clickOn(removeButton);
    }

    public boolean checkRemoveProduct(String messagesRemove){
        withTimeoutOf(15,TimeUnit.SECONDS).waitFor(removeProductMessage);
        return removeProductMessage.containsText(messagesRemove);
    }

    public void clickReturnToShopButton(){
        clickOn(returnToShopButton);

    }

  }



