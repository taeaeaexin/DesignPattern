package Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CarInvocationHandler implements InvocationHandler {

    private final Car car;
    public CarInvocationHandler(Car car){
        this. car = car;
    }

//    @Override
//    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        System.out.println("Proxy Handler invoke()");
//        // 실제 객체의 메소드를 호출
//        Object result = method.invoke(car, args);
//
//        // 실제 객체의 메소드 호출 후 추가 작업은 여기에
//        return result;
//    }

    // Lazy Loading
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Proxy Handler invoke()");

        // 호출된 메소드가 engineStart면 아무것도 하지 않는다.
        if(method.getName().equals("engineStart")) return null;

        // 호출된 메소드라 drive면 engineStart를 호출한다.
        if(method.getName().equals("drive")) {
            car.engineStart();
        }

        // 실제 객체의 메소드를 호출
        Object result = method.invoke(car, args);

        // 실제 객체의 메소드 호출 후 추가 작업은 여기에

        return result;
    }
}