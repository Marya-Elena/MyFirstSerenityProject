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
    public void goToTheButtonViewCart (){
        quantityCartPage.clickToButtonViewCart();
    }



    @Step
    public void goToSetProductQanty(){
        quantityCartPage.setProductQuantity();
    }

    @Step

    public void goToTheButtonUpdateCart(){
        quantityCartPage.clickToButtonUpdateCart();
    }

    @StepGroup

    public void goToModificatedQnty(){
        navigateToHomepage();
        navigateToPageShop();
        goToTheImageProduct();
        goToAddToCartProduct();
        goToTheButtonViewCart();
        goToSetProductQanty();
        goToTheButtonUpdateCart();
    }


}
