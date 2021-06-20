package pattern.pa.abstractFactory;

import pattern.pa.abstractFactory.dto.Animal;
import pattern.pa.abstractFactory.dto.Color;

public interface AbstractFactory {
    Animal createAnimal();
    Color createColor();
}
