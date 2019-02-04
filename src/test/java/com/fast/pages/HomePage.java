package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import java.util.concurrent.TimeUnit;

@DefaultUrl("http://qa2.fasttrackit.org:8008/")
public class HomePage extends PageObject {
    @FindBy(css="#menu-item-63 > a")
    private WebElementFacade menuButton;

    @FindBy (css="#menu-item-64 > a")
    private WebElementFacade MyAccountButton;

    public void clickMenuButton() {
//        withTimeoutOf(18, TimeUnit.SECONDS).waitFor(menuButton);
        clickOn(menuButton);
    }
    public void clickMyAccountButton(){
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(menuButton);
        clickOn( MyAccountButton);
    }
}
