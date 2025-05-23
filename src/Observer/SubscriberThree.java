package Observer;

// 구독자
public class SubscriberThree implements Observer{
    @Override
    public void update(Message message) {
        System.out.println("SubscriberThree Received : " + message.getMessageContent());
    }
}
