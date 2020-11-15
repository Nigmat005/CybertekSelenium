package com.cybertek.tests.Day_8_alerts_iframes_windows;

import com.cybertek.tests.Day_6_DropDown.smartBearTests;
import com.cybertek.utilities.SmartBearUtilities;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WebTable_Practices {

    WebDriver driver;
    @BeforeMethod
    public void setUp(){
//        WebDriverManager.chromedriver().setup();
//        driver=new ChromeDriver();
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        smartBearTests.Login(driver);

    }
    @Test
    public void task4_verify_order(){
        SmartBearUtilities.verifyOrder(driver,"Mark Smith");

    }

    @Test
    public void task5_verify_name_cities(){
        SmartBearUtilities.printNamesAndCities(driver);
    }
}
