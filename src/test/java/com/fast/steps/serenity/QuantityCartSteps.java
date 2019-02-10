package com.fast.steps.serenity;

import com.fast.pages.CartPage;
import com.fast.pages.HomePage;
import com.fast.pages.QuantityCartPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.reports.adaptors.specflow.ScenarioStep;
import net.thucydides.core.steps.ScenarioSteps;

public class QuantityCartSteps extends ScenarioSteps {
    HomePage homePage;
    CartPage cartPage;
    QuantityCartPage quantityCartPage;

    @Step
    public void navigateToHomepage(){ homePage.open(); }

    @Step

    public void navigateToPageShop(){
        cartPage.goToHomeMenu();
        cartPage.clickToShopPage();
    }
    @Step
    public void clickToTheImageProduct(){
        cartPage.clickOnTheImageProduct();
    }
    @Step
    public void clickOnAddToCartButton(){
        cartPage.clickOnButtonAddToCart();
    }

    @Step
    public void clickOnTheButtonViewCart (){
        quantityCartPage.clickToButtonViewCart();
    }

    @Step
    public void clickForChangeQty(){
        quantityCartPage.setProductQuantity();
    }

    @Step

    public void clickTheButtonUpdateCart(){
        quantityCartPage.clickToButtonUpdateCart();
    }


}
