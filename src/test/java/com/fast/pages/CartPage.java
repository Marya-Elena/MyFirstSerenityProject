package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://qa2.fasttrackit.org:8008/?post_type=product")
public class CartPage extends PageObject {

    @FindBy(css="li[id='menu-item-63']")
    private WebElementFacade menuButton;
   // #menu-item-66 > a
    @FindBy( css="li[id='menu-item-66']")
    private WebElementFacade shopPage;
//#primary > ul > li.item-prod-wrap.wow.flipInY.post-19.product.type-product.status-publish.has-post-thumbnail.product_cat-accessories.instock.sale.taxable.shipping-taxable.purchasable.product-type-simple > div.collection_desc.clearfix > div.title-cart > a.collection_title > h3
    @FindBy (css="#primary > ul > li.item-prod-wrap.wow.flipInY.post-19.product.type-product.status-publish.has-post-thumbnail.product_cat-accessories.instock.sale.taxable.shipping-taxable.purchasable.product-type-simple > div.collection_combine.item-img > a > img")
    private WebElementFacade imageProduct;

    @FindBy(css = "#product-19 button[name='add-to-cart']")
    private WebElementFacade buttonAddToCart;


    public void goToHomeMenu(){
        clickOn(menuButton);
    }
    public void clickToShopPage (){
        clickOn(shopPage);
    }
    public void clickOnTheImageProduct(){
        clickOn(imageProduct);}

    public void  clickOnButtonAddToCart (){
        clickOn(buttonAddToCart);
    }


}



