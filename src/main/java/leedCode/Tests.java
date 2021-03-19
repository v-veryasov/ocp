package leedCode;


import java.util.HashSet;
import java.util.Set;

public class Tests {
    public static int[] redus(int[] a, int[] b) {

        Set<Integer> set = new HashSet<>();
        for (int i : a) {
            for (int j : b) {
                if (i == j) {
                    set.add(i);
                }
            }
        }
        int[] ints = new int[set.size()];
        var jj = set.iterator();
        int i = 0;
        while (jj.hasNext()) {
            ints[i++] = jj.next();
        }
        return ints;
    }

    public static int[] redusB(int[] a, int[] b) {

        Set<Integer> setA  = new HashSet<>();
        for (int anInt : a) {
            setA.add(anInt);
        }

        Set<Integer> tempResult = new HashSet<>();
        for (int i : b) {
            if (setA.contains(i)) {
                tempResult.add(i);
            }
        }

        int[] result = new int[tempResult.size()];
        int pos = 0;
        for (Integer i : tempResult) {
            result[pos++] = i;
        }
        return result;
    }

    private static Set<Integer> toSet(int[] ints) {
        Set<Integer> set = new HashSet<>();
        for (int anInt : ints) {
            set.add(anInt);
        }
        return set;
    }


    public static void main(String[] args) {
        int[] arr = redusB(new int[]{1, 2, 3, 4, 3}, new int[]{3, 4});
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
