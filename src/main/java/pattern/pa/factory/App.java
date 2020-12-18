package pattern.pa.factory;

public class App {

    public static void main(String[] args) {
        Car car = FactoryCar.getCar("ford");
        car.run();
    }
}
