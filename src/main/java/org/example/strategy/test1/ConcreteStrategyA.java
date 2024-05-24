package org.example.strategy.test1;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/5/24 10:11 //创建时间
 * @Version: 1.0    //版本号
 */
public class ConcreteStrategyA implements Strategy{
    @Override
    public void execut() {
        System.out.println("这是策略A");
    }
}