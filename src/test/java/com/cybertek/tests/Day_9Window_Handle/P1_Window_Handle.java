package com.cybertek.tests.Day_9Window_Handle;

import com.cybertek.utilities.Wait;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class P1_Window_Handle {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
//        WebDriverManager.chromedriver().setup();
//        driver=new ChromeDriver();
        driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();
        Wait.Wait_Time_Method(driver, 10);
        driver.get("http://practice.cybertekschool.com/windows");
/*
TC	#	:	Window	Handlepractice1.Create	a	new	class	called:	WindowHandlePractice
2.Create	new	test	and	make	set	ups
3.Go	to	:	http://practice.cybertekschool.com/windows
4.Assert:	Title	is	“Practice”
5.Click	to:	“Click	Here”text
6.Switch	to	new	Window.
7.Assert:	Title	is	“New	Window
 */
    }
    @Test
    public void Window_Handle(){
        driver.findElement(By.xpath("//a[.='Click Here']")).click();
        String New_Page=driver.getWindowHandle();
        System.out.println("New_Page = " + New_Page);

        driver.switchTo().window(New_Page);
        System.out.println(driver.getWindowHandle());

    }
}
