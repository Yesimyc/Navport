package com.NavFort.tests;

import com.NavFort.pages.LoginPage;
import com.NavFort.utils.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;

public class LoginTest extends TestBase {



    @Test(description = "verify that page title is a 'Dashboard'")
    public void test1() {
       // Driver.get().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        LoginPage loginPage = new LoginPage();
        loginPage.login("storemanager85", "UserUser123");
        WebDriverWait wait = new WebDriverWait(Driver.get(), 10);
        wait.until(ExpectedConditions.titleIs("Dashboard"));
        Assert.assertEquals(Driver.get().getTitle(), "Dashboard");


    }
}
