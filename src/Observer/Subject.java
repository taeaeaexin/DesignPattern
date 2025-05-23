package Observer;

// Observer 등록, 삭제, 메시지 전송 ... 역할을 수행
public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyUpdate(Message message);
}
