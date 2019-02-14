package com.fast.pages;

import com.fast.Utils.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import java.util.concurrent.TimeUnit;

@DefaultUrl("http://qa2.fasttrackit.org:8008/")
public class HomePage extends BasePage {

    @FindBy(css="li[id='menu-item-63']")
    private WebElementFacade menuButton;


    @FindBy (css=" li[id='menu-item-64'] ")
    private WebElementFacade myAccountButton;

    public void clickMenuButton() {
        clickOn(menuButton);
    }
    public void clickMyAccountButton(){
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(menuButton);
        clickOn( myAccountButton);
    }
}

//Beanie” has been added to your cart"