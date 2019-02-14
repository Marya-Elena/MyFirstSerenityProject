package com.fast.features;

import com.fast.Utils.Constants;
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
    public void checkOrderList(){
        homeSteps.goToHomePage();
        loginSteps.loginWithValidCredentials(Constants.USER_EMAIL,Constants.USER_PASSWORD);
        loginSteps.checkLoggedIn("kyalcin.a");
        orderSteps.clickOnOrdersButton();
        orderSteps.clickOnTheViewOrders();
        orderSteps.clickOnTheLogoutButton();


    }
}
