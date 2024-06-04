package org.example.strategy.payment;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PayStrategyConfig {

    /**
     * 注册策略调度器
     *
     * @param payStrategies
     * @return
     */
    public PayStrategyHandler handler(List<PayStrategy> payStrategies) {
        Map<String, PayStrategy> strategyMaps = payStrategies.stream().collect(Collectors.toMap(PayStrategy::getType, item -> item));
//        return new PayStrategyHandler() {
//            @Override
//            public void run(String type) {
//                strategyMaps.get(type).process();
//            }
//        };
        return type -> strategyMaps.get(type).process();
    }
}
