package pattern.singelton.b;

//TODO: Потокобезопастный. Lazy Initialization
public class SingletonSafe {
    private static SingletonSafe instance;

    private SingletonSafe() {
    }

    public static synchronized SingletonSafe getInstance() {
        if (instance == null) {
            instance = new SingletonSafe();
        }
        return instance;
    }
}
