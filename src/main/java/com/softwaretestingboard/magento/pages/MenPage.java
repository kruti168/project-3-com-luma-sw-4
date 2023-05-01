package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class MenPage extends Utility {
    //Click on Pants
    By clickOnPants = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");

    //Mouse hover on 'Cronus Yoga Pant'
    By mouseHoverYogaPant = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");

    // Mouse Hover on product name Cronus Yoga Pant and click on size 32.
    By mouseHoverYogaPantClick32 = By.xpath("(//div[@class='swatch-option text'])[1]");

    // Mouse Hover on product name Cronus Yoga Pant and click on colour Black.
    By mouseHoveryogaPantClickBlack = By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-color-93-item-49']");

    By mouseHoverOnYogaPant = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
   By clickOnAddToCart = By.xpath("//li[1]//div[1]//div[1]//div[3]//div[1]//div[1]//form[1]//button[1]//span[1]");
    By verifyText = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By clickOnShoppingCard = By.xpath("//a[normalize-space()='shopping cart']");
    By verifyText1 = By.xpath("//span[@class='base']");
    By verifyText2 = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");
    By verifyText3 = By.xpath("//dd[contains(text(),'32')]");
    By verifyText4 = By.xpath("//dd[contains(text(),'Black')]");


    public void clickPants(){
        clickOnElement(clickOnPants);

    }
    public void mouseHoverCronusYogaPant(){

        mouseHoverToElement(mouseHoverYogaPant);
        mouseHoverToElementAndClick(mouseHoverYogaPantClick32);

    }public void clickOnBlack(){
        //  mouseHoverToElement(mouseHoverYogaPant);
        mouseHoverToElementAndClick(mouseHoveryogaPantClickBlack);
    }


    //Mouse Hover on product name ‘Cronus Yoga Pant’ and click on ‘Add To Cart’ Button.
    public void MouseHoverOnYogaPantAndAddToCart() {

        mouseHoverToElement(mouseHoverOnYogaPant);
    }

    public void ClickAddToCart() {

        mouseHoverToElementAndClick(clickOnAddToCart);

    }
      //Verify Text ‘You added Cronus Yoga Pant to your shopping cart.’
       public void verifyTextYouAddedCronusYogaPantToYourShoppingCart() {

        verifyText(driver, verifyText, "You added Cronus Yoga Pant to your shopping cart.");

    }
    //Click on ‘shopping cart’ Link into message
     public void clickOnShoppingCart(){
        clickOnElement(clickOnShoppingCard);

     }
     //Verify the text ‘Shopping Cart.’
    public void VerifyTextShoppingCart(){

        verifyText(driver,verifyText1,"Shopping Cart");

    }
    //Verify the product name ‘Cronus Yoga Pant’
    public void productNameCronusYogaPant(){

        verifyText(driver,verifyText2,"Cronus Yoga Pant");
    }
    //Verify the product size ‘32’
    public void productSize32(){

        verifyText(driver,verifyText3,"32");
    }
    //Verify the product colour ‘Black’
    public void productColourBlack(){

        verifyText(driver,verifyText4,"Black");
    }
}