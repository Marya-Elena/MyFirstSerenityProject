package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://qa2.fasttrackit.org:8008/?post_type=product")
public class CartPage extends PageObject {

    @FindBy(css="#menu-item-63 > a")
    private WebElementFacade menuButton;

    @FindBy( css="#menu-item-66 > a")
    private WebElementFacade ShopSection;

    @FindBy (css="#primary > ul > li.item-prod-wrap.wow.flipInY.post-19.product.type-product.status-publish.has-post-thumbnail.product_cat-accessories.instock.sale.taxable.shipping-taxable.purchasable.product-type-simple > div.collection_combine.item-img > a > img")
    private WebElementFacade imageProduct;

    @FindBy(css = "#product-19 > div.summary.entry-summary > form > button")
    private WebElementFacade AddToCartProduct;


    public void goToHomeMenu(){
        clickOn(menuButton);
    }
    public void goToShopSection (){
        clickOn(ShopSection);
    }
    public void clickImageProduct(){
        clickOn(imageProduct);}

    public void  clickProductToCart (){
        clickOn(AddToCartProduct);
    }






}



