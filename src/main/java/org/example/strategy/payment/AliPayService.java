package org.example.strategy.payment;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class AliPayService implements PayStrategy {
    
    @Override
    public String getType() {
        return "aliPay";
    }

    @Override
    public void process() {
        System.out.println("支付宝付款100元");
    }
}

