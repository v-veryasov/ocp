package pattern.pa.builder;

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
        this.other = other;
    }
}
