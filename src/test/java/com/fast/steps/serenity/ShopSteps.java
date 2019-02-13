package com.fast.steps.serenity;

import com.fast.pages.ShopPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

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
        shopPage.checkquantityTotal();
    }
}
