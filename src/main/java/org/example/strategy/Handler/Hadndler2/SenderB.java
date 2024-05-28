package org.example.strategy.Handler.Hadndler2;

// 具体的消息发送者类 B
public class SenderB implements MessageSender {
    private MessageSender nextSender;

    @Override
    public String fetchData(String requiredFields) {
        // 假设 SenderB 只有字段 12345
        if (requiredFields.equals("12345")) {
            // 返回 SenderB 的数据
            return "Data from Sender B: 12345";
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