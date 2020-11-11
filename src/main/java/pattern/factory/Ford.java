package pattern.factory;

public class Ford extends Car {
    public Ford(String name) {
        super(name);
    }

    @Override
    void run() {
        System.out.println("FoRD!");
    }
}
