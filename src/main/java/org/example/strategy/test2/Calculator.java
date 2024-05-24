package org.example.strategy.test2;

/**
 * 传统的if else写法
 * 就是一个+ - * / 的写法
 */

public class Calculator {
    public static double calculate(double a, double b, String operator) {
        if (operator.equals("+")) {
            return a + b;
        } else if (operator.equals("-")) {
            return a - b;
        } else if (operator.equals("*")) {
            return a * b;
        } else if (operator.equals("/")) {
            if (b != 0) {
                return a / b;
            } else {
                throw new IllegalArgumentException("Division by zero");
            }
        } else {
            throw new UnsupportedOperationException("Operator not supported");
        }
    }

    public static void main(String[] args) {
        System.out.println(calculate(1, 2, "+"));
    }
}
