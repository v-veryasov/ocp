package pattern.po.Observer.observed;

import pattern.po.Observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class CountObserved implements Observed {

    private int count;

    List<Observer> list = new ArrayList<>();

    public void setCount(int count) {
        this.count = count;
        notifyObservers();
    }

    @Override
    public void add(Observer observer) {
        list.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObservers() {
        list.forEach(observer -> observer.handleEvent(count));
    }
}
