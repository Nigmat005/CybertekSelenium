package com.cybertek.tests.Day_5testNG_dropdown;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class P1_Selenium_practiceTask {

    public static void main(String[] args) {
        //TC #2: SeleniumEasy Checkbox Verification – Section 1
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //2. Go to https://www.seleniumeasy.com/test/basic-checkbox-demo.html
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.close();
        //3. Verify “Success – Check box is checked” message is NOT displayed.
        //4. Click to checkbox under “Single Checkbox Demo” section
        //5. Verify “Success – Check box is checked” message is displayed.
    }
}
