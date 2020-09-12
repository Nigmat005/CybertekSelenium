package com.cybertek.tests.Warm_up;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
/*
* TC #1: Facebook title verification
* 1.Open Chrome browser
* 2.Go to https://www.facebook.com
* 3.Verify title: Expected: “Facebook -Log In or Sign Up”
*
* TC #2: Facebook incorrect login title verification
* 1.Open Chrome browser
* 2.Go to https://www.facebook.com
* 3.Enter incorrect username
* 4.Enter incorrect password
* 5.Verify title changed to: Expected: “Log into Facebook | Facebook”•Create new classfor each task.•There are some tipsin the 2ndpagefor whoever needs it. •Please try to solve yourself first before moving to the tips
*
*
* */

    public static void main(String[] args) {
        // setup your web browser
        WebDriverManager.chromedriver().setup();
        //1.Open Chrome browser
        WebDriver driver=new ChromeDriver();
        

//        2.Go to https://www.facebook.com
        driver.get("https://www.facebook.com");
        String Expectedtitle="Facebook - 登录或注册";
//        * 3. Verify title: Expected: “Facebook -Log In or Sign Up”
       String Actualtitle= driver.getTitle();
        System.out.println("Actualtitle = " + Actualtitle);
//        if(Expectedtitle.equals(Actualtitle)){
//            System.out.println("Title Done");
//        }else{
//            System.out.println("Title unmatched ");
//        }
        String result=(Expectedtitle.equals(Actualtitle))? "Title Done":"Title unmatched ";
        System.out.println(result);


//        driver.navigate().forward();



    }
}
