package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://qa2.fasttrackit.org:8008/?s=cap&post_type=")
public class ReviewPageCap extends PageObject {

    @FindBy(css = "h1.entry-title>a")
    private WebElementFacade clickOnProductTitle;

    @FindBy(css = "li.reviews_tab>a")
    private WebElementFacade clickOnReviewButton;

    @FindBy(id = "comment")
    private WebElementFacade writeAReview;
    @FindBy(id = "submit")
    private WebElementFacade clickButtonSubmit;

    public void goToClickOnProductTitle(){
        clickOn(clickOnProductTitle);
    }
    public void goToClickOnReviewButton(){
        clickOn(clickOnReviewButton);
    }
    public void goAndWriteAnReview(){
        waitFor(writeAReview);
        typeInto(writeAReview,"This a cap world!");
    }

    public void clickOnTheSubmitButton(){
        clickOn(clickButtonSubmit);
    }

}
