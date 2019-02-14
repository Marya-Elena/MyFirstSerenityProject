package com.fast.steps.serenity;

import com.fast.pages.HomePage;
import com.fast.pages.LoginPage;
import com.fast.pages.MyAccountPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class LoginSteps extends ScenarioSteps {

    HomePage homePage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;


    @Step
    public void navigateToHomepage()
    { homePage.open();
    }
    @Step
    public void goToLogin(){
        homePage.clickMenuButton();
        homePage.clickMyAccountButton();
    }

    @Step
    public void loginWithValidCredentials(String email, String password ){
      loginPage.setEmailLoginField(email);
      loginPage.setPasswordField(password);
      loginPage.clickLoginButton();
    }

    @Step
    public void checkLoggedIn(String welcomeMessage) {
        Assert.assertTrue(myAccountPage.checkLoggedIn(welcomeMessage));
    }

    @Step
    public void checkedLoggedInvalidCredentials(String messageErrorText){
        Assert.assertTrue(myAccountPage.checkLoggedInvalid(messageErrorText));

    }
    @Step

    public void loginWithInvalidCredentials(String email,String password){
        loginPage.setEmailLoginField(email);
        loginPage.setPasswordField(password);
        loginPage.clickLoginButton();
    }
}
