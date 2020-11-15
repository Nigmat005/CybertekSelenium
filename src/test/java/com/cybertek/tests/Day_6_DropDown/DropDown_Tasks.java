package com.cybertek.tests.Day_6_DropDown;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropDown_Tasks {
    WebDriver driver;
    @BeforeMethod
public void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @Test
    public void test2_verify_state_dropdown() throws InterruptedException {
        WebElement State_Selection= driver.findElement(By.id("state"));


        Select Select_State= new Select(State_Selection);


        Thread.sleep(1000);
        System.out.println(Select_State.getFirstSelectedOption());
        Select_State.selectByVisibleText("Illinois");
        String  if_illinois=Select_State.getFirstSelectedOption().getText();
        System.out.println(if_illinois);



        Thread.sleep(1000);
        Select_State.selectByValue("CA");

        Thread.sleep(1000);
         Select_State.selectByIndex(1);
         String if_AL= Select_State.getFirstSelectedOption().getText();

        System.out.println(if_AL);

        List<WebElement> All_options= Select_State.getOptions();

        for (WebElement each_Option:All_options){
            System.out.println(each_Option.isSelected());
        }

    }

    @Test

    public void Dropdown_List(){
        driver.findElement(By.xpath("//div[@class='dropdown']/a")).click();

        // Going to FaceBook
        driver.findElement(By.xpath("")).click();

    }


}
