package org.example.strategy.test2;

/**
 * 具体策略角色
 */
class Addition implements Operation {
    public double execute(double a, double b) {
        return a + b;
    }
}