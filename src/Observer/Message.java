package Observer;

// 생성자를 통해서 message를 받고, 변경 불가, get만 가능
public class Message {
    private final String messageContent;

    public Message(String messageContent) {
        this.messageContent = messageContent;
    }

    public String getMessageContent() {
        return this.messageContent;
    }
}
