package com.cybertek.tests.base;

import com.cybertek.utilities.SmartBear_Loggin;
import com.cybertek.utilities.Wait;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    protected WebDriver driver;
@BeforeMethod
    public void setup_Method(){
    driver= WebDriverFactory.getDriver("chrome");
    SmartBear_Loggin.Login(driver);
    driver.manage().window().maximize();
    Wait.Wait_Time_Method(driver,10);
    System.out.println("This is before method2");
}
@AfterMethod
    public void tearDown(){
    driver.close();
}

}
