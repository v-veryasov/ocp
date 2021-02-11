package pattern.po.State;

import pattern.po.State.state.RDV;
import pattern.po.State.state.Rus;
import pattern.po.State.state.State;

public class Radio {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void nextStation() {
        if (state instanceof RDV) {
            setState(new Rus());
        } else if (state instanceof Rus) {
            setState(new RDV());
        }
    }

    public void play() {
        state.play();
    }

}
