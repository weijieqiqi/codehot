package org.example.strategy.test1;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/5/24 10:43 //创建时间
 * @Version: 1.0    //版本号
 *
 * 定义环境类，持有抽象策略接口的引用，在运行时调用策略中的算法。
 */
public class Context {
    public Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public Context(){
    }

    public Context(Strategy strategy){
        this.strategy = strategy;
    }
    // 执行策略
    public void executeStrategy() {
        strategy.execut();
    }
}