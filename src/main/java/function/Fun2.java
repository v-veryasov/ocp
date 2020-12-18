package function;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Fun2 {
    public static void main(String[] args) {
        Predicate<Set<Double>> predicate = x -> true;
        Secret secret = (a, b) -> a + b;

        List<Integer> numbers = Arrays.asList(1, 2, 3);
        UnaryOperator<Integer> operator = x -> x*2;
        operator.apply(1);

        numbers.replaceAll(operator);
        System.out.println(numbers);
        List<Integer> num = new ArrayList<>();
        for (int i: num) {
            System.out.println(i);
        }
        num.forEach(System.out::println);

        BiFunction<String, String, String> mapper = (v1, v2) -> null;
        Map<String, String> favorites = new HashMap<>();
        favorites.put("Jenny", "Bus Tour");
        favorites.put("Tom", "Bus Tour");

        favorites.merge("Jenny", "Skyride", mapper);
        favorites.merge("Sam", "Skyride", mapper);
        System.out.println(favorites);   // {Tom=Bus Tour, Sam=Skyride}

        List<?> list1 = new ArrayList<A>();
        List<? extends A> list2 = new ArrayList<A>();
        List<? super A> list3 = new ArrayList<A>();

        B b = new B();
        C c = new C();
//        list2.add(new A());
    }
}

interface Secret {
    String concat(String a, String b);
}
