package com.NavFort.tests;

import com.NavFort.pages.CalendarEventsPage;
import com.NavFort.pages.LoginPage;
import com.NavFort.utils.BrowserUtils;
import com.NavFort.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CalendarEventsTests extends TestBase {

    LoginPage loginPage = new LoginPage();
    CalendarEventsPage calendarEventsPage = new CalendarEventsPage();

//    @BeforeMethod
//    public void setup() {
//
//        loginPage.login("storemanager85", "UserUser123");
//        loginPage.waitUntilLoaderMaskDisappear();
//
//        loginPage.navigateTo("Activities", "Calendar Events");
//
//        calendarEventsPage.waitUntilLoaderMaskDisappear();
//
//    }
//
//    @Test(description = "Verify page subtitle")
//    public void test1() {
//
//        Assert.assertEquals(calendarEventsPage.pageTitle.getText(), "All Calendar Events");
//        System.out.println(calendarEventsPage.pageTitle.getText());
//        System.out.println("All Calendar Events");
//
//    }
//
//    @Test(description = "Verify that 'Create Calendar event' button is displayed")
//    public void test2() {
//
//        calendarEventsPage.waitUntilLoaderMaskDisappear();
//        calendarEventsPage.waitUntilLoaderMaskDisappear();
//        Assert.assertTrue(calendarEventsPage.createCalendarEventButton.isDisplayed());
//        System.out.println(calendarEventsPage.createCalendarEventButton.getText() + " button is displayed.");
//
//    }
//
//
//    @Test(description = "\"Verify that page subtitle \\\"Options\\\" is displayed\")")
//    public void test4() {
//
//        calendarEventsPage.waitUntilLoaderMaskDisappear();
//        Assert.assertTrue(calendarEventsPage.optionsButton.isDisplayed());
//
//    }
//
//    @Test(description = "Verify that page number is equals to \"1\"")
//    public void test5() {
//
//        calendarEventsPage.waitUntilLoaderMaskDisappear();
//        Assert.assertEquals(calendarEventsPage.pageNumber.getAttribute("value"), "1");
//        System.out.println("Page Number is : " + calendarEventsPage.pageNumber.getText());
//
//    }
//
//    @Test(description = "Verify that view per page number is equals to \"25\"")
//    public void test6() {
//
//        calendarEventsPage.waitUntilLoaderMaskDisappear();
//        Assert.assertEquals(calendarEventsPage.viewPerPageNumber.getText(), "25");
//        System.out.println("View per Page number is : " + calendarEventsPage.viewPerPageNumber.getText());
//
//    }
//
//    @Test(description = "Verify that number of calendar events (rows in the table) is equals to number of records")
//    public void test7() {
//
//        Integer expectedNumber = calendarEventsPage.rowsTable.size();
//        String actualNumber = calendarEventsPage.numberOfRecords.getText();
//        Assert.assertTrue(actualNumber.contains(expectedNumber + ""));
//        System.out.println(calendarEventsPage.numberOfRecords.getText());
//
//    }
//
//    @Test(description = "Verify that all calendar events were selected")
//    public void test8() {
//
//        calendarEventsPage.waitUntilLoaderMaskDisappear();
//        calendarEventsPage.mainCheckbox.click();
//        calendarEventsPage.waitUntilLoaderMaskDisappear();
//        for (int i = 1; i < calendarEventsPage.checkboxes.size(); i++) {
//            if (calendarEventsPage.checkboxes.get(i).isSelected()) {
//                System.out.println("CheckBox is selected : " + i);
//            } else {
//                System.out.println("CheckBox is not selected : " + calendarEventsPage.checkboxes.get(i));
//
//            }
//        }
//
//    }
//
////    @Test(description = "Verify that following data is displayed:")
////    public void test9() {
////
////        calendarEventsPage.waitUntilLoaderMaskDisappear();
////        BrowserUtils.wait(8);
////        calendarEventsPage.testersMeeting.click();
////        calendarEventsPage.waitUntilLoaderMaskDisappear();
////
////        List<String> list = new ArrayList<>(Arrays.asList(
////                "Testers Meeting",
////                "N/A",
////                "Dec 15, 2019, 7:31 AM",
////                "Dec 15, 2019, 8:31 AM",
////                "No",
////                "Stephan Haley",
////                "No"
////        ));
////
////         for (int i=0; i<list.size();i++){
////             String actualResult = calendarEventsPage.meetingInfo.get(i).getText();
////             Assert.assertEquals(actualResult,list.get(i));
////             System.out.println(actualResult);
////
////         }
//@Test(description = "Verify that “view”, “edit” and “delete” options are available")
//public void test10() {
//
//        calendarEventsPage.waitUntilLoaderMaskDisappear();
//    Actions action = new Actions(Driver.get());
//    action.moveToElement(calendarEventsPage.threeDot).perform();
//    BrowserUtils.wait(3);
//    action.moveToElement(calendarEventsPage.view).perform();
//    BrowserUtils.waitForVisibility(calendarEventsPage.view, 5);
//    Assert.assertTrue(calendarEventsPage.view.isDisplayed());
//    BrowserUtils.wait(5);
//    System.out.println("View option is avaliable");
//
//
//    action.moveToElement(calendarEventsPage.threeDot.findElement(By.xpath("//i[@class='fa-pencil-square-o hide-text']"))).perform();
//    BrowserUtils.waitForVisibility(calendarEventsPage.edit, 5);
//    Assert.assertTrue(calendarEventsPage.edit.isDisplayed());
//    BrowserUtils.wait(5);
//    System.out.println("Edit option is avaliable");
//
//
//    action.moveToElement(calendarEventsPage.threeDot.findElement(By.xpath("//i[@class='fa-trash-o hide-text']"))).perform();
//    BrowserUtils.waitForVisibility(calendarEventsPage.delete, 5);
//    Assert.assertTrue(calendarEventsPage.delete.isDisplayed());
//    BrowserUtils.wait(5);
//    System.out.println("Delete option is avaliable");
//
//    }
//    @Test(description = "Verify that “Title” column still displayed in Grid Setting")
//    public void test11() {
//
//        calendarEventsPage.gridSetting.click();
//        BrowserUtils.wait(2);
//
//        for(int i=1; i<calendarEventsPage.gridList.size();i++){
//            if(calendarEventsPage.gridList.get(i).isSelected()){
//                calendarEventsPage.gridList.get(i).click();
//            }
//        }
//
//     Assert.assertTrue(calendarEventsPage.titleTitle.isDisplayed());
//        System.out.println("Title column is still displayed");
//
//   }

    @Test(description = "Verify page subtitle")
    public void test1() {
        loginPage.login("storemanager85", "UserUser123");
        loginPage.waitUntilLoaderMaskDisappear();

        loginPage.navigateTo("Activities", "Calendar Events");

        calendarEventsPage.waitUntilLoaderMaskDisappear();

        Assert.assertEquals(calendarEventsPage.pageTitle.getText(), "All Calendar Events");
        System.out.println(calendarEventsPage.pageTitle.getText());
        System.out.println("All Calendar Events");

    }

    @Test(description = "Verify that 'Create Calendar event' button is displayed")
    public void test2() {
        loginPage.login("storemanager85", "UserUser123");
        loginPage.waitUntilLoaderMaskDisappear();

        loginPage.navigateTo("Activities", "Calendar Events");

        calendarEventsPage.waitUntilLoaderMaskDisappear();

        Assert.assertTrue(calendarEventsPage.createCalendarEventButton.isDisplayed());
        System.out.println(calendarEventsPage.createCalendarEventButton.getText() + " button is displayed.");

    }

    @Test(description = "\"Verify that page subtitle \\\"Options\\\" is displayed\")")
    public void test4() {
        loginPage.login("storemanager85", "UserUser123");
        loginPage.waitUntilLoaderMaskDisappear();

        loginPage.navigateTo("Activities", "Calendar Events");

        calendarEventsPage.waitUntilLoaderMaskDisappear();
        Assert.assertTrue(calendarEventsPage.optionsButton.isDisplayed());

    }

    @Test(description = "Verify that page number is equals to \"1\"")
    public void test5() {
        loginPage.login("storemanager85", "UserUser123");
        loginPage.waitUntilLoaderMaskDisappear();

        loginPage.navigateTo("Activities", "Calendar Events");

        calendarEventsPage.waitUntilLoaderMaskDisappear();

        Assert.assertEquals(calendarEventsPage.pageNumber.getAttribute("value"), "1");
        System.out.println("Page Number is : " + calendarEventsPage.pageNumber.getText());

    }

    @Test(description = "Verify that view per page number is equals to \"25\"")
    public void test6() {
        loginPage.login("storemanager85", "UserUser123");
        loginPage.waitUntilLoaderMaskDisappear();

        loginPage.navigateTo("Activities", "Calendar Events");

        calendarEventsPage.waitUntilLoaderMaskDisappear();
        Assert.assertEquals(calendarEventsPage.viewPerPageNumber.getText(), "25");
        System.out.println("View per Page number is : " + calendarEventsPage.viewPerPageNumber.getText());

    }

    @Test(description = "Verify that number of calendar events (rows in the table) is equals to number of records")
    public void test7() {
        loginPage.login("storemanager85", "UserUser123");
        loginPage.waitUntilLoaderMaskDisappear();

        loginPage.navigateTo("Activities", "Calendar Events");

        calendarEventsPage.waitUntilLoaderMaskDisappear();

        Integer expectedNumber = calendarEventsPage.rowsTable.size();
        String actualNumber = calendarEventsPage.numberOfRecords.getText();
        Assert.assertTrue(actualNumber.contains(expectedNumber + ""));
        System.out.println(calendarEventsPage.numberOfRecords.getText());

    }

    @Test(description = "Verify that all calendar events were selected")
    public void test8() {

        loginPage.login("storemanager85", "UserUser123");
        loginPage.waitUntilLoaderMaskDisappear();

        loginPage.navigateTo("Activities", "Calendar Events");

        calendarEventsPage.waitUntilLoaderMaskDisappear();
        calendarEventsPage.mainCheckbox.click();
        calendarEventsPage.waitUntilLoaderMaskDisappear();
        for (int i = 1; i < calendarEventsPage.checkboxes.size(); i++) {
            if (calendarEventsPage.checkboxes.get(i).isSelected()) {
                System.out.println("CheckBox is selected : " + i);
            } else {
                System.out.println("CheckBox is not selected : " + calendarEventsPage.checkboxes.get(i));

            }
        }

    }

    //    @Test(description = "Verify that following data is displayed:")
//    public void test9() {
//
//        calendarEventsPage.waitUntilLoaderMaskDisappear();
//        BrowserUtils.wait(8);
//        calendarEventsPage.testersMeeting.click();
//        calendarEventsPage.waitUntilLoaderMaskDisappear();
//
//        List<String> list = new ArrayList<>(Arrays.asList(
//                "Testers Meeting",
//                "N/A",
//                "Dec 15, 2019, 7:31 AM",
//                "Dec 15, 2019, 8:31 AM",
//                "No",
//                "Stephan Haley",
//                "No"
//        ));
//
//         for (int i=0; i<list.size();i++){
//             String actualResult = calendarEventsPage.meetingInfo.get(i).getText();
//             Assert.assertEquals(actualResult,list.get(i));
//             System.out.println(actualResult);
//
//         }
    @Test(description = "Verify that “view”, “edit” and “delete” options are available")
    public void test10() {
        loginPage.login("storemanager85", "UserUser123");
        loginPage.waitUntilLoaderMaskDisappear();

        loginPage.navigateTo("Activities", "Calendar Events");

        calendarEventsPage.waitUntilLoaderMaskDisappear();
        Actions action = new Actions(Driver.get());
        action.moveToElement(calendarEventsPage.threeDot).perform();
        BrowserUtils.wait(3);
        action.moveToElement(calendarEventsPage.view).perform();
        BrowserUtils.waitForVisibility(calendarEventsPage.view, 5);
        Assert.assertTrue(calendarEventsPage.view.isDisplayed());
        BrowserUtils.wait(5);
        System.out.println("View option is avaliable");


        action.moveToElement(calendarEventsPage.threeDot.findElement(By.xpath("//i[@class='fa-pencil-square-o hide-text']"))).perform();
        BrowserUtils.waitForVisibility(calendarEventsPage.edit, 5);
        Assert.assertTrue(calendarEventsPage.edit.isDisplayed());
        BrowserUtils.wait(5);
        System.out.println("Edit option is avaliable");


        action.moveToElement(calendarEventsPage.threeDot.findElement(By.xpath("//i[@class='fa-trash-o hide-text']"))).perform();
        BrowserUtils.waitForVisibility(calendarEventsPage.delete, 5);
        Assert.assertTrue(calendarEventsPage.delete.isDisplayed());
        BrowserUtils.wait(5);
        System.out.println("Delete option is avaliable");

    }
    @Test(description = "Verify that “Title” column still displayed in Grid Setting")
    public void test11() {
        loginPage.login("storemanager85", "UserUser123");
        loginPage.waitUntilLoaderMaskDisappear();

        loginPage.navigateTo("Activities", "Calendar Events");

        calendarEventsPage.waitUntilLoaderMaskDisappear();

        calendarEventsPage.gridSetting.click();
        BrowserUtils.wait(2);

        for(int i=1; i<calendarEventsPage.gridList.size();i++){
            if(calendarEventsPage.gridList.get(i).isSelected()){
                calendarEventsPage.gridList.get(i).click();
            }
        }

        Assert.assertTrue(calendarEventsPage.titleTitle.isDisplayed());
        System.out.println("Title column is still displayed");

    }

}
