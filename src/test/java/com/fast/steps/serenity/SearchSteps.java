package com.fast.steps.serenity;

import com.fast.pages.HomePage;
import com.fast.pages.SearchPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

public class SearchSteps extends ScenarioSteps {
    HomePage homePage;
    SearchPage searchPage;

    @Step
    public void navigateToHomepage(){ homePage.open(); }
    @Step
    public void navigateToShopPage(){
        searchPage.goToHomeMenu();
        searchPage.goToShopPageSection();
    }

    @Step
    public void navigateToSerachButton ()
    {
        searchPage.goToSearchButton();
    }
    @Step
    public void searchAftarAWord()
    {
        searchPage.goToSearchProduct();
    }

    @Step
    public void typeAWord()
    {
        searchPage.setWordSearchField();
    }

    @Step
    public void goAndClickSearchButton()
    {
        searchPage.clickOnTheSearchButton();
    }

}


