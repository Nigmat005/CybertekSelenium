package com.cybertek.tests.Day_13_POM_synchronization;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import com.cybertek.utilities.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeLogin_Test {
    Negative_Login_Page login_page;
    @Test(description = "Entering Incorrect Credential")
    public void negative_login_test1(){
    String URL= ConfigurationReader.getProperty("smartbearUrl");
    Driver.getDriver().get(URL);

    login_page=new Negative_Login_Page();

        Wait.Wait_Time_Method(1);
    login_page.UserName.sendKeys("User");

    Wait.Wait_Time_Method(1);
  login_page.PassWord.sendKeys("gigf");

    Wait.Wait_Time_Method(1);
    login_page.Login_button.click();

        Assert.assertTrue(login_page.Error_sign.isDisplayed());


}
@Test(description = "using login method for negative test")
    public void negative_login_test2(){
    Driver.getDriver().get(ConfigurationReader.getProperty("smartbearUrl"));
        login_page=new Negative_Login_Page();

        Wait.Wait_Time_Method(1);

        login_page.UserName.sendKeys(ConfigurationReader.getProperty("UserName"));

        Wait.Wait_Time_Method(1);

        login_page.PassWord.sendKeys(ConfigurationReader.getProperty("PassWord"));

         Wait.Wait_Time_Method(1);

        login_page.Login_button.click();

        Assert.assertTrue(login_page.Error_sign.isDisplayed(),"Error Sign is not shown,verification failed");

    }
}
