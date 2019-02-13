package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

@DefaultUrl("http://qa2.fasttrackit.org:8008/?post_type=product")

public class ShopPage extends PageObject {

   @FindBy(css="form.woocommerce-ordering select.orderby")
    private WebElementFacade filterButton;

   @FindBy(css="option[value*='price-desc']")
   private WebElementFacade filterByHighPrice;

   @FindBy(css="div.cart a[data-product_sku='woo-sunglasses']")
   private WebElementFacade viewProduct;

   @FindBy(css="a[title='View cart']")
   private WebElementFacade viewCart;


   public void clickButtonFilterSetBy(){
       withTimeoutOf(20, TimeUnit.SECONDS).waitFor(filterButton);
       clickOn(filterButton);
   }
   public void clickButtonFilterByPrice(){
       withTimeoutOf(20, TimeUnit.SECONDS).waitFor(filterByHighPrice);
       clickOn(filterByHighPrice);
   }

   public void clickButtonViewProduct(){
       clickOn(viewProduct);
   }

   public void clickViewCart(){
       clickOn(viewCart);
   }



}
