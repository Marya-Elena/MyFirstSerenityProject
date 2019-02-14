package com.fast.steps.serenity;

import com.fast.pages.HomePage;
import com.fast.pages.LoginPage;
import com.fast.pages.MyAccountPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

public class MyAccountSteps extends ScenarioSteps {

    MyAccountPage myAccountPage;
    @Step
    public void clickOnTheButtonAccountDetails() {
        myAccountPage.clickOnButtonAccountDetails();
    }
    @Step
    public void goToSetFirstNameDataAccount(String firstAccountName) {
        myAccountPage.setFirstNameDataAccount(firstAccountName);
    }
   @Step
    public void goToSetLastNameDataAccount(String lastNameAccount){
        myAccountPage.setLastNameDataAccount(lastNameAccount);
   }

    @Step
    public void goToSetEmailAdressDataAccount(String emailAccount) {
        myAccountPage.setEmailAddress(emailAccount);
    }
   @Step
    public void clickOnButtonSaveChangesDataAccount(){
        myAccountPage.clickOnButtonSaveChanges();
   }
}

