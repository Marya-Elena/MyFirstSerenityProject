package com.fast.features;

import com.fast.pages.ShopPage;
import com.fast.steps.serenity.CartSteps;
import com.fast.steps.serenity.HomeSteps;
import com.fast.steps.serenity.ShopSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class ShopTest {
    @Managed(uniqueSession = true)
    private WebDriver driver;
    @Steps
    HomeSteps homeSteps;
    @Steps
    CartSteps cartSteps;
    @Steps
    ShopSteps shopSteps;
    @Test
    public void filterSortBy (){
        homeSteps.navigateToHomepage();
        cartSteps.navigateToPageShop();
        shopSteps.chooseToFilterBy();
        shopSteps.sortByPrice();
        shopSteps.clickOnViewProduct();
        shopSteps.clickOnViewCart();
        shopSteps.checkedTotal();

    }


}
