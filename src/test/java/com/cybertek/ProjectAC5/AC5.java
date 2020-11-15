package com.cybertek.ProjectAC5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class AC5 {
 public static WebDriver  driver;
    public static WebDriver getDriver(String browserName){
      if(browserName.equalsIgnoreCase("Chrome")){

          WebDriverManager.chromedriver().setup();

          return  driver=new ChromeDriver();
      } else if(browserName.equalsIgnoreCase("firefox")){

          WebDriverManager.firefoxdriver().setup();

          return  driver=new FirefoxDriver();

      }else{
//          System.out.println("The driver name you entered does not exist, please choose either \"Chrome\" or\" Firefox\"");
          throw new WebDriverException("The driver name you entered does not exist, please choose either \"Chrome\" or\" Firefox\"");
      }//return null;


  }
    public AC5(String getBrowser){
        getDriver(getBrowser);
    }

    public void LoginFunctionCheck(String UserName, String Password) throws InterruptedException{
       driver.findElement(By.cssSelector("input#prependedInput")).sendKeys(UserName);
       Thread.sleep(1000);
//       driver.findElement(By.cssSelector("input#prependedInput2")).sendKeys(UserName+ Keys.ENTER);
        driver.findElement(By.cssSelector("input[name='_password']")).sendKeys(Password+ Keys.ENTER);
        Thread.sleep(1000);

        WebElement getElement=driver.findElement(By.xpath("//a[@href='/']"));
        String Result = (getElement.isDisplayed()) ? "Successfully logged in. " : "Login Failed !!!";

//     Below is another way to check if user successfully logged in (Using Title of the next page)
        // String Except_Title="Dashboard";
//        String ActualTitle = driver.getTitle();
//        String Result = (ActualTitle.equals(Except_Title)) ? "Successfully logged in. " : "Login Failed !!!";


//        <a href="/" title="Fleet Management">Fleet Management</a>
        //*[@id="organization-switcher"]/div/h1/a

        System.out.println(Result);
    }





    public static void main(String[] args)  {
//        invoke getDriver() to setup chrome browser
        AC5 object=new AC5("chrome");
//     navigate to login page
        driver.get("https://qa2.vytrack.com/user/login");
        driver.manage().window().maximize();

//        credential User180 UserUser123
        try {
            object.LoginFunctionCheck("User180","UserUser123");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

//        Below is my real AC related part
        /*
  Nigmat
 AC#5Verify that truck driver should be able to Add Event
 Given track driver is on ” Vehicle Costs” page
When driver clicks  on any Tax  Roll
And driver will see “Add Event” button on the upper right of the page
And driver clicks on “Add Event” button
And driver needs to fill out the blanks required to do so
And driver clicks on “Save” button
Then driver should be able to add event
Or driver clicks on “Cancel” button
Then driver should not be able to add event
         */
//        WebElement FleetModule=driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/a/span"));


        WebElement FleetModule=driver.findElement(By.xpath("//span[@class='title title-level-1']"));

        if(FleetModule.isDisplayed()){
            System.out.println("Fleet Module is good");
        }else{
            System.out.println("Fleet Module is  abnormal");
        }
        try{
            Thread.sleep(1000);
            FleetModule.click();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


//        Driver clicks on "Vehicle Costs"

        WebElement Vehicle_Costs=driver.findElement(By.xpath("//span[.='Vehicle Costs']"));
        if(Vehicle_Costs.isDisplayed()){
            System.out.println("Vehicle Costs is good");
        }else{
            System.out.println("Vehicle Costs is  abnormal");
        }
        try{
            Thread.sleep(1000);
            Vehicle_Costs.click();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
//      Driver clicks on anywhere of blank or TAX ROll to access next page that has "Add Event" button on the upper right

//       driver.findElement(By.xpath("//div[@class='pull-right title-buttons-container']/a[contains(@title,'Create Vehicle Costs')]")).click();
//    Locate whole table
        WebElement Table=driver.findElement(By.xpath("//tbody[@class='grid-body']"));
        String getText=Table.getText();
        System.out.println("getText = " + getText);
      // Locate or grab all the lines tr
        List<WebElement> Table_Row=Table.findElements(By.xpath("//tr[@class='grid-row row-click-action']"));
        for(WebElement each_Row:Table_Row){

            List<WebElement>Table_Column=each_Row.findElements(By.tagName("td"));

            for(int i=0; i<Table_Column.size();i++){

               Table_Column.get(i).click();
                System.out.println(Table_Column.get(i).getText());
            }
        }

   }
}




