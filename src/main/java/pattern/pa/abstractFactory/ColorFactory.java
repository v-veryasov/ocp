package pattern.pa.abstractFactory;

import pattern.pa.abstractFactory.dto.Color;
import pattern.pa.abstractFactory.dto.Red;

public class ColorFactory implements AbstractFactory<Color> {
    @Override
    public Color create() {
        return new Red();
    }
}
