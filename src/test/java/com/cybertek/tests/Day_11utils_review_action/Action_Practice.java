package com.cybertek.tests.Day_11utils_review_action;

import com.cybertek.utilities.Driver;
import com.cybertek.utilities.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Action_Practice {
/*
    TC #15: Hover Test
    1. Go to http://practice.cybertekschool.com/hovers
    2. Hover over to first image
    3. Assert:
        a. "name: user1" is displayed
    4. Hover over to second image
    5. Assert:
        a. "name: user2" is displayed
    6. Hover over to third image
    7. Confirm:
        a. "name: user3" is displayed
     */



    @Test
    public void hover_over_test(){


        Driver.getDriver().get("http://practice.cybertekschool.com/hovers");
//        WebElement get_Img1=Driver.getDriver().findElement(By.xpath("(//div[@class=‘figure’])[1]"));
//        WebElement get_Img2=Driver.getDriver().findElement(By.xpath("(//div[@class=‘figure’])[2]"));
//        WebElement get_Img3=Driver.getDriver().findElement(By.xpath("(//div[@class=‘figure’])[3]"));

        List<WebElement> Imgs=Driver.getDriver().findElements(By.xpath("//img[@src='/img/avatar-blank.jpg']"));

        List<WebElement> Users=Driver.getDriver().findElements(By.xpath("//h5"));

        // Create the instance of actions class, AND pass the driver instance into the constructor

        Actions action=new Actions(Driver.getDriver());

        // Use the action object, and call necessary methods


        for (int i=0;i<Imgs.size();i++) {

           for(int j=i;j<=i;j++){
               Wait.Wait_Time_Method(2);
               action.moveToElement(Imgs.get(i)).perform();
               Assert.assertTrue(Users.get(j).isDisplayed());
           }
        }







    }
}
