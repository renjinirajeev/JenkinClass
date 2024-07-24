package com.automation.Pages;

import com.automation.utils.DriverManger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    WebDriver driver;

    public BasePage() {
        this.driver = DriverManger.getDriver();
        PageFactory.initElements(driver, this);
    }
}
