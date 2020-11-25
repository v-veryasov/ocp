package nested.innerTest.a;

import nested.innerTest.b.I;

public class J {
    protected class Iimpl implements I {

        @Override
        public boolean add(String s) {
            return false;
        }
    }

    public class II extends Iimpl {
    }

    public static void main(String[] args) {
        I i = new J().new Iimpl();

    }
}
