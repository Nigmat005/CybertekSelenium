package com.cybertek.utilities;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Wait {

    public static void Wait_Time_Method(int Sec){
      try{
          Thread.sleep(Sec*1000);
      }catch (Exception e){
          System.out.println(e.getMessage());
      }

    }
    public static void Wait_Time_Method( WebDriver driver,int Sec){
        driver.manage().timeouts().implicitlyWait(Sec, TimeUnit.SECONDS);
    }
//   public void test(){
//        try{
//            System.out.println("hih");
//        }catch (ArithmeticException  e){
//            System.out.println(e.getCause());
//        }catch (Exception e){
//            System.out.println(e.getCause());
//        }
//   }
}
