package org.example.strategy.test2;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/5/24 10:58 //创建时间
 * @Version: 1.0    //版本号
 * 定义环境类，持有抽象策略接口的引用，在运行时调用策略中的算法。
 */
public class Calculator2 {

    public Operation operation;

    public Calculator2() {

    }

    public Calculator2(Operation operation) {
        this.operation = operation;
    }

    public double executeOperation(double a, double b) {
        return operation.execute(a, b);
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }
}