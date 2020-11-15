package com.cybertek.tests.Day_8_alerts_iframes_windows;

import com.cybertek.utilities.Wait;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Alert_Practices {
   WebDriver driver;
    @BeforeMethod
    public void setUp() {
//        WebDriverManager.chromedriver().setup();
//        driver=new ChromeDriver();
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        Wait.Wait_Time_Method(driver,10);
        driver.get("  http://practice.cybertekschool.com/javascript_alerts");

    }
    /*
    TC #1: Information alert practice
1. Open browser
2. Go to website: http://practice.cybertekschool.com/javascript_alerts
3. Click to “Click for JS Alert” button
4. Click to OK button from the alert
5. Verify “You successfuly clicked an alert” text is displayed.
     */

    @Test
    public void p1_information_alert_practice(){
        WebElement warningAlertButton= driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        warningAlertButton.click();
        // Creating Alert instance
        Alert alert=driver.switchTo().alert();

        // use "alter" instance to accept the javascript alter(pop up)
        Wait.Wait_Time_Method(2);
        alert.accept();

        WebElement Text=driver.findElement(By.xpath("//p[@id='result']"));
        String Result=Text.getText();
        System.out.println("Result = " + Result);

        Assert.assertTrue(Text.isDisplayed(),"Result text is not displayed");
    }

    @Test
    public void p2_confirmation_alert_practice(){
        WebElement warningAlertButton=driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
        warningAlertButton.click();
        // Creating Alert instance
       Alert alert=driver.switchTo().alert();
       // Scenario 1 accept it
        Wait.Wait_Time_Method(2);
        alert.accept();
        WebElement Text=driver.findElement(By.xpath("//p[@id='result']"));
        String Result=Text.getText();
        System.out.println("Result = " + Result);

        Assert.assertTrue(Text.isDisplayed(),"Result text is not displayed");

        // Scenario 2 dismiss it
        warningAlertButton.click();
        Wait.Wait_Time_Method(2);
        alert.dismiss();
        WebElement Cancel_Text=driver.findElement(By.xpath("//p[@id='result']"));
        String Result_cancle=Text.getText();
        System.out.println("Result_cancle = " + Result_cancle);

        Assert.assertTrue(Cancel_Text.isDisplayed(),"Result text is not displayed");


    }


}
