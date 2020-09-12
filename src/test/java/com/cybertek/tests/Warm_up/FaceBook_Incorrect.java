package com.cybertek.tests.Warm_up;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook_Incorrect {
//   * TC #2: Facebook incorrect login title verification
//* 1.Open Chrome browser
//* 2.Go to https://www.facebook.com
//* 3.Enter incorrect username
//* 4.Enter incorrect password
//* 5.
//    Verify title changed to: Expected: “
//    Log into Facebook | Facebook”•Create new classfor each task.•There are some tipsin the 2ndpagefor whoever needs it. •Please try to solve yourself first before moving to the tips
//*


    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        //* 1.Open Chrome browser
        WebDriver driver=new ChromeDriver();
        //* 2.Go to https://www.facebook.com

        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();

        //* 3.Enter incorrect username

//        driver.findElement(By.name("邮箱或手机号")).click();
        driver.findElement(By.id("email")).sendKeys("wrong Username");//+ Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.id("pass")).sendKeys("123456");
        Thread.sleep(2000);
        driver.findElement(By.name("login")).click();
        Thread.sleep(2000);
        driver.close();





    }
}
