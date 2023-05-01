package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.GearPage;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {

    HomePage homePage = new HomePage();
    GearPage gearPage = new GearPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart(){

        gearPage.mouseHoveOnGearMenu();
        gearPage.clickOnBags();
        gearPage.clickOnProductNameOverNightDuffle();
        gearPage.VerifyTextOverNightDuffle();
        gearPage.changeQty3();
        gearPage.addToCard();
        gearPage.verifyTheTextYouaddedOvernightDuffletoyourshoppingcart();
        gearPage.clickOnShoppingCart();
        gearPage.verifyQty3();
        gearPage.verifyProductPrice$135();
        gearPage.changeQty5();
        gearPage.updateShoppingCartButton();
        gearPage.productPrice$225();


    }

}
