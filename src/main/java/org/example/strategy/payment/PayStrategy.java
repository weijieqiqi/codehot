package org.example.strategy.payment;

/**
 * @Title Strategy
 */
public interface PayStrategy {

    /**
     * 付款方式
     *
     * @return
     */
    String getType();

    /**
     * 执行策略
     */
    void process();

}

