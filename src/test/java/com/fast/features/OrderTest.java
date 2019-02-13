package com.fast.features;

import com.fast.steps.serenity.HomeSteps;
import com.fast.steps.serenity.LoginSteps;
import com.fast.steps.serenity.OrderSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class OrderTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;
    @Steps
    HomeSteps homeSteps;
    @Steps
    LoginSteps loginSteps;
    @Steps
    OrderSteps orderSteps;

    @Test
    public void chekOrderList(){
        homeSteps.goToHomePage();
        loginSteps.setEmailLogin();
        loginSteps.setPassword();
        loginSteps.clickOnLoginButton();
        loginSteps.checkLoggedIn();
        orderSteps.clickOnOrdersButton();
        orderSteps.clickOnTheViewOrders();
        orderSteps.clickOnTheLogoutButton();


    }
}
