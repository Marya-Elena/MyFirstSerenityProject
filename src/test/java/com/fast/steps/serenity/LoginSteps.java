package com.fast.steps.serenity;

import com.fast.pages.HomePage;
import com.fast.pages.LoginPage;
import com.fast.pages.MyAccountPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class LoginSteps extends ScenarioSteps {

    HomePage homePage;      //creem obiectul de clasa declarandu-l pt a ne putea folosi de actiunile din homepage
    LoginPage loginPage;    // la fel si cu actiunile din loginPage
    MyAccountPage myAccountPage;

    //imi deschide pagina de homepage ca sa pot da click pe account button
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
    public void setEmailLogin(){
       loginPage.setEmailLoginField();
    }

    @Step
    public void setPassword(){
        loginPage.setPasswordField();
    }

    @Step
    public void clickOnLoginButton(){
        loginPage.clickLoginButton();
    }

    @Step
   public void checkLoggedIn(){
        Assert.assertTrue(myAccountPage.checkLoggedIn());
    }


}
