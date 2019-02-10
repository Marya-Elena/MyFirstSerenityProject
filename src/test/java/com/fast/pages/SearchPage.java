package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

@DefaultUrl("http://qa2.fasttrackit.org:8008/")


public class SearchPage extends PageObject {

    @FindBy(css="li[id='menu-item-63']")
    private WebElementFacade menuButton;

    @FindBy( css="li[id='menu-item-66']")
    private WebElementFacade shopPage;

    @FindBy (css="div.header-search > a > i.fa-search")
    private WebElementFacade SearchButton;

    @FindBy (css = "div.header-search > div > form > input[class='search-field']")
    private WebElementFacade WordSearchField;

   @FindBy(css="input.search-field")
    private WebElement searchWord;

    @FindBy(css = "div > form > button>i[class= 'fa fa-search']")
    private WebElementFacade PushSearchButton;

    public void goToHomeMenu(){
        clickOn(menuButton);
    }

     public void goToShopPageSection (){
        clickOn(shopPage);
     }
     public void goToSearchButton (){
        waitABit(10);
        clickOn(SearchButton);
     }

    public void goToSearchProduct(){
        clickOn(WordSearchField);
    }

    public void setWordSearchField (){
        waitABit(10);
       typeInto(searchWord,"cap");

    }

     public void clickOnTheSearchButton(){
        clickOn( PushSearchButton);
     }

}
