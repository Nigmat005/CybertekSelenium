package com.cybertek.CybertekLinkVerification;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CybertekLinkVerification {
    public static void main(String[] args) {
//        WebDriverManager.chromedriver().setup();

        WebDriver driver=WebDriverFactory.getDriver("chrome");
//        WebDriver driver= new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/forgot_password");

        driver.manage().window().maximize();

        driver.findElement(By.name("email")).sendKeys("anyemail@domain.com");

        driver.findElement((By.id("form_submit"))).click();

        String expectedInUrl="email_sent";
        String actualUrl=driver.getCurrentUrl();

        if(actualUrl.contains(expectedInUrl)){
            System.out.println("Url_Verification PASSED");
        }else{
            System.out.println("Url_Verification FAILED");
        }


        String actualText = driver.findElement(By.name("confirmation_message")).getText();
        System.out.println("actualText = " + actualText);
        String expectedText = "Your e-mail's been sent!";


        if(actualText.equals(expectedText)){
            System.out.println("Header text value verification PASSED!");
        }else{
            System.out.println("Header text verification FAILED!");
        }

         WebElement confirmationMessage= driver.findElement(By.name("confirmation_message"));
        if(confirmationMessage.isDisplayed()){
            System.out.println("Confirmation message is displayed, verification PASSED!");
        }else {
            System.out.println("Confirmation message is NOT displayed, verification FAILED!");
        }



    }





}
