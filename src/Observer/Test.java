package Observer;

// Observer 패턴은 message와 message를 발생, 수식 관계를 구조화
public class Test {
    public static void main(String[] args) {
        // 메시지 구독(수신) 대상
        SubscriberOne one = new SubscriberOne();
        SubscriberTwo two = new SubscriberTwo();
        SubscriberThree three = new SubscriberThree();

        // 메시지 구독 관리 Publisher
        Publisher publisher = new Publisher();

        // 메시지 구독 시작
        publisher.attach(one);
        publisher.attach(two);

        publisher.notifyUpdate(new Message("first"));


        publisher.detach(one);
        publisher.attach(three);

        publisher.notifyUpdate(new Message("second"));
    }
}
