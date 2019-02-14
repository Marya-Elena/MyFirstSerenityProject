package com.fast.features;

import com.fast.Utils.Constants;
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
    private HomeSteps homeSteps;
    @Steps
    private LoginSteps loginSteps;

    @Steps
    private CheckoutSteps checkoutSteps;
    @Test

    public void addAProductInCartAndCheckout(){
        homeSteps.goToHomePage();
        loginSteps.loginWithValidCredentials(Constants.USER_EMAIL,Constants.USER_PASSWORD);
        loginSteps.checkLoggedIn("kyalcin.a");
        checkoutSteps.searchAProduct();
        checkoutSteps.addToCartProduct();
        checkoutSteps.completeBillingOrders();

    }











}
