package nested.innerTest.c;

import nested.innerTest.a.J;
import nested.innerTest.b.I;

public class K extends J {

    void create() {
        I i = new J().new II();
    }

    public static void main(String[] args) {
        K k = new K();
        k.create();
    }
}
