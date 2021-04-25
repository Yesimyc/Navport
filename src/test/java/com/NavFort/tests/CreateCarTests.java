package com.NavFort.tests;

import com.NavFort.pages.CalendarEventsPage;
import com.NavFort.pages.CreateCalendarEventPage;
import com.NavFort.pages.CreateCarPage;
import com.NavFort.pages.LoginPage;
import com.NavFort.utils.BrowserUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateCarTests extends TestBase {

    LoginPage loginPage = new LoginPage();
    CreateCarPage createCarPage = new CreateCarPage();



    @BeforeMethod
    public void setup() {

        loginPage.login("storemanager85", "UserUser123");
        loginPage.waitUntilLoaderMaskDisappear();

        loginPage.navigateTo("Fleet", "Vehicles");

        loginPage.waitUntilLoaderMaskDisappear();

        createCarPage.createCarButton.click();
        createCarPage.waitUntilLoaderMaskDisappear();



    }
    @Test(description = "Create some random car")
    public void test1(){
        BrowserUtils.wait(6);
        createCarPage.licensePlateInbox.sendKeys("Subaru");
        BrowserUtils.wait(6);
//        createCarPage.selectTags("Senior");
//        BrowserUtils.wait(6);
//        createCarPage.selectFuelType("Hybrid");
//        BrowserUtils.wait(6);
        createCarPage.waitUntilLoaderMaskDisappear();
        createCarPage.saveAndOption.click();
        BrowserUtils.wait(6);
        createCarPage.saveAndCloseOption.click();
        BrowserUtils.wait(6);

        Assert.assertEquals(createCarPage.pageTitle.getText(),"Subaru");
        System.out.println(createCarPage.pageTitle.getText());

    }

}
