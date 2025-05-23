package factory;

// I a = new A(); A implements I
// I a = new B(); B implements I -> 커플링 심함 (생성과 사용이 분리가 안됨)
// I a = Factory.create(".."); -> 팩토리로 생성
// I a 를 사용하는 role과 I a 객체를 생성하고 전달하는 role 간의 coupling을 줄여 준다.
public class Test {
    public static void main(String[] args) {
        // Factory가 없을 경우
//        Transportation t1 = new Car();
//        Transportation t2 = new AirPlane();
//        Transportation t3 = new Helicopter();

        // Factory를 사용한 경우
        Transportation t1 = TransportationFactory.getTransportation("C");
        Transportation t2 = TransportationFactory.getTransportation("A");
        Transportation t3 = TransportationFactory.getTransportation("H");

        t1.move();
        t2.move();
        t3.move();
    }
}
