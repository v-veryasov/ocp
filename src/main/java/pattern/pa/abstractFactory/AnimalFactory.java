package pattern.pa.abstractFactory;

import pattern.pa.abstractFactory.dto.Duck;

public class AnimalFactory implements AbstractFactory<Duck> {

    @Override
    public Duck create() {
        return new Duck();
    }
}
