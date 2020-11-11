package nested.anonimus;

public class An12 {
    public An12() {
    }

    public An12(String str) {
        System.out.println(str);
    }
    class B {
    An12 create() {
        return new An12("WW"){

        };
    }
    }

    public static void main(String[] args) {
       new An12().new B().create();
    }
}
