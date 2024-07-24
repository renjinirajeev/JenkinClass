package com.automation.Test;

import com.automation.Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest{

    //LoginPage loginPage = new LoginPage();

    @Test
    public void doOpenWebsite(){
        loginPage.openWebsite();
        Assert.assertTrue(loginPage.isHomePageDisplayed());
    }

}
