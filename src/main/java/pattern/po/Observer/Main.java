package pattern.po.Observer;

import pattern.po.Observer.observed.CountObserved;
import pattern.po.Observer.observer.CountObserver;
import pattern.po.Observer.observer.CountTwoObserver;

public class Main {
    public static void main(String[] args) {
        CountObserved observed = new CountObserved();
        observed.add(new CountObserver());
        observed.add(new CountTwoObserver());
        observed.setCount(100);
    }
}
