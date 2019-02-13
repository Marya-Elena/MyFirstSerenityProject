package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
@DefaultUrl("http://qa2.fasttrackit.org:8008/?page_id=7")

public class OrderPage extends PageObject {

    @FindBy(css="li[class*='MyAccount-navigation-link--orders'] a")
    private WebElementFacade ordersButton;

    @FindBy(css="td[data-title='Actions'] a[class*='woocommerce-button button view']")
    private WebElementFacade viewOrders;
    @FindBy(css="div.woocommerce li[class*='MyAccount-navigation-link--customer-logout'] a")
    private WebElementFacade logoutButton;

    public void clickOrdersButton(){
        clickOn(ordersButton);
    }

    public void clickOnviewOrders(){
        clickOn(viewOrders);
    }

    public void clickOnLogoutButton(){
        clickOn(logoutButton);

    }


}
