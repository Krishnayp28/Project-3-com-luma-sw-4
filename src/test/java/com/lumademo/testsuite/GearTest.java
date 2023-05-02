package com.lumademo.testsuite;

import com.lumademo.pages.GearPage;
import com.lumademo.pages.HomePage;
import com.lumademo.pages.OverNightDufflePage;
import com.lumademo.pages.ShoppingCartPage;
import com.lumademo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {
    HomePage homePage = new HomePage();
    GearPage gearPage = new GearPage();
    OverNightDufflePage overNightDufflePage = new OverNightDufflePage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart(){
        homePage.mouseHoverOnGearMenu();
        homePage.clickOnBags();
        gearPage.clickOnOvernightDuffle();
        Assert.assertEquals(overNightDufflePage.getOverNightDuffelText(),"Overnight Duffle");
        overNightDufflePage.changeQuantityTo3("3");
        overNightDufflePage.clickOnAddToCart();
        Assert.assertEquals(overNightDufflePage.getAddToCartText(),"You added Overnight Duffle to your shopping cart.");
        overNightDufflePage.clickOnShoppingCart();
        Assert.assertEquals(shoppingCartPage.getOverNightDuffleText(), "Overnight Duffle");
        Assert.assertEquals(shoppingCartPage.getQty(), "3");
        Assert.assertEquals(shoppingCartPage.getProductPrice(), "$135.00");
        shoppingCartPage.changeQtyOfOverNightDuffle("5");
        shoppingCartPage.clickOnUpdateShoppingCart();
        Assert.assertEquals(shoppingCartPage.getUpdatedProductPrice(), "$225.00");

    }
}

