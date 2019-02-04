package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

@DefaultUrl("http://qa2.fasttrackit.org:8008/")


public class SearchPage extends PageObject {

    @FindBy(css="#menu-item-63 > a")
    private WebElementFacade menuButton;

    @FindBy( css="#menu-item-66 > a")
    private WebElementFacade ShopSection;

    //#masthead > div.main-header > div > div.right-links > div.header-search > a > i
    @FindBy (css="div.header-search > a > i.fa-search")
    private WebElementFacade SearchButton;

   //div.header-search > div > form > input[class='search-field'] //pas ok cand cauti dupa un nume de produs
  // #masthead > div.main-header > div > div.right-links > div.header-search > div > form > input
    @FindBy (css = "div.header-search > div > form > input[class='search-field']")
    private WebElementFacade WordSearchField;

//    @FindBy(id="cap")
//    private WebElement searchWord;

    // /#masthead > div.main-header > div > div.right-links > div.header-search > div > form > button > i
    @FindBy(css = "div > form > button>i[class= 'fa fa-search']")
    private WebElementFacade PushSearchButton;

    public void goToHomeMenu(){
        clickOn(menuButton);
    }

     public void goToShopSection (){
        clickOn(ShopSection);
     }
     public void goToSearchButton (){
        waitABit(10);
        clickOn(SearchButton);
     }

    public void goToSearchProduct(){
        clickOn(WordSearchField);
    }

//    public void setWordSearchField (){
//        waitABit(10);
//       typeInto(searchWord,"cap");
//
//    }

     public void clickOnTheSearchButton(){
        clickOn( PushSearchButton);
     }

}
