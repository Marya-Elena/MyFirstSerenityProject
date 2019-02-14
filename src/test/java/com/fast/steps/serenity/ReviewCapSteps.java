package com.fast.steps.serenity;

import com.fast.pages.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

public class ReviewCapSteps extends ScenarioSteps {

    MyAccountPage myAccountPage;
    SearchPage searchPage;
    ReviewPageCap reviewPageCap;

    @StepGroup
    public void goAndLoginAndSearchAProduct(){
        myAccountPage.checkLoggedIn("kyalcin.a");
        searchPage.clickToSearchButton();
        searchPage.clicksearchProduct();
        searchPage.setWordSearchField("cap");
        searchPage.clickOnTheSearchButton();
    }
     @StepGroup
    public void goAndLeavAReview(){
        reviewPageCap.clickOnProductTitle();
        reviewPageCap.clickOnReviewButton();
        reviewPageCap.writeAnReview("This a cap world!");
        reviewPageCap.clickOnTheSubmitButton();
     }

}
