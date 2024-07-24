package com.automation.Test;

import com.automation.Pages.LoginPage;
import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    LoginPage loginPage;

    @BeforeMethod
    public void setUp(){
        DriverManger.createDriver();
        ConfigReader.initConfig();
        loginPage=new LoginPage();
    }

    @AfterMethod
    public void tearDown(){
//        DriverManger.getDriver().quit();
    }
}
