package collection;

import java.util.*;

public class Collect {
    public static void main(String[] args) {
        String[] array = new String[]{"A", "B"};
        Arrays.sort(array);
        //System.out.println(Arrays.binarySearch(array, "B"));

        List<String> list = Arrays.asList(array);
        Collections.sort(list);
        //System.out.println(Collections.binarySearch(list, "B"));

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < 5; i++)
            q.add(i);
        q.forEach(System.out::println);
        //System.out.println(q.peek() + " and size = " + q.size());
        //System.out.println(q.element() + " and size = " + q.size());
        //System.out.println(q.poll() + " and size = " + q.size());
        //System.out.println(q.offer(12) + " and size = " + q.size());
        System.out.println();

        Deque<String> stack = new ArrayDeque<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
        SortedSet<String> set = new TreeSet<>();
        set.add("12");
        set.add("13");
        set.add("14");
        System.out.println(set.first());
        System.out.println(set.last());
        SortedSet<String> set2 = set.headSet("2");
        //set
        testLoop();

        for(var penguin : new int[2])
            System.out.println(penguin);

        final var s = "A";
        final String j = "1";
        switch (args[0]) {
            case s:
                System.out.println("!");
            case j:
                System.out.println("!!");
        }
    }

    public static <T> T getT(T t) {
        //TODO: дженерик в методе, <T> это как спецификатор
        return t;
    }

    public static <T> void analiz(T t) {
        //TODO: дженерик в методе, <T> это как спецификатор
    }

    public static <T, U> String call(T t, U u) {
        return (String) t;
    }

    private static void testLoop() {
        int[] weather = new int [] {0 , 1, 2, 3, 4, 5};
        for (int i=0; i<=weather.length-1; i++) {
            System.out.println(weather[i]);
        }
    }
}
