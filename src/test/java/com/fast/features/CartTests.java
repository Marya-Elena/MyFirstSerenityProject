 package com.fast.features;

  import com.fast.steps.serenity.CartSteps;
  import com.fast.steps.serenity.HomeSteps;
  import com.fast.steps.serenity.LoginSteps;
   import net.serenitybdd.junit.runners.SerenityRunner;
   import net.thucydides.core.annotations.Managed;
   import net.thucydides.core.annotations.Steps;
  import org.junit.Test;
  import org.junit.runner.RunWith;
   import org.openqa.selenium.WebDriver;

  @RunWith(SerenityRunner.class)
 public class CartTests {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
      HomeSteps homeSteps;
   @Steps
   CartSteps cartSteps;

   @Test

    public void addToCart() {
        homeSteps.navigateToHomepage();
        cartSteps.navigateToPageShop();
        cartSteps.goToTheImageProduct();
        cartSteps.goToAddToCartProduct();
        cartSteps.checkAddToCart();
   }
}
