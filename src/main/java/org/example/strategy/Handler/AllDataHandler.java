package org.example.strategy.Handler;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/5/28 16:00 //创建时间
 * @Version: 1.0    //版本号
 */
public class AllDataHandler extends DataHandler {
    @Override
    public void handleData(Data data) {
        if ("A".equals(data.getSender())) {
            System.out.println("Data handled by ADataHandler");
        }else if (data.getSender().equals("B")) {
            System.out.println("Data handled by BDataHandler");
        }else if (data.getSender().equals("C")) {
            System.out.println("Data handled by CDataHandler");
        }else {
            System.out.println("No handler found for the data");
        }
    }
}