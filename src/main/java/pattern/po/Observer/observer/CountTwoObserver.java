package pattern.po.Observer.observer;

public class CountTwoObserver implements Observer {
    @Override
    public void handleEvent(int count) {
        System.out.println("Реально изменилась!");
    }
}
