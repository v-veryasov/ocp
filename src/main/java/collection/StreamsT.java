package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

public class StreamsT {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list = null;
        var  j = Optional.ofNullable(list).stream().flatMap(List::stream).map( a-> new StreamsT().map(a)).collect(toList());
        System.out.println(j);
    }

    private String map (String s) {
        return s;
    }
}
