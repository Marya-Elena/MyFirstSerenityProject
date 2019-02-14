package com.fast.steps.serenity;

import com.fast.pages.CartPage;
import com.fast.pages.HomePage;
import com.fast.pages.ProductPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class CartSteps extends ScenarioSteps {
    CartPage cartPage;
    @Step
    public void navigateToPageShop() {
        cartPage.goToHomeMenu();
        cartPage.clickToShopPage();
    }

    @Step
    public void addProductFindInCart(String text) {
        Assert.assertTrue(cartPage.selectProductFromList(text));
    }

    @Step
    public void clickOnSymbolViewCart() {
        cartPage.clickOnViewCart();
    }

    @Step
    public void clickTheRemoveButton(){
        cartPage.clickOnRemoveButton();
    }
    @Step
    public void checkRemovedProduct(String messageChecked){
        Assert.assertTrue(cartPage.checkRemoveProduct(messageChecked));
    }
    @Step
    public void clickRetrurnShopButton(){
        cartPage.clickReturnToShopButton();
    }



}
