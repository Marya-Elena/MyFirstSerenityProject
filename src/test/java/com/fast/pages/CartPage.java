package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.List;
import java.util.concurrent.TimeUnit;

@DefaultUrl("http://qa2.fasttrackit.org:8008/?post_type=product")
public class CartPage extends PageObject {

    @FindBy(css = "li[id='menu-item-63']")
    private WebElementFacade menuButton;

    @FindBy(css = "li[id='menu-item-66']")
    private WebElementFacade shopPage;

    // ".product"
    @FindBy(css = ".item-prod-wrap")
    List<WebElementFacade> listOfProducts;


   //div button[name='add-to-cart']//#product-19 button[name='add-to-cart']//button.single_add_to_cart_button
    // div.cart a.button

    @FindBy(css = "a[title='View cart']")
    private WebElementFacade viewCartButton;




    public void goToHomeMenu() {
        clickOn(menuButton);
    }

    public void clickToShopPage() {
        clickOn(shopPage);
    }

    public boolean selectProductFromList(String text) {
        for (WebElementFacade product : listOfProducts){
            if (product.getText().contains(text)) {
                product.findElement(By.cssSelector("div.cart a.button ")).click();
                return true;
            }
        }
        return false;

    }

    public void clickOnViewCart(){
        clickOn(viewCartButton);
    }





//    public void  clickOnButtonAddToCart (){
//        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(buttonAddToCart);
//        clickOn(buttonAddToCart);
//    }


}



