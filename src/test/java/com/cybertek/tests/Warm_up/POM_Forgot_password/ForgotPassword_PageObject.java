package com.cybertek.tests.Warm_up.POM_Forgot_password;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPassword_PageObject {
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

    ForgotPassword_PageObject(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
   @FindBy(xpath ="//a[.='Forgot your password?']")
    public WebElement Forgotpassword_click;

    @FindBy(id="prependedInput")
    public WebElement ForgotPassword_Blank;

    @FindBy(xpath = "//div[@class='alert alert-error']")
    public WebElement Error_Message;
}
