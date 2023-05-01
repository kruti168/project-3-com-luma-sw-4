package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.MenPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {
    HomePage homePage = new HomePage();
    MenPage menPage = new MenPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() {
        homePage.mouseHoverMenMenu();
        homePage.mouseHoverBottom();
        menPage.clickPants();
        menPage.mouseHoverCronusYogaPant();
        menPage.clickOnBlack();
        menPage.ClickAddToCart();
        menPage.verifyTextYouAddedCronusYogaPantToYourShoppingCart();
        menPage.ClickAddToCart();
        menPage.VerifyTextShoppingCart();
        menPage.clickOnShoppingCart();
        menPage.productNameCronusYogaPant();
        menPage.productSize32();
        menPage.productColourBlack();
    }



    }
