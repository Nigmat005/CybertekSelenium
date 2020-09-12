package com.cybertek.tests.Warm_up;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CybertekURLVerrification {

    public static void main(String[] args) throws InterruptedException {
        // Setup my browser driver

      WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();


            driver.get("http://practice.Cybertekschool.com");
            String getCurrentUrl= driver.getCurrentUrl();
            System.out.println("getCurrentUrl = " + getCurrentUrl);
            try{
                if(getCurrentUrl.contains("cybertekschool")){
                    System.out.println("Same");
                    driver.manage().window().maximize();
                }
            }catch (Exception e){
                System.out.println("\"This is not right\" = " + "This is not right");
            }finally {
                String getSource=driver.getPageSource();
                System.out.println("getSource = " + getSource);
                Thread.sleep(5000);
                driver.close();

        }
    }
}
