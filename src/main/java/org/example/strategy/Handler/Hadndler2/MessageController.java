package org.example.strategy.Handler.Hadndler2;

// Controller 类，处理 HTTP 请求
public class MessageController {
    private MessageService messageService;

    public MessageController() {
        this.messageService = new MessageService();
    }

    // 处理 /test/testone 接口的请求
    public String handleTestOneRequest(String requiredFields) {
        // 调用 Service 类的 fetchData 方法获取数据
        String responseData = messageService.fetchData(requiredFields);
        if (responseData != null) {
            return responseData;
        } else {
            return "Failed to fetch data from all senders.";
        }
    }
}