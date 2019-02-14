package com.fast.steps.serenity;

import com.fast.pages.OrderPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class OrderSteps extends ScenarioSteps {
   OrderPage orderPage;

   @Step
   public void clickOnOrdersButton() {
       orderPage.clickOrdersButton();
   }

    @Step
    public void clickOnTheViewOrders() {
        orderPage.clickOnviewOrders();
    }

    @Step
    public void clickOnTheLogoutButton() {
        orderPage.clickOnLogoutButton();
    }
}
