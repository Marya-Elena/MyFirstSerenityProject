package com.fast.features;

import com.fast.steps.serenity.CheckoutSteps;
import com.fast.steps.serenity.HomeSteps;
import com.fast.steps.serenity.LoginSteps;
import com.fast.steps.serenity.ReviewCapSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CheckoutTests {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    HomeSteps homeSteps;
    @Steps
    LoginSteps loginSteps;

    @Steps
    CheckoutSteps checkoutSteps;
    @Test

    public void addAProductInCartAndChecout(){
        homeSteps.goToHomePage();
        loginSteps.setEmailLogin();
        loginSteps.setPassword();
        loginSteps.clickOnLoginButton();
        loginSteps.checkLoggedIn();
        checkoutSteps.searchAProduct();
        checkoutSteps.addToCartProduct();
        checkoutSteps.completeBillingOrders();

    }











}
