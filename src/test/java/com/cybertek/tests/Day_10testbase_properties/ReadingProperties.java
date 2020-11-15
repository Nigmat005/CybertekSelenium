package com.cybertek.tests.Day_10testbase_properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties  {
    /*
    Properties:use Properties class object
    FileInputStream: open the file
    We will load the file
    We read from the file
    Close
     */



public static void main(String[]args) throws IOException {

    //  Properties:use Properties class object
    Properties properties=new Properties();

    // FileInputStream: open the file
    String path="configuration.properties";
    FileInputStream file=new FileInputStream(path);

    // We will load the file
    properties.load(file);

    //    We read from the file

    System.out.println("properties.getProperty(\"browser\") = " + System.getProperty("browser"));
    System.out.println("properties.getProperty(\"username\") = " + properties.getProperty("username"));

    // Close file
    file.close();
}



}
