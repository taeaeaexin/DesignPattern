package Observer;

// 구독자
public class SubscriberTwo implements Observer{
    @Override
    public void update(Message message) {
        System.out.println("SubscriberTwo Received : " + message.getMessageContent());
    }
}
