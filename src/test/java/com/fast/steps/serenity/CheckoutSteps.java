package com.fast.steps.serenity;

import com.fast.pages.*;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

public class CheckoutSteps extends ScenarioSteps {
    HomePage homePage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;
    SearchPage searchPage;
    ReviewPageCap reviewPageCap;
    CheckoutPage checkoutPage;

    @StepGroup
    public void goAddToCartAndThenCheckout(){
        homePage.open();
        homePage.clickMenuButton();
        homePage.clickMyAccountButton();
        loginPage.setEmailLoginField();
        loginPage.setPasswordField();
        loginPage.clickLoginButton();
        myAccountPage.checkLoggedIn();
        searchPage.goToSearchButton();
        searchPage.goToSearchProduct();
        searchPage.setWordSearchField();
        searchPage.clickOnTheSearchButton();
        reviewPageCap.goToClickOnProductTitle();

    }

    public void goAndcompletedBillingsOrders(){
        checkoutPage.clickOnaddToCartButton();
        checkoutPage.clickOnViewCartButton();
        checkoutPage.clickOnButtonProceedCheckout();
        checkoutPage.goToSetBillingFistName();
        checkoutPage.goToSetBillingLastName();
        checkoutPage.goToSetBillingCompany();
        checkoutPage.goTosetBillingCountryField();
        checkoutPage.goTosetBillingAdress();
        checkoutPage.goToSetBillingAdressTwo();
        checkoutPage.goTosetBillingCity();
        checkoutPage.goTosetBillingCountyField();
        checkoutPage.goTosetBillingPostcode();
        checkoutPage.goTosetBillingPhone();
        checkoutPage.goToSetBillingEmail();
        checkoutPage.clickButtonPlaceOrder();
    }
}
