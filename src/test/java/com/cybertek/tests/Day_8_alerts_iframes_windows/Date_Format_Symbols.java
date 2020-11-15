package com.cybertek.tests.Day_8_alerts_iframes_windows;

import java.text.DateFormatSymbols;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Date_Format_Symbols {
    public static void main(String[] args) {
       DateFormatSymbols DFS=new DateFormatSymbols(Locale.US);// this will return you a array
        // if you wanna use list you need to use Arrays.asList() method
        List<String> Months = Arrays.asList(DFS.getWeekdays());
        System.out.println(Months);
    }
}
