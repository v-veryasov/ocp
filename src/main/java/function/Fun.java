package function;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Fun {
    public static void main(String[] args) {
        Supplier<LocalDate> sup = LocalDate::now;
        Supplier<LocalDate> sup2 = () -> LocalDate.now();
        System.out.println(sup.get());

        Consumer<Object> c = System.out::println;
        Consumer<Object> c2 = (x) -> System.out.println(x);
        c.accept("Test1");
        c.accept("Test2");

        Map<Integer, Integer> map = new HashMap<>();
        BiConsumer<Integer, Integer> c3 = map::put;
        c3.accept(1,3);
        System.out.println(map);

        Predicate<String> p = String::isEmpty;
        Predicate<String> p2 = (x) -> x.isEmpty();
        System.out.println(p.test(""));

        BiPredicate<String, String> biP = String::contains;
        System.out.println(biP.test("NON", "O"));

        Function<String, Integer> f = String::length;
        System.out.println(f.apply("1234"));

        BiFunction<String, String, String > biF = String::concat;

        System.out.println(biF.apply("YE", "S"));

    }

    //effectively final
    private static void print(Object o) {
        //o = new Object();
        Runnable r = () -> System.out.println(o);
        r.run();

    }
}
