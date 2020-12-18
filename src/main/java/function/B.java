package function;

import java.util.function.Consumer;

public class B extends A {
    public static void main(String[] args) {
        Consumer<String> c = System.out::println;
    }
}
