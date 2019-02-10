package com.fast.features;

import com.fast.steps.serenity.CheckoutSteps;
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
    CheckoutSteps checkoutSteps;
    @Test

    public void goToAddAProductInCartAndChecout(){
        checkoutSteps.goAddToCartAndThenCheckout();
        checkoutSteps.goAndcompletedBillingsOrders();
    }











}
