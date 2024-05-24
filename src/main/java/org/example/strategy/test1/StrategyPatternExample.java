package org.example.strategy.test1;

// 测试策略模式
public class StrategyPatternExample {
    public static void main(String[] args) {
        Context context = new Context();

        // 使用具体策略A
        context.setStrategy(new ConcreteStrategyA());
        context.executeStrategy(); // 输出：Executing strategy A

        // 切换到具体策略B
        context.setStrategy(new ConcreteStrategyB());
        context.executeStrategy(); // 输出：Executing strategy B
    }
}