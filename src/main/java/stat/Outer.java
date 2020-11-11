package stat;

public class Outer {

    class Inner {

    }

    public Inner create() {
        return new Inner();
    }

    public static void main(String[] args) {
        Inner i = new Outer().create();
        Outer o = new Outer();
        Inner oi = o.new Inner();
    }
}
