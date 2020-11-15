package com.cybertek.tests.Day_5testNG_dropdown;

import org.testng.Assert;
import org.testng.annotations.*;

public class Test_NG_introduction {
@BeforeClass
public void BeforeClass(){
    System.out.println("Before class is running");
}
@AfterClass
    public void AfterClass(){
        System.out.println("After class is running");
    }
    @BeforeMethod
    public void setupMethod(){
        System.out.println("Before method is running");
    }
    @AfterMethod
    public void tearDown(){
        System.out.println("After method is running");
    }

    @Test
    public void test1(){
    System.out.println("Test 1 is running");
}
@ Test
public void test2(){
    System.out.println("Test2 is running ");
}
    @ Test
public void Test(){
    test1();
    test2();
}

@Test
    public void method3(){
    String st1 = "TestNG";
    String st2 = "TestNG";
    String st3 = "Testng";
    Assert.assertEquals(st1,st2,"It will be printed only if this condition fails or turn out to be false");
    Assert.assertTrue(st1.equals(st2));
    Assert.assertTrue(st1.equals(st3),"st1 is NOT equal to st2");
    Assert.assertTrue(!st1.equals(st3));
}

}
