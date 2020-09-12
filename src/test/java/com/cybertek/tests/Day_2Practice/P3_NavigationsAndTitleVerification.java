package com.cybertek.tests.Day_2Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_NavigationsAndTitleVerification {
    String ExpectationElement="Gmail";

    //TC #3: Back and forth navigation



    //5- Go back to Google by using the .back();
    //6- Verify title equals:
    //Expected: Google

    public static void main(String[] args) {
        //setting up the browser driver
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
        P3_NavigationsAndTitleVerification object=new P3_NavigationsAndTitleVerification();

        //1- Open a chrome browser
        driver.get("https://www.Google.com");
//        driver.get("https://www.twitter.com");
        driver.manage().window().maximize();
        //3- Click to Gmail from top right.
        driver.findElement(By.linkText("Gmail")).click();

        //4- Verify title contains:
        //Expected: Gmail
        String actualTitle=driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);

        if(actualTitle.contains("Google")){
            System.out.println("Google title passed");
            if(object.ExpectationElement.equals("Gmail")){
                System.out.println("Expectation Element passed");
            }else{
                System.out.println("Expectation Element failed");
            }
        }else{
            throw new ArithmeticException("Not Matching with Expectation");
        }

               //5- Go back to Google by using the .back();
                driver.navigate().back();

        // 6 - Locate search-box and write some info to be searched
//        driver.findElement(By.id("realbox")).click();
        driver.findElement(By.name("q")).sendKeys("Uyghur"+ Keys.ENTER);
        driver.findElement(By.tagName("h3")).click();
//        System.out.println(driver.findElement(By.id("content")).getText()); ;

        WebElement webEl=driver.findElement(By.id("content"));
        String getText= webEl.getText();
        System.out.println(getText);

        // This is how you get attribute
        System.out.println(driver.findElement(By.className("noprint")).getAttribute("id"));
        WebElement getAttribute=driver.findElement(By.className("noprint"));
        String resultAttribute= getAttribute.getAttribute("id");
        System.out.println(resultAttribute);





    }
}
