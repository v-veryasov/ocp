package pattern.pa.builder;

import java.util.List;

public class CarBuilder {

    private String engine;
    private int numTransmission;
    private String carBody;
    private List<String> other;

    private CarBuilder() {
    }

    public static CarBuilder create() {
        return new CarBuilder();
    }

    public CarBuilder engine(String engine) {
        this.engine = engine;
        return this;
    }

    public CarBuilder numTransmission(int numTransmission) {
        this.numTransmission = numTransmission;
        return this;
    }

    public CarBuilder carBody(String carBody) {
        this.carBody = carBody;
        return this;
    }

    public CarBuilder other(List<String> other) {
        this.other = other;
        return this;
    }

    public CarDto build() {
        return new CarDto(engine, numTransmission, carBody, other);
    }
}
