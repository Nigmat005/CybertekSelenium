package com.cybertek.tests.Day_6_DropDown;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFaker {
    @Test
    public void faker_test(){
        Faker faker=new Faker();
        String fake_name = faker.name().firstName();
        System.out.println(fake_name);

        String house=faker.gameOfThrones().house();
        System.out.println(house);

        String i=faker.hobbit().quote();
        System.out.println(i);

        String Uyghur=faker.number().digits(5);
        System.out.println(Uyghur);
    }
}

