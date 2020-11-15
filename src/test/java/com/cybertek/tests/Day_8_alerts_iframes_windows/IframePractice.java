package com.cybertek.tests.Day_8_alerts_iframes_windows;

import com.cybertek.utilities.Wait;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IframePractice {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
//        WebDriverManager.chromedriver().setup();
//        driver=new ChromeDriver();
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        Wait.Wait_Time_Method(driver,10);
        driver.get(" http://practice.cybertekschool.com/iframe");

    }
    /*
    TC #4 : Iframe practice
1. Create a new class called: IframePractice
2. Create new test and make set ups
3. Go to: http://practice.cybertekschool.com/iframe
4. Assert: “Your content goes here.” Text is displayed.
5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor
     */
@Test
    public  void p4_Iframe_practice(){
 // Locating paragraph tag as a web element
    /**
    WebElement yourContentGoesHere=driver.findElement(By.xpath("//p")); will throw NoSuchElement
     */
    // 3 ways of locating
    // 1-ByIndex
//    driver.switchTo().frame(0);
    // 2-By Id or Name
//      WebDriver Driver=driver.switchTo().frame("mce_0_ifr");
//    WebElement iframElement= Driver.findElement(By.xpath("//p[.='Your content goes here.']"));
//    String iframe=iframElement.getText();





    // 3-Locate as a web element, then switch to it
    WebElement iframElement=driver.switchTo().frame(driver.findElement(By.id("mce_0_ifr"))).findElement(By.xpath("//p[.='Your content goes here.']"));
    String iframe=iframElement.getText(); System.out.println("iframe = " + iframe);
}
}
