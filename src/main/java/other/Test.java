package other;

import java.util.Arrays;
import java.util.List;

public class Test {
    public void run(Integer[] ints, Double[] doubles) {
        List<Integer> intList = Arrays.asList(ints);
        List<Double> doubleList = List.of(doubles);

        //add() not supported
//        intList.add(1);
//        doubleList.add(1.);

        intList.set(1, 44);

        //add(x, yy) not supported
//        intList.add(1, 41);

//        doubleList.set(1, 44.);
//        System.out.println(doubleList);

        System.out.println("List is " + intList.toString());
        System.out.println("Array chang! " + Arrays.toString(ints));
    }

    private static void testMath() {
        int i = Math.round(1.0F);
        long l = Math.round(1.0);

        double d = Math.random();

    }

    private static void testCompare() {
        String[] s1 = { "Camel", "Peacock", "Llama"};
        String[] s2 = { "Camel", "Llama", "Peacock"};
        String[] s3 = { "Camel"};
        String[] s4 = { "Camel", null};
        System.out.println(Arrays.compare(s1, s2));
        System.out.println(Arrays.mismatch(s1, s2));
        System.out.println();
        System.out.println(Arrays.compare(s3, s4));
        System.out.println(Arrays.mismatch(s3, s4));
        System.out.println();
        System.out.println(Arrays.compare(s4, s4));
        System.out.println(Arrays.mismatch(s4, s4));
    }

    public static void main(String[] args) {
        new Test().run(new Integer[]{1, 2, 3}, new Double[]{1., 2., 3.});
        testCompare();
        testMath();
    }
}

