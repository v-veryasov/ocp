package pattern.factory;

public class FactoryCar {

    public static Car getCar(String name) {
        switch (name) {
            case "ford":
                return new Ford(name);
            case "fiat":
                return new Fiat(name);
        }
        return null;
    }
}
