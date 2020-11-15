package com.cybertek.tests.Day_10testbase_properties;

import org.testng.annotations.Test;

public class Learning_Properities {
    @Test
    public void java_properties(){
        System.out.println("System.getProperty(\"os.name\") = " + System.getProperty("os.name"));
        System.out.println("System.getProperty(\"user.name\") = " + System.getProperty("user.name"));
        System.out.println(getClass().getName());
    }
}
