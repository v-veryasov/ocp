package pattern.factory;

public abstract class Car {

    private String name;

    public Car(String name) {
        this.name = name;
    }

    abstract void run();
}
