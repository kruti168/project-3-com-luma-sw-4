package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class GearPage extends Utility {

    By mouseHoverGearMenu = By.xpath("//span[normalize-space()='Gear']");
    By clickBags = By.xpath("//span[normalize-space()='Bags']");
    By clickOvernightDuffle = By.xpath("//a[normalize-space()='Overnight Duffle']");
    By verifyText1 = By.xpath("//span[@class='base']");
    By changeQty = By.xpath("//input[@id='qty']");
    By clickAddToCart = By.xpath("//button[@id='product-addtocart-button']");
    By verifyText2 = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By clickShoppingCart = By.xpath("//a[normalize-space()='shopping cart']");
    By verifyText3 = By.xpath("//input[@title='Qty']");
    By verifyText4 = By.xpath("//td[@class='col subtotal']//span[@class='price']");
    By changeQty5to3 = By.xpath("//tbody/tr[1]/td[3]/div[1]/div[1]/label[1]");
    By updateShoppingCart = By.xpath("//span[normalize-space()='Update Shopping Cart']");
    By productPrice$225 =By.xpath("//td[@class='col subtotal']//span[@class='price']");

    //Mouse Hover on Gear Menu
    public void mouseHoveOnGearMenu() {

        mouseHoverToElement(mouseHoverGearMenu);
    }//Click on Bags

    public void clickOnBags() {

        clickOnElement(clickBags);
    }//Click on Product Name ‘Overnight Duffle’

    public void clickOnProductNameOverNightDuffle() {

        clickOnElement(clickOvernightDuffle);
    }

    //Verify the text ‘Overnight Duffle’
    public void VerifyTextOverNightDuffle() {

        verifyText(driver, verifyText1, "Overnight Duffle");

    }

    //Change Qty3
    public void changeQty3() {

        clearQty(By.xpath("//input[@id='qty']"));
        sendTextToElement(changeQty,"3");
    }

    //Click on ‘Add to Cart’ Button.
    public void addToCard() {

        clickOnElement(clickAddToCart);
    }

    //Verify the text ‘You added Overnight Duffle to your shopping cart.’
    public void verifyTheTextYouaddedOvernightDuffletoyourshoppingcart() {

        verifyText(driver, verifyText2, "You added Overnight Duffle to your shopping cart.");
    }
    //Click on ‘shopping cart’ Link into message
    public void clickOnShoppingCart(){

        clickOnElement(clickShoppingCart);
    }
    //Verify the Qty is ‘3’
    public void verifyQty3(){

        verifyText(driver,verifyText3,"3");

    }
    //Verify the product price ‘$135.00’
    public void verifyProductPrice$135(){

        verifyText(driver,verifyText4,"$135.00");
    }
    //Change Qty 5
    public void changeQty5(){

        mouseHoverToElement(By.xpath("//tbody/tr[1]/td[3]/div[1]/div[1]/label[1]"));
        clickOnElement(By.xpath("//tbody/tr[1]/td[3]/div[1]/div[1]/label[1]"));
        clearQty(By.xpath("//tbody/tr[1]/td[3]/div[1]/div[1]/label[1]"));
        sendTextToElement(changeQty5to3, "5");
    }
    //Click on ‘Update Shopping Cart’ button
    public void updateShoppingCartButton()
    {
        clickOnElement(updateShoppingCart);
    }

    //Verify the product price ‘$225.00’
    public void productPrice$225()
    {
        verifyText(driver,productPrice$225,"$225.00");
    }
}