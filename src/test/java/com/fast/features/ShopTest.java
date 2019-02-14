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
    private HomeSteps homeSteps;
    @Steps
    private CartSteps cartSteps;
    @Steps
    private ShopSteps shopSteps;
    @Test
    public void filterSortBy (){
        homeSteps.navigateToHomepage();
        cartSteps.navigateToPageShop();
        shopSteps.chooseToFilterBy();
        shopSteps.sortByPrice();
        shopSteps.clickOnViewProduct();
        shopSteps.clickOnViewCart();
        shopSteps.checkedTotal();
        shopSteps.typeCouponCode("Free shop,123");
        shopSteps.clickApplyCouponButton();
        shopSteps.checkedCouponMessageError("Coupon \"free shop,123\" does not exist!");
        shopSteps.clickOnTheButtonProceedToCheeckout();

    }


}
