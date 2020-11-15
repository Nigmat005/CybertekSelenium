package com.cybertek.tests.Day_4_findElements_checkboxes_radio;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P2_MerriamWebster_Links {
   /*
    TC #0: FINDELEMENTS
1. Open Chrome browser
2. Go to https://www.merriam-webster.com/
            3. Print out the texts of all links
4. Print out how many link is missing text
5. Print out how many link has text
6. Print out how many total link

    */
   public static void main(String[] args) {
       WebDriver driver= WebDriverFactory.getDriver("chrome");
           driver.get("https://www.merriam-webster.com/");

           // find all links
       List<WebElement>listElement=driver.findElements(By.xpath("//body//a"));

//       3. Print out the texts of all links
       for(WebElement eachLink:listElement){
           System.out.println(eachLink.getText());
       }


    //   4 and 5. Print out how many link is missing text,  Print out how many link has text
     int missing_text=0;
     int has_text=0;
       for(WebElement eachLinks:listElement){
           String textof_Link=eachLinks.getText();
           System.out.println(textof_Link);
           if (textof_Link.isEmpty()){
              missing_text++;
       }else {
           has_text++;
       }

       } System.out.println("missing_text = " + missing_text);
         System.out.println("has_text = " + has_text);



         //6. Print out how many total link
       int totalLinks=0;
       System.out.println("listElement = " + listElement.size());



   }
}
