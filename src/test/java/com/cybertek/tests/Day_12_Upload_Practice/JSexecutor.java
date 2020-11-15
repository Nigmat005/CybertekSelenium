package com.cybertek.tests.Day_12_Upload_Practice;

import com.cybertek.utilities.Driver;
import com.cybertek.utilities.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JSexecutor {
    @Test

    public void scroll_using_jsexecutor(){
        // Get the page to scroll
        Driver.getDriver().get("http://practice.cybertekschool.com/infinite_scroll");

        // Create instance of JSExecutor and cast our driver type to it

        JavascriptExecutor JSE= (JavascriptExecutor) Driver.getDriver();
        Wait.Wait_Time_Method(1);
        JSE.executeScript("window.scrollBy(0,500)");
        for (int i = 0; i <10 ; i++) {

            Wait.Wait_Time_Method(1);
            JSE.executeScript("window.scrollBy(0,500)");


        }

    }

    @Test
    public void scroll_using_jsexecutor_2(){

        // get the page to scroll
        Driver.getDriver().get("http://practice.cybertekschool.com/large");

        WebElement Home=Driver.getDriver().findElement(By.linkText("Home"));

        WebElement link= Driver.getDriver().findElement(By.linkText("Cybertek School"));


        // Use java script to scroll "Cybertek School" link intoView

        JavascriptExecutor JSE= (JavascriptExecutor)Driver.getDriver();

        // use the scrollIntoView function from JavaScript to scroll to a specific web element
        Wait.Wait_Time_Method(2);
        JSE.executeScript("arguments[0].scrollIntoView(true)",Home,link); // [num] always has sth to do with index inside of the parenthesis(will stop at "Home")


    }

}
