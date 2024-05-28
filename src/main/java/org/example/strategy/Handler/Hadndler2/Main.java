package org.example.strategy.Handler.Hadndler2;

// 测试类
public class Main {
    public static void main(String[] args) {
        // 创建 Controller 实例
        MessageController controller = new MessageController();

        // 模拟客户端传递不同的字段
        String clientFields = "1234";

        // 处理请求并输出结果
        String responseData = controller.handleTestOneRequest(clientFields);
        System.out.println("Response Data: " + responseData);
    }
}