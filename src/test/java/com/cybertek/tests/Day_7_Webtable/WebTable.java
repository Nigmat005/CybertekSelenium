package com.cybertek.tests.Day_7_Webtable;

import com.cybertek.tests.Day_6_DropDown.smartBearTests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebTable {

    /*
    TC#3: Smartbear software order verification1.Open browser and login to Smartbear software
    2.Click on View all orders
    3.Verify Susan McLaren has order on date “01/05/2010”
     */
   WebDriver driver;

    @BeforeMethod
   public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        smartBearTests.Login(driver);



   }

    @Test
    public void P3_Verify_susans_order_date(){


    }

}
