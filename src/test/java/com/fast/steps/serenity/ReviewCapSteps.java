package com.fast.steps.serenity;

import com.fast.pages.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

public class ReviewCapSteps extends ScenarioSteps {

    HomePage homePage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;
    SearchPage searchPage;
    ReviewPageCap reviewPageCap;

    @StepGroup
    public void goAndLoginAndSearchAProduct(){
        homePage.open();
        homePage.clickMenuButton();
        homePage.clickMyAccountButton();
        loginPage.setEmailLoginField();
        loginPage.setPasswordField();
        loginPage.clickLoginButton();
        myAccountPage.checkLoggedIn();
        searchPage.goToSearchButton();
        searchPage.goToSearchProduct();
        searchPage.setWordSearchField();
        searchPage.clickOnTheSearchButton();
    }
     @StepGroup
    public void goAndLeavAReview(){
        reviewPageCap.goToClickOnProductTitle();
        reviewPageCap.goToClickOnReviewButton();
        reviewPageCap.goAndWriteAnReview();
        reviewPageCap.clickOnTheSubmitButton();
     }

}
