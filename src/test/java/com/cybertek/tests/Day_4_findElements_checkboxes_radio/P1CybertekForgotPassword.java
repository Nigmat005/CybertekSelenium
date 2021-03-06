package com.cybertek.tests.Day_4_findElements_checkboxes_radio;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P1CybertekForgotPassword {
    public static void main(String[] args) {
       /*
        TC #1: PracticeCybertek.com_ForgotPassword WebElement verification
        1. Open Chrome browser
        2. Go to http://practice.cybertekschool.com/forgot_password
        3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
        a. “Home” link
        b. “Forgot password” header
        c. “E-mail” text
        d. E-mail input box
        e. “Retrieve password” button
        f. “Powered by Cybertek School” text
        4. Verify all WebElements are displayed.
                Better if you do with both XPATH and javax.swing.text.html.CSS selector for practice purpose

        */
        WebDriver driver= WebDriverFactory.getDriver("chrome");
      driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement Cybertek= driver.findElement(By.xpath("//div[@ style='text-align: center;']"));
        String Actual_Text=Cybertek.getText();
        System.out.println("Actual_Text = " + Actual_Text);
        System.out.println(Cybertek.isDisplayed());
        List<WebElement>listElement=driver.findElements(By.xpath("//body//a"));

        for(WebElement eachLink:listElement){
            System.out.println(eachLink.getText());
        }



    }
}
