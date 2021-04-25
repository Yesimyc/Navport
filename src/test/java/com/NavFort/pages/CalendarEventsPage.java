package com.NavFort.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CalendarEventsPage extends BasePage {

    @FindBy(className = "oro-subtitle")
    public WebElement pageTitle;

    @FindBy(css="[class='btn main-group btn-primary pull-right ']")
    public WebElement createCalendarEventButton;

    @FindBy(css="span[class='grid-header-cell__label']")
    public List<WebElement> columnNames;

    @FindBy(css = "[class='btn btn-link dropdown-toggle']")
    public WebElement optionsButton;

   @FindBy(css = "[class='input-widget']")
   public WebElement pageNumber;

    @FindBy(css = "[class='btn dropdown-toggle ']")
    public WebElement viewPerPageNumber;

    @FindBy(xpath="//tbody[@class='grid-body']/tr")
    public List<WebElement> rowsTable;

    @FindBy(xpath = "//label[contains(text(), 'Total')]")
    public WebElement numberOfRecords;

    @FindBy(css = "[class='btn btn-default btn-small dropdown-toggle'] >input")
    public WebElement mainCheckbox;

    @FindBy(xpath = "//input[@tabindex='-1']")
    public List<WebElement> checkboxes;

    @FindBy(xpath = "(//td[contains(text(),'Testers Meeting')])[2]")
    public WebElement testersMeeting;

    @FindBy(css = "[class='control-group attribute-row']")
    public List<WebElement> meetingInfo;

    @FindBy(xpath = "//tbody[@class='grid-body']/tr/td[9]/div/div/a")
    public WebElement threeDot;

    @FindBy(xpath = "//i[@class='fa-eye hide-text']")
    public WebElement view;

    @FindBy(xpath ="//i[@class='fa-pencil-square-o hide-text']")
    public WebElement edit;

    @FindBy(xpath = "//i[@class='fa-trash-o hide-text']")
    public WebElement delete;

    @FindBy(css = "[class='fa-cog hide-text']")
    public WebElement gridSetting;

    @FindBy(css = "[data-role='renderable']")
    public List<WebElement> gridList;

    @FindBy(xpath = "(//span[@class='grid-header-cell__label'])[1]")
    public WebElement titleTitle;


}
