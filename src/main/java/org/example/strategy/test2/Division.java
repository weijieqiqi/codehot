package org.example.strategy.test2;

/**
 * 具体策略角色
 */
class Division implements Operation {
    public double execute(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new IllegalArgumentException("Division by zero");
        }
    }
}