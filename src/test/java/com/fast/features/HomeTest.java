package com.fast.features;

import com.fast.steps.serenity.HomeSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
@RunWith(SerenityRunner.class)
public class HomeTest {
    @Managed(uniqueSession = true)
    private WebDriver driver;
   @Steps
  private HomeSteps homeSteps;
   @Test
    public void openHomePage(){
       homeSteps.navigateToHomepage();
       homeSteps.goToLogin();
   }

}
