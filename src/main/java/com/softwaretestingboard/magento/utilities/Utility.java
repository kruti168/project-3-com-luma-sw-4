package com.softwaretestingboard.magento.utilities;

import com.softwaretestingboard.magento.browserfactory.ManageBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Utility extends ManageBrowser {

//    /**
//     * This method will use to hover mouse on element and click
//     */
//    public void mouseHoverToElementAndClick(By by) {
//        Actions actions = new Actions(driver);
//        actions.moveToElement(driver.findElement(by)).click().build().perform();
//    }

    /**
     * This method will click on element
     */
    public void clickOnElement(By by) {
        WebElement loginLink = driver.findElement(by);
        loginLink.click();
    }

//    /**
//     * This method will use to hover mouse on element
//     */
//    public void mouseHoverToElement(By by) {
//        Actions actions = new Actions(driver);
//        actions.moveToElement(driver.findElement(by)).build().perform();
//    }

    /**
     * This method will use to wait until  VisibilityOfElementLocated
     */
    public WebElement waitUntilVisibilityOfElementLocated(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    /**
     * This method will select the option by visible text
     */
    public void selectByVisibleTextFromDropDown(By by, String text) {
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        select.selectByVisibleText(text);
    }

    //This Method verify message
    public boolean verifyText(WebDriver driver, By locator, String expectedText) {
        WebElement element = driver.findElement(locator);
        String actualText = element.getText();
        return actualText.equals(expectedText);
    }

    //    /**
//     * This method will send text on element
//     */
//    public void sendTextToElement(By by, String text) {
//
//        driver.findElement(by).sendKeys(text);
//    }
    // This method will send text on element
    public void sendTextToElement(By by, String text) {

        driver.findElement(by).sendKeys(text);
    }

    //This method will be clear the qty.
    public void clearQty(By by) {
        driver.findElement(by).sendKeys(Keys.CONTROL + "a");
        driver.findElement(by).sendKeys(Keys.DELETE);
    }

    public void mouseHoverToElementAndClick(By by) {
        Actions actions = new Actions(driver);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actions.moveToElement(driver.findElement(by)).click().build().perform();
    }

    //This method will use to hover mouse on element
    public void mouseHoverToElement(By by) {
        Actions actions = new Actions(driver);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actions.moveToElement(driver.findElement(by)).build().perform();
    }


}
