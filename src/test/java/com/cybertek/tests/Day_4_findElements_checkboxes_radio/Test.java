package com.cybertek.tests.Day_4_findElements_checkboxes_radio;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        //Given VyTrack application URL"https://qa2.vytrack.com/user/login"
        driver.get("https://qa2.vytrack.com/user/login");
        //When i provide username "user164"  as a track diver
        driver.findElement(By.id("prependedInput")).sendKeys("user180");
        //And password "UserUser123"
        //And click the "Login Button"
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123"+ Keys.ENTER);
        //Then I should be able to see Vytrack application home page
        //And click the "Fleet" modul
        Thread.sleep(2000);
        WebElement fleetModule = driver.findElement(By.linkText("Fleet"));
        fleetModule.click();
        //And click the "Vehicle Odometer"
        Thread.sleep(4000);
        WebElement fleetVehiclesOdometerModule=driver.findElement(By.xpath("//span[.='Vehicle Odometer']"));
        fleetVehiclesOdometerModule.click();
        Thread.sleep(3000);
        String actualResultForOdometerInformationOnTheGrid=driver.findElement(By.xpath("//h1[@class='oro-subtitle']")).getText();
        String expectedResultForOdometerInformationOnTheGrid="Vehicles Odometers";
        if (actualResultForOdometerInformationOnTheGrid.equals(expectedResultForOdometerInformationOnTheGrid)) {
            System.out.println("Tuck driver can see the Vehicles Odometers grid verification PASS ");
        }else{
            System.out.println("Tuck driver can see the Vehicles Odometers grid verification FAILED!!!!!! ");
        }
        driver.navigate().back();
        WebElement fleetVehiclesOdometerModule2=driver.findElement(By.xpath("//span[.='Vehicle Odometer']"));
        fleetVehiclesOdometerModule.click();
        Thread.sleep(3000);
        WebElement createVehicleOdometerButton=driver.findElement(By.xpath("//a[@class='btn main-group btn-primary pull-right ']"));
        createVehicleOdometerButton.click();
        Thread.sleep(3000);
        WebElement odometerValue=driver.findElement(By.xpath("//*[@id=custom_entity_type_OdometerValue-uid-5f5d956678e63]"));
        odometerValue.sendKeys("10000");
        Thread.sleep(3000);
        WebElement date=driver.findElement(By.xpath("//*[@id='date_selector_custom_entity_type_Date-uid-5f5d956678f6a']"));
        date.click();
        Thread.sleep(3000);
        WebElement today=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/button[1]"));
        today.click();
        Thread.sleep(3000);
        WebElement driverButton= driver.findElement(By.xpath("//*[@id='custom_entity_type_Driver-uid-5f5d956679085']"));
        driverButton.sendKeys("Muhtar");
        Thread.sleep(3000);
        WebElement unitButton=driver.findElement(By.xpath("//*[@id='s2id_custom_entity_type_Units-uid-5f5d9566791ec']/a/span[1]"));
        unitButton.click();
        Thread.sleep(3000);
        String s = "''";
        WebElement model= driver.findElement(By.xpath("//*[@id=" + s + "select2-drop']/ul[2]/li[1]/div"));
        model.click();
        Thread.sleep(3000);
        WebElement modelInput=driver.findElement(By.xpath("//*[@id=" + s + "select2-drop']/div/input"));
        modelInput.sendKeys("2016");
        Thread.sleep(3000);
        WebElement saveAndCloseButton=driver.findElement(By.xpath("//*[@id=" + s + "custom_entity_type-uid-5f5d956679afb']/div[1]/div/div/div[2]/div[1]/div[2]/div/button"));
        saveAndCloseButton.click();
        Thread.sleep(3000);
        String actualTitleForOdo=driver.getTitle();
        String expectedTitleForOdo="1653 - Vehicle Odometer - Entities - System - Car - Entities - System";
        if (actualTitleForOdo.equals(expectedTitleForOdo)){
            System.out.println("Truck driver can create vehicle odometer information verification PASS");
        }else {
            System.out.println("Truck driver can create vehicle odometer information verification FAILED!!!!!!!");
        }
        ////h1[@class='oro-subtitle']
        // 1. Verify that truck driver should be able to see all vehicle odometer information on the grid.
        // 2.Verify that Truck driver should be able to create Vehicle odometer or cancel it.
    }
}


