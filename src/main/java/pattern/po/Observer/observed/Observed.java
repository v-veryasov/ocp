package pattern.po.Observer.observed;

import pattern.po.Observer.observer.Observer;

public interface Observed {

    void add(Observer observer);

    void remove(Observer observer);

    void notifyObservers();
}
