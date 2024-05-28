package org.example.strategy.Handler.Hadndler2;

// 具体的消息发送者类 A
public class SenderA implements MessageSender {
    private MessageSender nextSender;

    @Override
    public String fetchData(String requiredFields) {
        // 假设 SenderA 只有字段 1234
        if (requiredFields.equals("1234")) {
            // 返回 SenderA 的数据
            return "Data from Sender A: 1234";
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