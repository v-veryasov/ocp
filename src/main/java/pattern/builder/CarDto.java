package pattern.builder;

import java.util.ArrayList;
import java.util.List;

public final class CarDto {

    private String engine;
    private int numTransmission;
    private String carBody;
    private List<String> other;

    public CarDto(String engine, int numTransmission, String carBody, List<String> other) {
        this.engine = engine;
        this.numTransmission = numTransmission;
        this.carBody = carBody;

        this.other = new ArrayList<>(other);
    }

    public String getEngine() {
        return engine;
    }

    public int getNumTransmission() {
        return numTransmission;
    }

    public String getCarBody() {
        return carBody;
    }

    public List<String> getOther() {
        return new ArrayList<>(other);
    }
}
