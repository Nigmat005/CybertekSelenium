package com.cybertek.Pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPage {
    public LoginPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id="ctl00_MainContent_username")
    public WebElement Username;
}


class test{
   @Test
    public void test_Login(){
       LoginPage loginPage=new LoginPage();
       loginPage.Username.click();
   }



}