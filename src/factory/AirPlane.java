package factory;

public class AirPlane implements Transportation{
    @Override
    public void move() {
        System.out.println("비행끼얏호우");
        check();
    }

    private void check() {
        System.out.println("비행하하하");
    }
}
