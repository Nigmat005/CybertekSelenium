package com.cybertek.CybertekLinkVerification_Parizat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AcceptanceCriteria4_UserStory1 {
        WebDriver driver;
        public com.cybertek.utilities.WebDriverFactory WebDriverFactory;
        @BeforeMethod
        public void setupMethod() throws InterruptedException {
            // open a new browser
            driver = com.cybertek.utilities.WebDriverFactory.getDriver("chrome");
            String URL = "https://login2.nextbasecrm.com/stream/?login=yes";
            String Login = "helpdesk28@cybertekschool.com";
            String password = "UserUser";
            driver.get(URL);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println("The title of the page is: " + driver.getTitle());
            String actualTitle = driver.getTitle();
            System.out.println("ACTUAL TITLE STRING: " + actualTitle);
            String actualUrl = driver.getCurrentUrl();
            System.out.println("actualUrl =" + actualUrl);
            // Login in
           Thread.sleep(1);
            driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[1]/div[1]/input")).sendKeys(Login);

            //Password
            Thread.sleep(1);
            driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[1]/div[2]/input")).sendKeys(password);
            //Clicks "Log In"
            driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[2]/input")).click();
            String expected = "Portal";
            String actual = driver.getTitle();
            System.out.println("expected = " + expected);
            System.out.println("actual = " + actual);
            System.out.println(expected.equals(actual)?"Pass:":"Fail");
        }
        @Test
        public void messageQuote() throws InterruptedException {
            // Selects "Message" tab on the main selection menu
            Thread.sleep(1);
            WebElement messageField=driver.findElement(By.xpath("//span[@class='feed-add-post-form-link feed-add-post-form-link-active']"));
            messageField.click();
            //Clicking on Insert video icon
//            WebElement videoIcon=driver.findElement(By.xpath("//span[@class='bxhtmled-top-bar-btn bxhtmled-button-video']"));
//            videoIcon.click();
            Thread.sleep(1);
//            WebElement video=driver.findElement(By.xpath("//*[@id=\"bx-b-video-blogPostForm\"]/span/i"));
            WebElement video=driver.findElement(By.xpath("//span[@class='bxhtmled-top-bar-btn bxhtmled-button-video']/i"));
            ////span[@class='bxhtmled-top-bar-btn bxhtmled-button-video']/i
            video.click();
}
    }
