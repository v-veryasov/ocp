package pattern.po.State;

import pattern.po.State.state.RDV;

public class Main {
    public static void main(String[] args) {

        // Сам "Контекст" может сменить стратегию
        Radio radio = new Radio();
        radio.setState(new RDV());

        for (int i = 0; i < 10; i++) {
            radio.play();
            radio.nextStation();
        }
    }
}
