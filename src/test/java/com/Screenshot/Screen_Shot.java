package com.Screenshot;

import com.cybertek.utilities.WebDriverFactory;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class Screen_Shot {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://learn-automation.com/how-to-capture-screenshot-in-selenium-webdriver/");

        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            // now copy the  screenshot to desired location using copyFile //method
            FileUtils.copyFile(src, new File("C:/selenium/error.png"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}










//            @Test
//            public void TestJavaS1()
//            {
//// Open Firefox
//                WebDriver driver=new FirefoxDriver();
//
//// Maximize the window
//                driver.manage().window().maximize();
//
//// Pass the url
//                driver.get("http://www.google.com");
//
//// Take screenshot and store as a file format
//                File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//                try {
//                    // now copy the  screenshot to desired location using copyFile //method
//                    FileUtils.copyFile(src, new File("C:/selenium/error.png"));
//                }
//
//                catch (IOException e)
//                {
//                    System.out.println(e.getMessage());
//
//                }
//            }
//    }
//
//
//}
