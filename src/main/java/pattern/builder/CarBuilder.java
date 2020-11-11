package pattern.builder;

import java.util.List;

public class CarBuilder {

    private String engine;
    private int numTransmission;
    private String carBody;
    private List<String> other;

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setNumTransmission(int numTransmission) {
        this.numTransmission = numTransmission;
    }

    public void setCarBody(String carBody) {
        this.carBody = carBody;
    }

    public void setOther(List<String> other) {
        this.other = other;
    }

    public CarDto build() {
        return new CarDto(engine, numTransmission, carBody, other);
    }
}
