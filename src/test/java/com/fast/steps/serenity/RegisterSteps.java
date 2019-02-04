package com.fast.steps.serenity;

import com.fast.pages.HomePage;
import com.fast.pages.LoginPage;
import com.fast.pages.RegisterPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

public class RegisterSteps extends ScenarioSteps {

    HomePage homePage;
    RegisterPage registerPage;


    @Step
    public void navigateToHomepage()
    {
        homePage.open();
    }
    @Step
    public void goToLogin(){
        homePage.clickMenuButton();
        homePage.clickMyAccountButton();
    }
//    @Step
//    public void goToRegisterEmailField(){
//        registerPage.clickRegisterEmailField();
//    }

    @Step
    public void setEmailRegister(){
        registerPage.setEmailRegisterField();
    }

    @Step
    public void setPassworRegister (){
        registerPage.setPaswwordRegisterField();
    }

    @Step
     public void goToRegisterButton(){
        registerPage.clickRegisterButton();
    }

     @StepGroup

    public void completedRegister(){
        navigateToHomepage();
        goToLogin();
        //goToRegisterEmailField();
        setEmailRegister();
        setPassworRegister();
        goToRegisterButton();

     }


}
