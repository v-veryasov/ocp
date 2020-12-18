package function;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.TreeSet;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Opt {
    public static void main(String[] args) {
        Optional<List<Integer>> o = Optional.of(List.of(1,2,3));
        if (o.isPresent()){
            o.get().forEach(System.out::println);
        }

        Stream<String> stream = Stream.of("w", "o", "l", "f");

        Supplier<List> supplier = () -> new ArrayList<>();
        BiConsumer<List, String> bc = (List y, String x) -> y.add(x);
        BiConsumer<List, List> biConsumer = (List y, List x) -> {y.addAll(x); return;};

        TreeSet<String> set = stream.collect(
                TreeSet::new,
                TreeSet::add,
                TreeSet::addAll);

//        List<String> list = stream.collect(Collectors.toList());
        set.forEach(System.out::println);
        System.out.println();

        Stream.generate(() -> "Elsa")
                .filter(n -> n.length() == 4)
                .limit(2)
                .sorted()
                .forEach(System.out::println);
        System.out.println();

        Stream<Integer> stre = Stream.of(1, 2, 3);
        System.out.println(stre.reduce(1, (s, n) -> s + n));  // 6

//        TreeSet<String> set =
//                stream.collect(Collectors.toCollection(TreeSet::new));
//        System.out.println(set); // [f, l, o, w]
    }
}
