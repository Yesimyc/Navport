package com.NavFort.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    private static WebDriver driver;

    private Driver(){

    }

    public static WebDriver get(){

        if(driver==null){
            String browser = ConfigurationReader.getProperty("browser");
       switch(browser){

           case "chrome":
               WebDriverManager.chromedriver().setup();
               driver= new ChromeDriver();
               break;
           case "firefox":
               WebDriverManager.firefoxdriver().setup();
               driver= new FirefoxDriver();
               break;
           default:
               throw new RuntimeException("wrong browser type");
       }

        }
        return driver;

    }
    public static void close(){
        if (driver !=null){
            driver.quit();
            driver=null;
        }
    }
}
