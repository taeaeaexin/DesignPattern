package Observer;

// 구독자
public class SubscriberOne implements Observer{
    @Override
    public void update(Message message) {
        System.out.println("SubscriberOne Received : " + message.getMessageContent());
    }
}
