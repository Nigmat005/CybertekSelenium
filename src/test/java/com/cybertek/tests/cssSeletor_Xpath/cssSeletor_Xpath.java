package com.cybertek.tests.cssSeletor_Xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cssSeletor_Xpath {
    public static void main(String[] args) {
        WebDriver driver=WebDriverFactory.getDriver("chrome");
        driver.get("https://www.Amazon.com");
        driver.manage().window().maximize();
//<a href="/gcx/Gifts-for-Everyone/gfhz/?ref_=nav_cs_giftfinder" class="nav-a  " tabindex="0">Find a Gift</a>

        WebElement find_element=driver.findElement(By.cssSelector("a[href='/gcx/Gifts-for-Everyone/gfhz/?ref_=nav_cs_giftfinder']"));
         find_element.click();
         find_element.isDisplayed();
//   #twotabsearchtextbox
         WebElement searchbar_element= driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
//         searchbar_element.click();
         searchbar_element.sendKeys("Uyghur"+ Keys.ENTER);


    }
}
