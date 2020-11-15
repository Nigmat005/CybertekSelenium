package com.cybertek.tests.Day_4_findElements_checkboxes_radio;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Delete_Button {
    public static void main(String[] args) {
        /*
        TC #3: PracticeCybertek.com_AddRemoveElements WebElement verification
1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/add_remove_elements
3. Click to “Add Element” button 50 times
4. Verify 50 “Delete” button is displayed after clicking.
5. Click to ALL “Delete” buttons to delete them.
6. Verify “Delete” button is NOT displayed after clicking.
USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
         */
       // 1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        //2. Go to http://practice.cybertekschool.com/add_remove_elements
        driver.get("http://practice.cybertekschool.com");
        //3. Click to “Add Element” button 50 times
        boolean add_delete=driver.findElement(By.xpath("//li[@class='list-group-item'][2]")).isDisplayed();
        System.out.println("add_delete = " + add_delete);
        WebElement add_deleteELement=driver.findElement(By.xpath("//li[@class='list-group-item'][2]/a"));
        add_deleteELement.click();

        WebElement ADD_Element=driver.findElement(By.xpath("//div[@class='example']/button"));
        int count = 0;
        for(int i=0;i<50;i++){
          ADD_Element.click();
          count++;
        }
        String result=(count==50)?"You have clicked \" ADD ELEMENT Button 50 times\"": "Not enough time";
        System.out.println(result);




        //4. Verify 50 “Delete” button is displayed after clicking.
        List<WebElement> Delete_button = driver.findElements(By.xpath("//div[@id='elements']/button"));
       int count_deleteButton=0;
        for(WebElement eachButton:Delete_button){
            if(eachButton.isDisplayed()){
               count_deleteButton+=1;
            }else{
                throw new RuntimeException("No such element grabbed ");
            }
        }
        System.out.println("The delete button is displayed:"+count_deleteButton);

//         5. Click to ALL “Delete” buttons to delete them.
        for(WebElement eachButton:Delete_button){
            eachButton.click();
        }
        //6. Verify “Delete” button is NOT displayed after clicking.

       String db=driver.findElement(By.xpath("//body")).getText();
       if(db.contains("delete")){
           System.out.println("No");
       }else{
           System.out.println("Yes");
       }




    }
}
