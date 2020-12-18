package pattern.pa.singelton.d;

//TODO: Потокобезопастный. by Bill Pugn
public class SingletonBillPugh {

    private SingletonBillPugh() {
    }

    private static class SingletonHelper {
        private static final SingletonBillPugh INSTANGE = new SingletonBillPugh();
    }

    public static SingletonBillPugh getInstance() {
        return SingletonHelper.INSTANGE;
    }
}
