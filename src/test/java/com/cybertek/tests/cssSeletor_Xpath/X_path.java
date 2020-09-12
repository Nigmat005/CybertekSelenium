package com.cybertek.tests.cssSeletor_Xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class X_path {

    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
// //*[@id="cool_button"]

//        driver.findElement(By.xpath("//*[@id='cool_button']")).click();
//        driver.findElement(By.xpath("//button[@id='disappearing_button']")).click();
      

    }


}
