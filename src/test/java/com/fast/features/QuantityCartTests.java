package com.fast.features;


import com.fast.steps.serenity.CartSteps;
import com.fast.steps.serenity.HomeSteps;
import com.fast.steps.serenity.QuantityCartSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class QuantityCartTests {
    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    HomeSteps homeSteps;
    @Steps
    CartSteps cartSteps;
    @Steps
    QuantityCartSteps quantityCartSteps;

    @Test

    public void addOtherQuantityToCart(){
        homeSteps.navigateToHomepage();
        cartSteps.navigateToPageShop();
        cartSteps.goToTheImageProduct();
        cartSteps.goToAddToCartProduct();
        quantityCartSteps.clickOnTheButtonViewCart();
        quantityCartSteps.clickForChangeQty();
        quantityCartSteps.clickTheButtonUpdateCart();
    }



}
