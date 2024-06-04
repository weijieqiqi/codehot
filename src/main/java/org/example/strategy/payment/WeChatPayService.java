package org.example.strategy.payment;

/**
 * @Title WeChatPayService
 * @Description TODO
 * @Author Lee
 * @Date 2024-01-20
 */
public class WeChatPayService implements PayStrategy {

    @Override
    public String getType() {
        return "weChatPay";
    }

    @Override
    public void process() {
        System.out.println("微信付款100元");
    }
}
