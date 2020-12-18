package nested.anonimus;


public class Cacady {

    interface Bear {
        void roar();
    }

    public static void main(String[] args) {
        Bird bird = new Bird() {
            @Override
            public String fly() {
                return "ZizZag";
            }

            @Override
            public String sit() {
                return null;
            }
        };
        System.out.println(bird.fly());

        Bear bear = ()-> {};
        bear.roar();
    }
}
