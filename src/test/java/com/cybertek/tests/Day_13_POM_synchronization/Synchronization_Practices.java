package com.cybertek.tests.Day_13_POM_synchronization;

import com.cybertek.Pages.Loading7Page;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Synchronization_Practices {
    /*
    TC#40 : Dynamically Loaded Page Elements 7
1. Go to http://practice.cybertekschool.com/dynamic_loading/7
2. Wait until title is “Dynamic Title”
3. Assert : Message “Done” is displayed.
4. Assert : Image is displayed.
Note: Follow POM
     */
@Test (description = "Looking for done message using explicit wait")
    public void check_using_explictWait(){
    Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/7");

    Loading7Page loading7Page=new Loading7Page();

    // Creating the instance of explicit wait
    WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);

    // setup condition using wait method
//    wait.until(ExpectedConditions.titleIs("Dynamic title"));

    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("alert")));

    Assert.assertTrue(loading7Page.doneMessage.isDisplayed(),"WebElement being searched is not shown or found,Verification failed");






}




}

class test{
   public boolean method(String st1,String st2){
      return  (st1.equals(st1));
     
   }
    public static void main(String[] args) {

    }
}