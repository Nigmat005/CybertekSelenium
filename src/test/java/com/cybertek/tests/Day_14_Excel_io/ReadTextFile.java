package com.cybertek.tests.Day_14_Excel_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTextFile {
    public static void main(String[] args) {
        File file=new File("shopping_list.txt");
        System.out.println(file.exists());

        try{
            Scanner scan=new Scanner(file);
            while(scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
            e.getCause();
        }
    }
}
