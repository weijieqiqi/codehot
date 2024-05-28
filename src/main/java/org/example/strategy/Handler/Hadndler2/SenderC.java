package org.example.strategy.Handler.Hadndler2;

// 具体的消息发送者类 C
public class SenderC implements MessageSender {
    private MessageSender nextSender;

    @Override
    public String fetchData(String requiredFields) {
        // 假设 SenderC 只有字段 123456
        if (requiredFields.equals("123456")) {
            // 返回 SenderC 的数据
            return "Data from Sender C: 123456";
        } else {
            // 如果不是需要的字段，则交给下一个处理者处理
            return nextSender != null ? nextSender.fetchData(requiredFields) : null;
        }
    }

    @Override
    public void setNextSender(MessageSender nextSender) {
        this.nextSender = nextSender;
    }
}