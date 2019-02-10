package com.fast.features;

import com.fast.steps.serenity.HomeSteps;
import com.fast.steps.serenity.SearchSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class SearchTests {
    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    HomeSteps homeSteps;

    @Steps
    SearchSteps searchSteps;

    @Test

    public void goForSearchButton (){
        homeSteps.navigateToHomepage();
        searchSteps.navigateToShopPage();
        searchSteps.navigateToSerachButton();
        searchSteps.searchAftarAWord();
        searchSteps.typeAWord();
        searchSteps.goAndClickSearchButton();
    }




}
