package com.cybertek.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    //#1- We created the properties object


//#4- We read from file
//#5- close the file

    //#1- We created the properties object with limiting access
    private static Properties properties=new Properties();

    static{
        try {
            //#2- We get the path and pass it into FileInputStream, to open the file

            FileInputStream file=new FileInputStream("configuration.properties");

            //#3- We load the opened file into properties object
            properties.load(file);
        } catch (IOException e) {
            System.out.println("Properties file not found");

        }

    }

    public static String getProperty(String keyWord){


        return properties.getProperty(keyWord);
    }



}

//class main{
//    public static void main(String[] args) throws IOException {
//        System.out.println(System.getProperty("user.name"));
//
//        FileInputStream fileinput=new FileInputStream("configuration.properties");
//
//
//        Properties properties=new Properties();
//        properties.load(fileinput);
//        System.out.println(properties.getProperty("search"));
//
//    }
//}


class test1{
    public static void main(String[] args) {
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("user.name"));
    }
}