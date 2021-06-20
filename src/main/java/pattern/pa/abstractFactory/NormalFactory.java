package pattern.pa.abstractFactory;

import pattern.pa.abstractFactory.dto.Animal;
import pattern.pa.abstractFactory.dto.Color;
import pattern.pa.abstractFactory.dto.Duck;
import pattern.pa.abstractFactory.dto.Grey;

public class NormalFactory implements AbstractFactory {

    @Override
    public Animal createAnimal() {
        return new Duck();
    }

    @Override
    public Color createColor() {
        return new Grey();
    }
}
