package com.fast.features;


import com.fast.Utils.Constants;
import com.fast.pages.HomePage;
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
    private HomeSteps homeSteps;
    @Steps
    private LoginSteps loginSteps;

    @Steps
    private MyAccountSteps myAccountSteps;

    @Test

    public void setValidDataAccount(){

        homeSteps.goToHomePage();
        loginSteps.loginWithValidCredentials(Constants.USER_EMAIL,Constants.USER_PASSWORD);
        loginSteps.checkLoggedIn("kyalcin.a");
        myAccountSteps.clickOnTheButtonAccountDetails();
        myAccountSteps.goToSetFirstNameDataAccount("Chis");
        myAccountSteps.goToSetLastNameDataAccount("Maria-Elena");
        myAccountSteps.goToSetEmailAdressDataAccount(Constants.USER_EMAIL);
        myAccountSteps.clickOnButtonSaveChangesDataAccount();

    }

}
