package com.NavFort.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;

import java.util.List;

public class CreateCalendarEventPage extends BasePage{

    @FindBy(css = "[title='Create Calendar event']")
    public WebElement createCalendarEventButton;

    @FindBy(xpath = "//a[@class='select2-choice']")
    public WebElement ownerOption;

    @FindBy(css = "[class='caret']")
    public WebElement saveAndClosebutton;

    @FindBy(xpath = "//li/button")
    public List<WebElement> saveOptions;

    @FindBy(css = "[class='btn back icons-holder-text ']")
    public WebElement cancelButton;

}
