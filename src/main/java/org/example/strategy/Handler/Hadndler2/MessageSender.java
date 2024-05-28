package org.example.strategy.Handler.Hadndler2;

// 定义消息发送者接口
public interface MessageSender {
    String fetchData(String requiredFields);
    void setNextSender(MessageSender nextSender);
}
