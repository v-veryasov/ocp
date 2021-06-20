package pattern.pa.abstractFactory;

public class FactoryProvider {

    public static AbstractFactory getFactory(String choice) {
        if ("Normal".equalsIgnoreCase(choice)) {
            return new NormalFactory();
        } else if ("Defect".equalsIgnoreCase(choice)) {
            return new FailFactory();
        }
        return null;
    }
}
