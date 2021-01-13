package pattern.st.adapter;

import pattern.st.adapter.dto.Sparrow;
import pattern.st.adapter.dto.Toy;
import pattern.st.adapter.dto.ToyDuck;

public class Main {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        Toy toyDuck = new ToyDuck();

        Toy birdAdapter = new BirdAdapter(sparrow);
        birdAdapter.go();
    }
}
