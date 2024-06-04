package org.example.strategy.payment;

/**
 * @Title UserController
 * @ProjectName spring-boot-demo
 * @Description TODO
 * @Author Lee
 * @Date 2024-01-17
 */

public class UserController {

    private PayStrategyHandler handler;

    /**
     * 用户付款
     *
     * @return
     */
    public String pay() {
        String type = "weChatPay";
        handler.run(type);
        return "付款成功";
    }
}

