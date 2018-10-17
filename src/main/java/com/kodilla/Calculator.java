package com.kodilla;

public class Calculator {

    public int substract(int a, int b) {
        return a-b;
    }

    public static void main(String args[]) {
        Calculator calculator = new Calculator();
        System.out.print(calculator.substract(15, 7));
    }
}
