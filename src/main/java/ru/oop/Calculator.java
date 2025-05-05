package ru.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int b) {
        return x - b;
    }

    public int divide(int d) {
        return x / d;
    }

    public int sumAllOperations(int c) {
        return multiply(c) + multiply(c) + minus(c) + divide(c);
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        System.out.println(result);
        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        System.out.println(rsl);
        result = minus(20);
        System.out.println(result);
        Calculator calculator1 = new Calculator();
        rsl = calculator.divide(5);
        System.out.println(rsl);
        Calculator calculator2 = new Calculator();
        rsl = calculator.sumAllOperations(1);
        System.out.println(rsl);
    }
}
