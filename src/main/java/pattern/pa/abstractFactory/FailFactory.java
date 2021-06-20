package pattern.pa.abstractFactory;

import pattern.pa.abstractFactory.dto.Animal;
import pattern.pa.abstractFactory.dto.Color;
import pattern.pa.abstractFactory.dto.Duck;
import pattern.pa.abstractFactory.dto.Red;

public class FailFactory implements AbstractFactory {
    @Override
    public Animal createAnimal() {
        return new Duck();
    }

    @Override
    public Color createColor() {
        return new Red();
    }
}
