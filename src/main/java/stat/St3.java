package stat;

public interface St3 {

    static void create() {
        System.out.println("St3 inter");
    }

    class InnerSt{
        static void create() {
            St3.create();
        }
    }
}

class S implements St3 {
    public static void main(String[] args) {
       St3 st3 = new S();
       new InnerSt().create();
        InnerSt.create();
    }
}
