package com.cybertek.tests.Day_6_DropDown;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class smartBearTests {
    /*
    TC #1: Smartbear software link verification1.Open browser
    2.Go to website: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
    3.Enter username: “Tester”
    4.Enter password: “test”
    5.Click to Login button
    6.Print out count of all the links on landing page
    7.Print out each link text on this page
     */
  WebDriver  driver;


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

    @BeforeMethod
    public void setupMethod(){
      driver= WebDriverFactory.getDriver("chrome");
      driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
    @Test
    public void Link_verification(){
        //3.Enter username: “Tester”
        WebElement username=driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
      username.sendKeys("Tester");
        // 4.Enter password: “test”
        WebElement password=driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        password.sendKeys("test");
        //  5.Click to Login button
        WebElement Login_Button=driver.findElement(By.xpath("//input[@type='submit']"));
        Login_Button.click();

        //  6.Print out count of all the links on landing page
       // Need to use // body//a --> returns all a inside of body
        List<WebElement> count_links=driver.findElements(By.xpath("//body//a"));
        System.out.println(count_links.size());

        // 7.Print out each link text on this page

        for(WebElement eachLink_Text:count_links){
            String text=eachLink_Text.getText();
            System.out.println(text);
        }

    }
}
