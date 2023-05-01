package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class WomenPage extends Utility {

    // Mouse Hover on Women Menu
    By mouseHoverWomenMenu = By.xpath("//span[normalize-space()='Women']");
    // Mouse Hover on Tops
    By mouseHoverTop = By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");
    // Click on Jackets
    By clickOnJacket = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");



    public void mouseHoverWomenMenu()
    {
        mouseHoverToElement(mouseHoverWomenMenu);
    }

    public void mouseHoverOnTop()
    {
        //waitUntilVisibilityOfElementLocated(mouseHoverTop,10);
        mouseHoverToElement(mouseHoverTop);
        // waitUntilVisibilityOfElementLocated(mouseHoverTop,10);
    }


    public void clickOnJackets()
    {
        clickOnElement(clickOnJacket);
        // waitUntilVisibilityOfElementClickable(clickOnJacket,10);
    }
}


