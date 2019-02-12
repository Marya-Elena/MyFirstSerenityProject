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
    public void navigateToHomepage()
    { homePage.open(); }

    @Step

    public void navigateToPageShop(){
        cartPage.goToHomeMenu();
        cartPage.clickToShopPage();
    }

//    @Step
//    public void goAndSelectAProduct(){
//        cartPage.selectProductFromList();
  //  }


//    @Step
//    public void findeProductFromList (){
//        Assert.assertTrue(cartPage.selectProductFromList());
//
//    }
//    @Step
//    public void goToAddToCartProduct() {
//        cartPage.clickOnButtonAddToCart();
//    }

    @Step
    public void addProductFindInCart (String text){
        Assert.assertTrue(cartPage.selectProductFromList(text));
    }

    @Step

    public void clickOnSymbolViewCart(){
        cartPage.clickOnViewCart();
    }
    @Step
    public void checkAddToCart() {
        Assert.assertTrue(productPage.checkAddToCart());
    }


}
