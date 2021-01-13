package pattern.st.adapter;

import pattern.st.adapter.dto.Bird;
import pattern.st.adapter.dto.Toy;

public class BirdAdapter implements Toy {

    Bird bird;

    public BirdAdapter(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void go() {
        bird.makeSound();
    }
}
