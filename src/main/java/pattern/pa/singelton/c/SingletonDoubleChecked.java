package pattern.pa.singelton.c;

//TODO: Потокобезопастный. Lazy Initialization. Double - Checked
public class SingletonDoubleChecked {
    private static SingletonDoubleChecked instance;

    private SingletonDoubleChecked() {}

    public static SingletonDoubleChecked getInstance() {
        if (instance == null) {
            synchronized (SingletonDoubleChecked.class) {
                if (instance == null) {
                    instance = new SingletonDoubleChecked();
                }
            }
        }
        return instance;
    }
}
