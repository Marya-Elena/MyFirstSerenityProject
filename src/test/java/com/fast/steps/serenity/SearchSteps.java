package com.fast.steps.serenity;

import com.fast.pages.HomePage;
import com.fast.pages.SearchPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

public class SearchSteps extends ScenarioSteps {

    SearchPage searchPage;


    @Step
    public void navigateToShopPage(){
        searchPage.goToHomeMenu();
        searchPage.goToShopPageSection();
    }

    @Step
    public void navigateToSerachButton() {
        searchPage.clickToSearchButton();
    }

    @Step
    public void searchAftarAWord() {
        searchPage.clicksearchProduct();
    }

    @Step
    public void typeAWord(String typaProduct) {
        searchPage.setWordSearchField(typaProduct);
    }

    @Step
    public void goAndClickSearchButton() {
        searchPage.clickOnTheSearchButton();
    }

}


