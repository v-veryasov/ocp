package collection;

import java.util.ArrayList;
import java.util.List;

public class EffectRemove {
    public static void main(String[] args) {
        List<Integer> iin = new ArrayList<>();

        for (int i = 0; i < 1_000_000; i++) {
            iin.add(i);
        }
        List<Integer> iin2 = new ArrayList<>(iin);
        int s = 500_000, l = 100_000;

        long st = System.currentTimeMillis();
        for (int k = s - 1; k < (s + l) - 1; k++) {
            iin.remove(k);
        }
        System.out.println("remove, speed = " + (System.currentTimeMillis() - st) + " size = " + iin.size());

        st = System.currentTimeMillis();
        iin2.subList(s - 1, s + l -1).clear();
        System.out.println("subList, speed = " + (System.currentTimeMillis() - st) + " size = " + iin2.size());
    }
}
