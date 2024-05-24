package org.example.strategy.test2;

public class StrategyPatternExample {
    public static void main(String[] args) {
        Calculator2 calculator = new Calculator2();

        // 使用加法策略
        calculator.setOperation(new Addition());
        System.out.println("10 + 5 = " + calculator.executeOperation(10, 5)); // 输出：10 + 5 = 15

        // 使用减法策略
        calculator.setOperation(new Subtraction());
        System.out.println("10 - 5 = " + calculator.executeOperation(10, 5)); // 输出：10 - 5 = 5

        // 使用乘法策略
        calculator.setOperation(new Multiplication());
        System.out.println("10 * 5 = " + calculator.executeOperation(10, 5)); // 输出：10 * 5 = 50

        // 使用除法策略
        calculator.setOperation(new Division());
        System.out.println("10 / 5 = " + calculator.executeOperation(10, 5)); // 输出：10 / 5 = 2
    }
}
