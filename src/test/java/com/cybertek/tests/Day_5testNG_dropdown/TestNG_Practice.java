package com.cybertek.tests.Day_5testNG_dropdown;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_Practice {

    WebDriver driver;
   @BeforeClass
           public void setupMethod(){
     driver= WebDriverFactory.getDriver("chrome");

     // wait util the page is loaded for given time
// it will wait up 15 seconds. If page gets loaded before that(15 secs) process will go on!
//     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
     driver.manage().window().maximize();

   }
   @Test
    public void google1_title_verification(){

       this.driver.get("https://www.Google.com");

      // verify title
       String Expect_Title = "Google";
       Assert.assertEquals(driver.getTitle(),Expect_Title,"Title not matched");
   }

   @Test
    public void google_search_verification (){
       // go to google--> this part will be taken care of in the beforeMethod
       WebElement searchBox=driver.findElement(By.name("q"));
       searchBox.sendKeys("apple"+ Keys.ENTER);
       // make sure title contains apple
       String expectTitle = "apple";
       String actualTitle=driver.getTitle();
       Assert.assertTrue(actualTitle.contains(expectTitle),"Actual title does not contain except title");
   }
   @AfterClass
    public void AfterclassMethod(){
       try{
           Thread.sleep(3);
       }catch ( InterruptedException e){
           System.out.println(e.getMessage());
       }

       driver.close();
   }

    }

