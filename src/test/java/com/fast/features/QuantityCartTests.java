package com.fast.features;


import com.fast.pages.SearchPage;
import com.fast.steps.serenity.CartSteps;
import com.fast.steps.serenity.HomeSteps;
import com.fast.steps.serenity.QuantityCartSteps;
import com.fast.steps.serenity.SearchSteps;
import net.serenitybdd.core.Serenity;
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
    SearchSteps searchSteps;
    @Steps
    QuantityCartSteps quantityCartSteps;

    @Test

    public void addOtherQuantityToCart(){
        homeSteps.navigateToHomepage();
        cartSteps.navigateToPageShop();
        searchSteps.navigateToSerachButton();
        searchSteps.searchAftarAWord();
        quantityCartSteps.typeAWord();
        quantityCartSteps.clickOnSearchButton();
        quantityCartSteps.clickOnBeanieProductTitle();
        quantityCartSteps.clickOnButtonAddToCart();
        quantityCartSteps.checkedProductIsAddTocart();
        quantityCartSteps.clickOnTheButtonViewCart();
        quantityCartSteps.clickForChangeQty();
        quantityCartSteps.clickTheButtonUpdateCart();
    }



}
