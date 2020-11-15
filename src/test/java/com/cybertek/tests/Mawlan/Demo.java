package com.cybertek.tests.Mawlan;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://qa2.vytrack.com/user/login");
        driver.manage().window().maximize();
        driver.findElement(By.name("_username")).sendKeys("user180");
        driver.findElement(By.name("_password")).sendKeys("UserUser123" + Keys.ENTER);
        WebElement fleet = driver.findElement(By.xpath("//span[.='\n" +
                "    Fleet']"));
        fleet.click();
        Thread.sleep(5000);
        WebElement vehiclesOdometerModule = driver.findElement(By.xpath("//span[.='Vehicle Odometer']"));
        vehiclesOdometerModule.click();
        Thread.sleep(7000);

        // Table Handling
        WebElement Table=driver.findElement(By.xpath("//table[@class='grid table-hover table table-bordered table-condensed']"));

        // Table_Row Handling
        List<WebElement> Table_row=Table.findElements(By.xpath("//tr[@class='grid-row row-click-action']"));

        // Table_Data Handling
        for(int i=0;i<Table_row.size();i++){
          List <WebElement>Table_Data= Table_row.get(i).findElements(By.xpath("(//td[4])"));
//          WebElement Table_Data= Table_row.get(i).findElement(By.xpath("//tr[@class='grid-row row-click-action']//td[4]"));
          for(int j=0;j<Table_Data.size();j++){
//             Table_Data.get(j).click();
              System.out.println(Table_Data.get(j).getText());
//              if(driver.findElement(By.xpath("//a[@class='btn icons-holder-text no-hash']")).isDisplayed()){
//                  System.out.println("Element exist");
//
//              }else{
//                  System.out.println("No such Element founded");
//          } Thread.sleep(2000);
//              driver.navigate().back();

//              if (driver.getTitle().equals("Vehicle Odometer - Entities - System - Car - Entities - System")){
//                  System.out.println("Successfully going back");
//              }else{
//                  System.out.println("Double check your code");
//              }


        }


        }

//        Thread.sleep(1000);
//        driver.navigate().refresh();
//        Thread.sleep(1000);
//
//
//        String Title=driver.getTitle();
//        System.out.println(Title);

        
  }
}
