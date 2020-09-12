package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {
        // 1-Setup the driver

        WebDriverManager.chromedriver().setup();

        // 2- Create the instance of driver

        WebDriver driver=new ChromeDriver();  // This line is opening me a browser
//        WebDriver geturl=new ChromeDriver();


        // 3- Use the drive instance to test selenium

// Method 1 .get() gives you title
        //2 .getCurrentUrl() gives you Url of current page




//       driver.get("https://www.twitter.com");
       driver.get("https://www.google.com");
        System.out.println("The title of the page is: "+driver.getTitle());

        String actualUrl=driver.getCurrentUrl();
        System.out.println(actualUrl);
        // shortcut  acrtualUrl.soutv
        Thread.sleep(2000);
        driver.navigate().back(); // equals <-sign in page
        System.out.println("actualUrl = " + actualUrl);
        Thread.sleep(2000);
        driver.navigate().to("http://www.twitter.com");


        String getsource= driver.getPageSource();
        System.out.println("getsource = " + getsource);

//        driver.close();  just closes the last opened browser



        driver.manage().window().maximize(); // 最大化窗口 works for both Mac and Windows system

        driver.quit();// closes everything all browsers

    }
}
