package com.cybertek.tests.Day_10testbase_properties;

import com.cybertek.tests.base.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class SmartBearPractice_9_10_11 extends TestBase {

@BeforeMethod
public void method(){
    System.out.println("This is before method1");
}

        @Test
        public void p9_delete_order_task() throws IOException {

           /*
            Properties properties=new Properties();
            FileInputStream file=new FileInputStream("configuration.properties");
            properties.load(file);
            String url=properties.getProperty("smartbearUrl");
            properties.getProperty(url);
            */

            String returned= ConfigurationReader.getProperty("smartbearUrl");
            System.out.println("returned = " + returned);




//            System.out.println("properties.getProperty(\"smartbearUrl\") = " + properties.getProperty("smartbearUrl"));


            //Locate the checkbox for 'Mark Smith' and click to it
            Wait.Wait_Time_Method(2);
            //WebElement markSmithCheckbox = driver.findElement(By.xpath("//td[.='Mark Smith']/preceding-sibling::td[1]"));
            //WebElement markSmithCheckbox = driver.findElement(By.xpath("//td[.='Mark Smith']/../td[1]"));
            WebElement markSmithCheckbox = driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl03_OrderSelector"));
            Wait.Wait_Time_Method(2);
            markSmithCheckbox.click();
            Wait.Wait_Time_Method(2);
            //Locate 'Delete Selected' button and click to it
            WebElement deleteButton = driver.findElement(By.id("ctl00_MainContent_btnDelete"));
            deleteButton.click();
            //Assert 'Mark Smith' is not in the table

            List<WebElement> namesList = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[2]"));

            for (WebElement each : namesList) {
                //Assert.assertTrue(!each.getText().equals("Mark Smith"));
                Assert.assertFalse(each.getText().equals("Mark Smith"));
            }



        }

    }

