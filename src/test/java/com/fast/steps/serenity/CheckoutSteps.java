package com.fast.steps.serenity;

import com.fast.pages.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

public class CheckoutSteps extends ScenarioSteps {

    SearchPage searchPage;
    ReviewPageCap reviewPageCap;
    CheckoutPage checkoutPage;

    @Step
    public void searchAProduct() {
        searchPage.clickToSearchButton();
        searchPage.clicksearchProduct();
        searchPage.setWordSearchField();
        searchPage.clickOnTheSearchButton();
        reviewPageCap.clickOnProductTitle();

    }

    @Step
    public void addToCartProduct() {
        checkoutPage.clickOnaddToCartButton();
        checkoutPage.clickOnViewCartButton();
    }

    @Step
    public void completeBillingOrders() {
        checkoutPage.clickOnButtonProceedCheckout();
        checkoutPage.setBillingFistName();
        checkoutPage.setBillingLastName();
        checkoutPage.setBillingCompany();
        checkoutPage.setBillingCountryField();
        checkoutPage.setBillingAdress();
        checkoutPage.setBillingAdressTwo();
        checkoutPage.setBillingCity();
        checkoutPage.setBillingCountyField();
        checkoutPage.setBillingPostcode();
        checkoutPage.setBillingPostcode();
        checkoutPage.setBillingEmail();
        checkoutPage.clickButtonPlaceOrder();
    }
}
