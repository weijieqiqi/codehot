package org.example.strategy.Handler.Hadndler2;

// Service 类，负责构建责任链和拉取数据
public class MessageService {
    private MessageSender firstSender;

    public MessageService() {
        // 创建责任链
        SenderA senderA = new SenderA();
        SenderB senderB = new SenderB();
        SenderC senderC = new SenderC();

        senderA.setNextSender(senderB);
        senderB.setNextSender(senderC);

        firstSender = senderA;
    }

    public String fetchData(String requiredFields) {
        // 从责任链中拉取数据
        return firstSender.fetchData(requiredFields);
    }
}
