package com.cybertek.tests.Warm_up;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Tc_1 {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();

        WebDriver driver=new EdgeDriver();


        driver.get("https://www.google.com");

        String getTitle= driver.getTitle();
        System.out.println("getTitle = " + getTitle);
        try{
            if(getTitle.equals("Google")){
                driver.manage().window().maximize();
                System.out.println("Done");
            }
        }catch (Exception e){
            System.out.println("Tittle is not as same as expectation");
        }finally{
           Thread.sleep(5000);
            driver.close();
        }

    }


}
