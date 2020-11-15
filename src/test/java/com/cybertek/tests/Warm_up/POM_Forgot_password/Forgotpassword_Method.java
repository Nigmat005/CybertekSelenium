package com.cybertek.tests.Warm_up.POM_Forgot_password;

import com.cybertek.utilities.Driver;
import com.cybertek.utilities.Wait;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Forgotpassword_Method {
     ForgotPassword_PageObject forgotPassword_pageObject;
    String URL="https://qa3.vytrack.com";
      /*
    TC#35 : Vytrack forgot password page verifications à TITLE and URL
1. Go to https://qa3.vytrack.com
2. Click to “Forgot your password?” link
3. Verify title changed to expected
Expected: “Forgot Password”
4. Verify url is as expected:
Expected: “https://qa3.vytrack.com/user/reset-request”
Note: Follow Page Object Model design pattern
     */

    @Test
    public void Forgot_Password_Check(){
        forgotPassword_pageObject=new ForgotPassword_PageObject();
        String URL="https://qa3.vytrack.com";
        Driver.getDriver().get(URL);
        forgotPassword_pageObject.Forgotpassword_click.click();
        String Expect = "Forgot Password";
        if (Expect.equals(Driver.getDriver().getTitle())){
            System.out.println("Verification Passed");
        }else{
            System.out.println("Verification Failed");
        }

        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
        Assert.assertTrue(wait.until(ExpectedConditions.urlMatches("https://qa3.vytrack.com/user/reset-request")),"The url is not matching");

    }
    @Test(description = "Use negative scenario to check error message")
    public void Check_errorMessage(){
      forgotPassword_pageObject=new ForgotPassword_PageObject();
      Driver.getDriver().get(URL);

        Wait.Wait_Time_Method(1);
      forgotPassword_pageObject.Forgotpassword_click.click();

      Wait.Wait_Time_Method(1);
      forgotPassword_pageObject.ForgotPassword_Blank.sendKeys("shfahfa"+ Keys.ENTER);

      WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
     WebElement errorPopout=wait.until(ExpectedConditions.visibilityOf(forgotPassword_pageObject.Error_Message));

     Assert.assertTrue(errorPopout.isDisplayed(),"The Error message is not showing, verification failed");

    }
}
