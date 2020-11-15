package com.cybertek.tests.Day_13_POM_synchronization;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Negative_Login_Page {
    public Negative_Login_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
//        String URL=ConfigurationReader.getProperty("smartbearUrl");
//        Driver.getDriver().get(URL);

    }


    @FindBy(id="ctl00_MainContent_username")
    public WebElement UserName;

    @FindBy(id="ctl00_MainContent_password")
    public WebElement PassWord;

    @FindBy(id="ctl00_MainContent_login_button")
    public WebElement Login_button;

    @FindBy(id="ctl00_MainContent_status")
    public WebElement Error_sign;


}

