package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://qa2.fasttrackit.org:8008/?product=cap")
public class ReviewPageCap extends PageObject {

    @FindBy(css = "h1.entry-title>a")
    private WebElementFacade clickOnProductTitle;

    @FindBy(css = "li.reviews_tab>a")
    private WebElementFacade clickOnReviewButton;

    @FindBy(id = "comment")
    private WebElementFacade writeAReview;

    @FindBy(id="author")
    private WebElementFacade writeName;

    @FindBy(id="email")
    private WebElementFacade writeEmail;


    @FindBy(id = "submit")
    private WebElementFacade clickButtonSubmit;

    public void clickOnProductTitle() {
        clickOn(clickOnProductTitle);
    }

    public void clickOnReviewButton() {
        clickOn(clickOnReviewButton);
    }

    public void writeAnReview() {
        waitFor(writeAReview);
        typeInto(writeAReview, "This a cap world!");

    }
    public void typeTheName(){
        waitFor(writeName);
        typeInto(writeName,"Hellen");
    }

    public void typeEmail(){
        waitFor(writeEmail);
        typeInto(writeEmail,"kyalcin.a@qzvbxqe5dx.tk");
    }



    public void clickOnTheSubmitButton() {
        clickOn(clickButtonSubmit);
    }



}
