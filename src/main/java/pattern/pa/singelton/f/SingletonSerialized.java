package pattern.pa.singelton.f;

import java.io.Serializable;

//TODO: Потокобезопастный. by Bill Pugn. Серилизованный
public class SingletonSerialized implements Serializable {

    private static final long serialVersionUID = -7604766932017737115L;

    private SingletonSerialized() {
    }

    private static class SingletonHelper {
        private static final SingletonSerialized INSTANCE = new SingletonSerialized();
    }

    public static SingletonSerialized getInstance() {
        return SingletonHelper.INSTANCE;
    }

    protected Object readResolve() {
        return getInstance();
    }
}
