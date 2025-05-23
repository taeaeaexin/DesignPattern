package factory;

// Transportation을 구현한 객체를 대신 생성
public class TransportationFactory {
    public static Transportation getTransportation(String clsf) {
        Transportation t = null;

        switch(clsf) {
            case "A" : t = new AirPlane(); break;
            case "C" : t = new Car(); break;
            case "H" : t = new Helicopter(); break;
        }

        return t;
    }
}
