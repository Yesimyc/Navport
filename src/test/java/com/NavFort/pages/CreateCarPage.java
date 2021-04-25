package com.NavFort.pages;

import com.NavFort.utils.BrowserUtils;
import com.NavFort.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import java.util.List;

public class CreateCarPage extends BasePage {

    @FindBy(css = "[title='Create Car']")
    public WebElement createCarButton;

    @FindBy(css = "[data-name='field__license-plate']")
    public WebElement licensePlateInbox;

    @FindBy(css = "div[id*='FuelType']")
    public WebElement fuelTypeElement;

    @FindBy(css = "[class='btn-success btn dropdown-toggle']")
    public WebElement saveAndOption;

    @FindBy(css = "[class='action-button dropdown-item']")
    public WebElement saveAndCloseOption;

    @FindBy(xpath = "//h1[@class='user-name']")
    public WebElement pageTitle;


    public  WebElement selectTags(String tagName){

        String locator = "//label[text()='" + tagName + "']/preceding-sibling::input[@type='checkbox']";
        WebElement checkBox = Driver.get().findElement(By.xpath(locator));
        BrowserUtils.waitForVisibility(checkBox, 15);

        if (!checkBox.isSelected()) {
            checkBox.click();
        }
        return checkBox;
    }

    public void selectFuelType(String fuelType){

        String locator = "//div[@class='select2-result-label' and text()='" + fuelType + "']";
        BrowserUtils.waitForVisibility(fuelTypeElement,12);
        WebElement fuelTypeSelectionElement = Driver.get().findElement(By.xpath(locator));
        BrowserUtils.waitForClickability(fuelTypeSelectionElement, 15);
        fuelTypeSelectionElement.click();
    }

    }




