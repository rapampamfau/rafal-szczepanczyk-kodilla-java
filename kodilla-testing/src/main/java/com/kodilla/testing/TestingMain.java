package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        //SimpleUser tests
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        //Calculator tests
        Calculator calculator = new Calculator();

        int addResult = calculator.add(7, 15);
        int subtractResult = calculator.subtract(7, 2);

        //add test
        if (addResult == 22) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        //subtract test
        if (subtractResult == 5) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }
}
