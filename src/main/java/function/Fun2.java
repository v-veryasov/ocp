package function;

import java.util.Comparator;

public class Fun2 {
    public static void main(String[] args) {
        Comparator<Integer> comparator = (a, b) -> a-b;
        Comparator<String> comparator1 = String::compareTo;
    }
}
