package com.NavFort.tests;

import com.NavFort.utils.ConfigurationReader;
import com.NavFort.utils.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public abstract class TestBase {

    @BeforeMethod
    @Parameters("env_url")
    public void setup(@Optional String env_url){
        String url = ConfigurationReader.getProperty("url");
        if(env_url != null){
            url=env_url;
        }
        Driver.get().get(url);
    }

    @AfterMethod
    public void  teardown(){
        Driver.close();
    }

}
