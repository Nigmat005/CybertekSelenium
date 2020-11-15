package com.cybertek.tests.Day_4_findElements_checkboxes_radio;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P3_Checkbox_Practice {

    //Practice: Cybertek Checkboxes
    //1. Go to http://practice.cybertekschool.com/checkboxes


    //2. Confirm checkbox #1 is NOT selected by default
    //3. Confirm checkbox #2 is SELECTED by default.
    //4. Click checkbox #1 to select it.
    //5. Click checkbox #2 to deselect it.
    //6. Confirm checkbox #1 is SELECTED.
    //7. Confirm checkbox #2 is NOT selected.


    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/checkboxes");

        WebElement checkBox1=driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
        WebElement checkBox2=driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));
        //3. Confirm checkbox #2 is SELECTED by default.
        if(!checkBox1.isSelected()){
            System.out.println("Checkbox1 is not selected. Verification is passed");
        }else {
            System.out.println("Checkbox1 is selected. Verification is failed");
        }
        if (checkBox2.isSelected()){
            System.out.println("Checkbox2 is selected. Verification is passed");
        }else {
            System.out.println("Checkbox2 is not selected. Verification is failed");
        }

        //4. Click checkbox #1 to select it.
        checkBox1.click();
        //5. Click checkbox #2 to deselect it.
        checkBox2.click();
    }
}
