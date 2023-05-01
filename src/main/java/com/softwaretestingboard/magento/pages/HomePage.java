package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    //Mouse Hover on Women menu
    By mouseHoverWomenMenu = By.xpath("//span[normalize-space()='Women']");

    //Mouse Hover on Tops
    By mouseHoverTop = By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");

    //Click on Jackets
    By mouseHoverClickOnJacket = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");

    //Mouse Hover on Men Menu
    By mouseHoverOnMenMenu = By.xpath("//span[normalize-space()='Men']");

    //Mouse Hover On Bottom
    By mouseHoverOnBottom = By.xpath("//a[@id='ui-id-18']");




    public void mouseHoverOnWomenMenu() {
        mouseHoverToElement(mouseHoverWomenMenu);
            waitUntilVisibilityOfElementLocated(By.xpath("//span[normalize-space()='Women']"),10);

    }

    public void mouseHoveronTops() {

        mouseHoverToElement(mouseHoverTop);
        waitUntilVisibilityOfElementLocated(By.linkText("Tops"),10);

    }

    public void mouseHoverOnJackets() {

       clickOnElement(mouseHoverClickOnJacket);
    }
    public void mouseHoverMenMenu(){

        mouseHoverToElement(mouseHoverOnMenMenu);

    }
    public void mouseHoverBottom(){


        mouseHoverToElement(mouseHoverOnBottom);
        waitUntilVisibilityOfElementLocated(By.xpath("//a[@id='ui-id-18']"),5);

    }






    }

