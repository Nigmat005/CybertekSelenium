package com.cybertek.ProjectAC5;

import com.cybertek.utilities.Wait;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Bitrix_Project_AC_8 {
WebDriver driver;
    @BeforeMethod
    public void setUp() {
//        WebDriverManager.chromedriver().setup();
//        driver=new ChromeDriver();
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        Wait.Wait_Time_Method(driver,10);
        driver.get(" https://login.nextbasecrm.com");
        driver.findElement(By.xpath("//input[@name='USER_LOGIN']")).sendKeys("helpdesk30@cybertekschool.com");
        Wait.Wait_Time_Method(1);
        driver.findElement(By.xpath("//input[@name='USER_PASSWORD']")).sendKeys("UserUser");
        Wait.Wait_Time_Method(1);
        driver.findElement(By.xpath("//input[@type='submit']")).click();

    }
    @Test
    public void Assign_Task(){
        // Locating "Tasks"
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         Wait.Wait_Time_Method(1);
        driver.findElement(By.xpath("(//span[@class='menu-item-link-text'])[2]")).click();

        // "New Task"
        Wait.Wait_Time_Method(1);
        driver.findElement(By.xpath("//a[@id='tasks-buttonAdd']")).click();

        // Locating "Add More"

//        driver.findElement(By.xpath("(//a[@href='javascript:void(0);'])[2]")).click();
//        Wait.Wait_Time_Method(1);
//        String GetText=driver.findElement(By.xpath("(//a[@class='js-id-tdp-mem-sel-is-open-form task-form-field-when-filled task-form-field-link add'])[1]")).getText();
        Wait.Wait_Time_Method(1);
        driver.navigate().refresh();

    }
@Test
    public void Add_more(){
//    WebDriver Driver1=driver.switchTo().frame("iframe_6w1isen9lz");
    WebDriver Driver1=driver.switchTo().frame(4);


    WebElement element =Driver1.findElement(By.xpath("(//a[@class='js-id-tdp-mem-sel-is-open-form task-form-field-when-filled task-form-field-link add'])[1]"));
    element.click();
//    Assert.assertTrue(element.isDisplayed());
}

}
