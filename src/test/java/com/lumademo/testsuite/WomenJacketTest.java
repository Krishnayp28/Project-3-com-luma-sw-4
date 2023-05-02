package com.lumademo.testsuite;

import com.lumademo.pages.HomePage;
import com.lumademo.pages.WomenJacketsPage;
import com.lumademo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WomenJacketTest extends BaseTest {
    HomePage homePage = new HomePage();
    WomenJacketsPage womenJacketsPage = new WomenJacketsPage();

    @Test
    public void verifyTheSortByProductNameFilter() {
        homePage.mouseHoverOnWomenMenu();
        homePage.mouseHoverOnTops();
        homePage.clickOnJackets();
        womenJacketsPage.selectProductNameFilter("Product Name");
        Assert.assertEquals(womenJacketsPage.getProductList1(),womenJacketsPage.getProductList2());
    }

    @Test
    public void verifyTheSortByPriceFilter(){
        homePage.mouseHoverOnWomenMenu();
        homePage.mouseHoverOnTops();
        homePage.clickOnJackets();
        womenJacketsPage.selectProductNameFilter("Price");
        Assert.assertEquals(womenJacketsPage.getPriceList1(),womenJacketsPage.getPriceList2());
    }
}
