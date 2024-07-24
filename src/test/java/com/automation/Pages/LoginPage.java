package com.automation.Pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Random;

public class LoginPage extends BasePage{

    @FindBy(id="j_username")
    WebElement username;

    @FindBy(id="j_password")
    WebElement password;

    @FindBy(xpath="//button[@name='Submit']")
    WebElement submitBtn;

    @FindBy(id="jenkins-head-icon")
    WebElement jenkinIcon;

    @FindBy(xpath = "//span[@class='task-link-text' and text()='New Item']")
    WebElement NewItem;

    @FindBy(id="name")
    WebElement projectName;


    public void openWebsite(){
        driver.get("http://localhost:8080/");
        username.sendKeys(ConfigReader.getConfigProperty("user.name"));
        password.sendKeys(ConfigReader.getConfigProperty("pass.word"));
        submitBtn.click();
    }

    public boolean isHomePageDisplayed(){
        return jenkinIcon.isDisplayed();
    }

    public void createNewProject(){
        NewItem.click();

        Random rand = new Random();
        String s= String.valueOf(rand.nextInt(1,100));
        String currentProjName = ConfigReader.getConfigProperty("Project.Name");
        currentProjName+=s;
        projectName.sendKeys();
    }

}
