package com.cybertek.tests.Day_6_DropDown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Order_placing {
 @Test
    public void Order_placing(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver() ;
        smartBearTests.Login(driver);
    }



}


