package com.fast.steps.serenity;

import com.fast.pages.ShopPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class ShopSteps extends ScenarioSteps {

    ShopPage shopPage;

    @Step
    public void chooseToFilterBy(){
        shopPage.clickButtonFilterSetBy();
    }

    @Step
    public void sortByPrice() {
        shopPage.clickButtonFilterByPrice();
    }

    @Step
    public void clickOnViewProduct() {
        shopPage.clickButtonViewProduct();
    }

    @Step
    public void clickOnViewCart() {
        shopPage.clickViewCart();
    }

    @Step
    public void checkedTotal(){
        shopPage.checkQuantityTotal();
    }
    @Step
    public void typeCouponCode( String errorCouponMesage){
        shopPage.typeTheCouponCode(errorCouponMesage);
    }
    @Step
    public void clickApplyCouponButton(){
        shopPage.clickOnApllyCoupon();
    }
    @Step
    public void checkedCouponMessageError(String checkedErrorCoupon){
        Assert.assertTrue(shopPage.checkedErrorMessageCoupon(checkedErrorCoupon));
    }
    @Step
    public void clickOnTheButtonProceedToCheeckout(){
        shopPage.clickButtonProceedToCheckout();
    }

}
