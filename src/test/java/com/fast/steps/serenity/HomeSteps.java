package com.fast.steps.serenity;

import com.fast.pages.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

public class HomeSteps extends ScenarioSteps {
    HomePage homePage;

    @Step
    public void navigateToHomepage()
    { homePage.open();
    }

    @Step
    public void goToLogin(){
        homePage.clickMenuButton();
        homePage.clickMyAccountButton();
    }

    @StepGroup

    public void goToHomePage(){
        navigateToHomepage();
        goToLogin();

    }
}
