package com.fast.features;

import com.fast.Utils.Constants;
import com.fast.steps.serenity.LoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)

public class LoginTests {

   @Managed(uniqueSession = true)
    private WebDriver driver;
    @Steps
    private LoginSteps loginSteps;
    @Test
    public void validLoginTest(){
     loginSteps.navigateToHomepage();
     loginSteps.goToLogin();
     loginSteps.loginWithValidCredentials(Constants.USER_EMAIL, Constants.USER_PASSWORD);
     loginSteps.checkLoggedIn("kyalcin.a");
    }
     @Test
     public void validInvalidTest(){
      loginSteps.navigateToHomepage();
      loginSteps.goToLogin();
      loginSteps.loginWithInvalidCredentials("chis.123@gmail.com","123456");
      loginSteps.checkedLoggedInvalidCredentials("ERROR: Invalid username. Lost your password?");
     }
    }
