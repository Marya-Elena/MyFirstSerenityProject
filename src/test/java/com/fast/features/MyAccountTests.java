package com.fast.features;


import com.fast.steps.serenity.HomeSteps;
import com.fast.steps.serenity.LoginSteps;
import com.fast.steps.serenity.MyAccountSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class MyAccountTests {
    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    MyAccountSteps myAccountSteps;

    @Test

    public void setValidDataAccount(){
        myAccountSteps.goToLoginPage();
        myAccountSteps.clickOnTheButtonAccountDetails();
        myAccountSteps.goToSetFirstNameDataAccount();
        myAccountSteps.goToSetLastNameDataAccount();
        myAccountSteps.goToSetEmailAdressDataAccount();
        myAccountSteps.clickOnButtonSaveChangesDataAccount();

    }

}
