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
        searchPage.clickToSearchButton();
        searchPage.clicksearchProduct();
        searchPage.setWordSearchField();
        searchPage.clickOnTheSearchButton();
    }
     @StepGroup
    public void goAndLeavAReview(){
        reviewPageCap.clickOnProductTitle();
        reviewPageCap.clickOnReviewButton();
        reviewPageCap.writeAnReview();
       // reviewPageCap.typeTheName();
       // reviewPageCap.typeEmail();
        reviewPageCap.clickOnTheSubmitButton();
     }

}
