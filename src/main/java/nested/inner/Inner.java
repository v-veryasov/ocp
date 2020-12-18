package nested.inner;

import java.util.LinkedList;
import java.util.List;

public class Inner {

    private int i;

    private class I {
        static final String f = "d";
        void fly() {
            int l = i;
        }
    }

    class Ii extends Inner{
    }

    protected class IIi extends Ii{
    }

    public class IIIi extends IIi{
    }
}
