package com.cybertek.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SmartBear_Loggin {
    public static void Login(WebDriver Driver){

        Driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        Driver.manage().window().maximize();
        Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement username=Driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        username.sendKeys("Tester");

        WebElement password=Driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        password.sendKeys("test");

        WebElement Login_Button=Driver.findElement(By.xpath("//input[@type='submit']"));
        Login_Button.click();

    }
}
