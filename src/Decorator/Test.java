package Decorator;

// Decorator는 어떤 객체 A가 있고, 이 객체를 이용하고자 하는 다른 객체 B가 있음
// 상속 고려해 볼 수 있음 <= coupling 심함
// A 객체가 구현한 인터페이스를 동일하게 구현하는 decorator 추상 클래스를 통해서 A를 받아서 A기능을 활용하고
// B의 추가적인 기능은 구현
public class Test {
    public static void main(String[] args) {
        Car carOne = new CarOne();
        System.out.println(carOne.getDesc()+" "+carOne.getSpeed());

        Car carTwo = new CarTwo();
        System.out.println(carTwo.getDesc()+" "+carTwo.getSpeed());

        // Truck ( CarOne )
        Car truckOne = new Truck(carOne); // 상속 대신 객체 전달
        // carOne과 동일한 결과
        System.out.println(truckOne.getDesc()+" "+truckOne.getSpeed());

        Car truckTwo = new Truck(carTwo); // 상속 대신 객체 전달
        // carTwo과 동일한 결과
        System.out.println(truckTwo.getDesc()+" "+truckTwo.getSpeed());

        // 만약 Truck이 CarOne 또는 CarTwo를 상속받았더라면 위와 같은 코드 수행 불가 (무조건 하나밖에 상속을 받지 못하기 때문)
        // Decorator 패턴을 적용하면 CarOne과 CarTwo를 모두 마치 상속받은 것처럼 수행 가능

        Car sportsCar = new SportsCar(carTwo); // 상속 대신 객체 전달
        // carTwo과 동일한 결과
        System.out.println(sportsCar.getDesc()+" "+sportsCar.getSpeed());
    }
}
