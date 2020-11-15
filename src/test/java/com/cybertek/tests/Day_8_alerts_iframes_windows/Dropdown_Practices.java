package com.cybertek.tests.Day_8_alerts_iframes_windows;

import com.cybertek.utilities.Wait;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.LocalDateTime;
import java.util.List;

public class Dropdown_Practices {
  static WebDriver driver;
    @BeforeMethod
    public void setUp() {
//        WebDriverManager.chromedriver().setup();
//        driver=new ChromeDriver();
        driver=WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        Wait.Wait_Time_Method(driver,10);
        driver.get(" http://practice.cybertekschool.com/dropdown");

    }

    @Test
    public void p7_month_dropdown_default_value_test(){
      // Locating the month dropdown
        WebElement Month_dropdown= driver.findElement(By.xpath("//select[@id='month']"));
        Select select=new Select( Month_dropdown);
       // Excepted
        String expectValue= LocalDateTime.now().getMonth().name().toLowerCase();
        System.out.println("expectValue = " + expectValue);

        // Actual
        String actual_Value=select.getFirstSelectedOption().getText().toLowerCase();
        System.out.println(actual_Value);
        Assert.assertTrue(expectValue.equals(actual_Value));
       // Task 8
        List<WebElement> monthOption=Month_dropdown.findElements(By.tagName("option"));

       monthOption.forEach((e)-> {System.out.println(e.getText());});
        System.out.println(monthOption.size());


    }


}
