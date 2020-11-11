package pattern.factory;

public class Fiat extends Car {
    public Fiat(String name) {
        super(name);
    }

    @Override
    void run() {
        System.out.println("FF");
    }
}
