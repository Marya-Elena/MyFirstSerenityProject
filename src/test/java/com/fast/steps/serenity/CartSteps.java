package com.fast.steps.serenity;

import com.fast.pages.CartPage;
import com.fast.pages.HomePage;
import com.fast.pages.ProductPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class CartSteps extends ScenarioSteps {

    HomePage homePage;
    CartPage cartPage;
    ProductPage productPage;

    @Step
    public void navigateToHomepage(){ homePage.open(); }

    @Step

    public void navigateToPageShop(){
        cartPage.goToHomeMenu();
        cartPage.goToShopSection();
    }

    @Step
    public void goToTheImageProduct(){
        cartPage.clickImageProduct();
    }
    @Step
    public void goToAddToCartProduct(){
        cartPage.clickProductToCart();
    }
    @Step
    public void checkAddToCart(){
        Assert.assertTrue(productPage.checkAddToCart());
    }

    @StepGroup

    public void goToShopMeniuProducts(){
        navigateToHomepage();
        navigateToPageShop();
        goToTheImageProduct();
        goToAddToCartProduct();
        checkAddToCart();

    }



}