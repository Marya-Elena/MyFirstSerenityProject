package com.fast.steps.serenity;

import com.fast.pages.HomePage;
import com.fast.pages.LoginPage;
import com.fast.pages.RegisterPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

public class RegisterSteps extends ScenarioSteps {

    RegisterPage registerPage;

    @Step
    public void setEmailRegister(String emailRegister) {
        registerPage.setEmailRegisterField(emailRegister);
    }

    @Step
    public void setPasswordRegister(String passRegistre) {
        registerPage.setPaswwordRegisterField(passRegistre);
    }

    @Step
    public void clickOnTheRegisterButton() {
        registerPage.clickRegisterButton();
    }



     }



