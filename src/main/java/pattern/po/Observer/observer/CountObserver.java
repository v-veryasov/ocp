package pattern.po.Observer.observer;

public class CountObserver implements Observer {
    @Override
    public void handleEvent(int count) {
        System.out.println("Число изменилось!");
    }
}
