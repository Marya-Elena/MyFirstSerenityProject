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
        searchPage.setWordSearchField("cap");
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
        checkoutPage.setBillingFistName("Chis");
        checkoutPage.setBillingLastName("Maria-Elena");
        checkoutPage.setBillingCompany("Nu e cazul");
        checkoutPage.setBillingCountryField("Romania");
        checkoutPage.setBillingAdress("N.Teclu, nr.1");
        checkoutPage.setBillingAdressTwo("N.Teclu, nr.1");
        checkoutPage.setBillingCity("Cluj-Napoca");
        checkoutPage.setBillingCountyField("Cluj");
        checkoutPage.setBillingPostcode("400252");
        checkoutPage.setBillingPhone("0735112111");
        checkoutPage.setBillingEmail("kyalcin.a@qzvbxqe5dx.tk");
        checkoutPage.clickButtonPlaceOrder();
    }
}
