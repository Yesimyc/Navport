package com.NavFort.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtils {

    public static void wait(int seconds) {

        try {
            Thread.sleep(1000 * seconds);
        } catch (InterruptedException e) {

        }

    }

    public static WebElement waitForVisibility(WebElement element, int timeToWaitSec){
        WebDriverWait wait = new WebDriverWait(Driver.get(),timeToWaitSec);
        return wait.until(ExpectedConditions.visibilityOf(element));

    }
    public static WebElement waitForClickability(WebElement element, int timeToWaitSec){
        WebDriverWait wait = new WebDriverWait(Driver.get(), timeToWaitSec);
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
