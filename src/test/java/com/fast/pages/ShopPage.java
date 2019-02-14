package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;

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

   @FindBy(css=".product-price span.amount")
   private WebElementFacade productPriceSpan;

   @FindBy(css=" .product-subtotal .amount")
   private WebElementFacade productTotalPrice;

   @FindBy(id="coupon_code")
   private WebElementFacade typeCouponCode;

   @FindBy(css="input[name='apply_coupon']")
    private WebElementFacade buttonApplyCoupon;

   @FindBy(css="ul.woocommerce-error")
   private WebElementFacade errorMessageCoupon;

   @FindBy(css="div.wc-proceed-to-checkout a")
   private WebElementFacade proceedToCheckoutButton;

   public void clickButtonFilterSetBy(){
       withTimeoutOf(20, TimeUnit.SECONDS).waitFor(filterButton);
       clickOn(filterButton);
   }
   public void clickButtonFilterByPrice(){
       withTimeoutOf(20, TimeUnit.SECONDS).waitFor(filterByHighPrice);
       clickOn(filterByHighPrice);
   }

    public void clickButtonViewProduct() {
        clickOn(viewProduct);
    }

    public void clickViewCart() {
        clickOn(viewCart);
    }

     public void checkQuantityTotal() {

         String price = productPriceSpan.getText().trim();
         String priceFinal = price.replaceAll(",", "").replace(" lei", "");
         int pricez = Integer.valueOf(priceFinal);
         int subtotal = pricez * 1;

         String priceTotal = productTotalPrice.getText().trim();
         int priceTotalFinal = Integer.valueOf(priceTotal.replace(",", "").replace(" lei", ""));

         if (subtotal == priceTotalFinal){
             System.out.println("Este corect!");
         }
      else {
             System.out.println("Rezultat gresit");
         }

     }

     public void typeTheCouponCode(String typeTheCode){
       waitFor(typeCouponCode);
       typeInto(typeCouponCode,typeTheCode);
     }

    public void clickOnApllyCoupon() {
        waitFor(buttonApplyCoupon);
        clickOn(buttonApplyCoupon);
    }
    public boolean checkedErrorMessageCoupon( String errorMessage){
       waitFor(errorMessageCoupon);
       return errorMessageCoupon.containsText(errorMessage);
    }

    public void clickButtonProceedToCheckout(){
       clickOn(proceedToCheckoutButton);
    }




}
