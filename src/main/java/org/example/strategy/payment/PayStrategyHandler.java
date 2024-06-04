package org.example.strategy.payment;

/**
 * @Title PayStrategyHandler
 * @Description TODO
 * @Author Lee
 * @Date 2024-01-20
 */
public interface PayStrategyHandler {
    /**
     * 执行策略
     *
     * @param type 付款方式
     */
    void run(String type);
}
