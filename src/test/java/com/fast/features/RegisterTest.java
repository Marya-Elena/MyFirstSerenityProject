package com.fast.features;

import com.fast.Utils.Constants;
import com.fast.pages.HomePage;
import com.fast.steps.serenity.LoginSteps;
import com.fast.steps.serenity.HomeSteps;
import com.fast.steps.serenity.LoginSteps;
import com.fast.steps.serenity.RegisterSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
    @RunWith(SerenityRunner.class)
public class RegisterTest {
        @Managed(uniqueSession = true)
        private WebDriver driver;

        @Steps
        HomeSteps homeSteps;

        @Steps
        RegisterSteps registerSteps;


        @Test
        public void registerValidDataTest() {
            homeSteps.navigateToHomepage();
            homeSteps.goToLogin();
            registerSteps.setEmailRegister(Constants.USER_EMAIL);
            registerSteps.setPasswordRegister(Constants.USER_PASSWORD);
            registerSteps.clickOnTheRegisterButton();

        }

    }



