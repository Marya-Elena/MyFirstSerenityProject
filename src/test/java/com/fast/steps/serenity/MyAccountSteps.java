package com.fast.steps.serenity;

import com.fast.pages.HomePage;
import com.fast.pages.LoginPage;
import com.fast.pages.MyAccountPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

public class MyAccountSteps extends ScenarioSteps {
    HomePage homePage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;

    @StepGroup
     public void goToLoginPage(){
        homePage.open();
        homePage.clickMenuButton();
        homePage.clickMyAccountButton();
        loginPage.setEmailLoginField();
        loginPage.setPasswordField();
        loginPage.clickLoginButton();
        myAccountPage.checkLoggedIn();

    }

     @Step
   public void clickOnTheButtonAccountDetails(){
        myAccountPage.clickOnButtonAccountDetails();
    }
   @Step
   public void goToSetFirstNameDataAccount(){
        myAccountPage.setFirstNameDataAccount();
   }

   @Step
    public void goToSetLastNameDataAccount(){
        myAccountPage.setLastNameDataAccount();
   }

   @Step
    public void goToSetEmailAdressDataAccount(){
        myAccountPage.setEmailAddress();
   }

   @Step

    public void clickOnButtonSaveChangesDataAccount(){
        myAccountPage.clickOnButtonSaveChanges();
   }
}

