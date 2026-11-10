package com.example;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Simple Maven Calculator");
        System.out.println("10 + 5 = " + calculator.add(10, 5));
        System.out.println("10 - 5 = " + calculator.subtract(10, 5));
        System.out.println("10 * 5 = " + calculator.multiply(10, 5));
        System.out.println("10 / 5 = " + calculator.divide(10, 5));
    }
}
