package com.NavFort.tests;

import com.NavFort.pages.CalendarEventsPage;
import com.NavFort.pages.CreateCalendarEventPage;
import com.NavFort.pages.LoginPage;
import com.NavFort.utils.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class CreateCalendarEventTests extends TestBase{

    LoginPage loginPage = new LoginPage();
    CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
    CreateCalendarEventPage createCalendarEventPage =new CreateCalendarEventPage();

    @BeforeMethod
    public void setup() {

        loginPage.login("storemanager85", "UserUser123");
        loginPage.waitUntilLoaderMaskDisappear();

        loginPage.navigateTo("Activities", "Calendar Events");

        calendarEventsPage.waitUntilLoaderMaskDisappear();
        calendarEventsPage.createCalendarEventButton.click();
        calendarEventsPage.waitUntilLoaderMaskDisappear();


    }
    @Test(description = "Verify owners name is equals to Stephan Haley (it works on qa1 storemenager85)")
    public void test1(){
        System.out.println(createCalendarEventPage.ownerOption.getText());
        System.out.println("Stephan Haley");
        Assert.assertEquals(createCalendarEventPage.ownerOption.getText()," Stephan Haley");
        BrowserUtils.wait(5);
    }
    @Test(description = "Verify that “Save And Close”, “Save And New” and “Save” options are available")
    public void test2(){
        createCalendarEventPage.waitUntilLoaderMaskDisappear();
     createCalendarEventPage.saveAndClosebutton.click();
        BrowserUtils.wait(3);
        for(WebElement options : createCalendarEventPage.saveOptions){
            if(options.isEnabled()){
                System.out.println(options.getText());

            }
        }
        BrowserUtils.wait(5);
    }
    @Test(description = "Verify that after clicking 'cancel' button “All Calendar Events” page subtitle is displayed")
    public void test3(){
        createCalendarEventPage.waitUntilLoaderMaskDisappear();
        createCalendarEventPage.cancelButton.click();
        BrowserUtils.wait(4);
        Assert.assertEquals(calendarEventsPage.pageTitle.getText(), "All Calendar Events");
        System.out.println(calendarEventsPage.pageTitle.getText());
        System.out.println("All Calendar Events");
    }


}
