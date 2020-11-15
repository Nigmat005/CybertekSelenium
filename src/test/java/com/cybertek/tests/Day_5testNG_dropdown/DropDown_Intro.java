package com.cybertek.tests.Day_5testNG_dropdown;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DropDown_Intro {
    /*
      //TC#1: Verifying “Simple dropdown” and “State selection” dropdown default values
        //1. Open Chrome browser
        //2. Go to http://practice.cybertekschool.com/dropdown
        //3. Verify “Simple dropdown” default selected value is correct
        //Expected: “Please select an option”
        //4. Verify “State selection” default selected value is correct
        //Expected: “Select a State”
     */
WebDriver driver;
    @BeforeClass
public void Beforeclass(){
    driver= WebDriverFactory.getDriver("chrome");
    driver.get("http://practice.cybertekschool.com/dropdown");
}
    @Test
    public void DropDown_test1() throws InterruptedException{
        Select simpleDropdown =new Select(driver.findElement(By.id("dropdown")));
//        return type is WebElement
        String actualSelectedOption=simpleDropdown.getFirstSelectedOption().getText();
        String expectedSelectedOption="Please select an option";
        Assert.assertTrue(actualSelectedOption.equals(expectedSelectedOption),"Expect VS Actual failed");
         Thread.sleep(2000);
         simpleDropdown.selectByVisibleText("Option 2");

        //4. Verify “State selection” default selected value is correct

    }
}
