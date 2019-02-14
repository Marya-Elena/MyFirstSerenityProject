package com.fast.steps.serenity;

import com.fast.pages.CartPage;
import com.fast.pages.HomePage;
import com.fast.pages.QuantityCartPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.reports.adaptors.specflow.ScenarioStep;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class QuantityCartSteps extends ScenarioSteps {
    HomePage homePage;
    CartPage cartPage;
    QuantityCartPage quantityCartPage;

    @Step
    public void typeAWord(String typeProductName) {
        quantityCartPage.setWordSearchField(typeProductName);
    }
    @Step
    public void clickOnSearchButton(){
        quantityCartPage.clickOnTheSearchButton();
    }

    @Step
    public void clickOnBeanieProductTitle() {
        quantityCartPage.clickOnBeanieTitle();
    }

    @Step
    public void clickOnButtonAddToCart() {
        quantityCartPage.clickOnButtonAddToCart();
    }

    @Step
    public void checkedProductIsAddToCart(String messageName){
        Assert.assertTrue(quantityCartPage.checkProductIsAddToCart(messageName));
    }

    @Step
    public void clickOnTheButtonViewCart() {
        quantityCartPage.clickToButtonViewCart();
    }

    @Step
    public void clickForChangeQty() {
        quantityCartPage.setProductQuantity();
    }

    @Step
    public void clickTheButtonUpdateCart() {
        quantityCartPage.clickToButtonUpdateCart();
    }

    @Step
    public void chekedTotalPriceValue(){
        quantityCartPage.checkedTotalPrice();
    }

}
