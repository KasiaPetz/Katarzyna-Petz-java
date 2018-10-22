package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main (String[] args) {

        Calculator c = new Calculator();
        int result = c.add(20, 15);
        if (result == 35) {
            System.out.println("Add test OK");
        } else {
            System.out.println("Add test error");
        }

        result = c.substract(20, 15);
        if(result == 5) {
            System.out.println("Substract test OK");
        } else {
            System.out.println("Substract test error");
        }
    }
}