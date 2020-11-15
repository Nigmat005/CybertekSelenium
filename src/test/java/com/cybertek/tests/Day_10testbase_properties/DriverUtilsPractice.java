package com.cybertek.tests.Day_10testbase_properties;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DriverUtilsPractice {
    @Test
    public void simple_google_search_test(){
       // From now on we will call the driver--> Deiver.getDriver();
        Driver.closeDriver();
        Driver.getDriver().get("https://www.google.com");

        WebElement searchBox =Driver.getDriver().findElement(By.name("q"));

        String search= ConfigurationReader.getProperty("search");

        searchBox.sendKeys(search+ Keys.ENTER);

        System.out.println(Driver.getDriver().getClass());
        System.out.println(Driver.getDriver().getClass().getName());

//        searchBox.sendKeys("wooden spoon"+ Keys.ENTER);

        // expected
        String expectedTitle="uyghur - Google 搜索";
        String Actual=Driver.getDriver().getTitle();
        Assert.assertTrue(expectedTitle.equals(Actual));
    }
}
