package leedCode;

import java.util.ArrayList;

public class SpiralTest {

    public static void main(String[] args) {
        var temp = new SpiralTest().prettyPrint(3);
        for (var i : temp) {
            for (var j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public ArrayList<ArrayList<Integer>> prettyPrint(int A) {

        int right = (A * 2) - 1;

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int tempA = A;
        int selector = 0;
        int mirror = 0;
        for (int i = 0; i < right; i++) {
            ArrayList<Integer> str = new ArrayList<>();
            if (selector - 1 >= 0) {
                for (int k = 0; k < selector; k++) {
                    str.add(list.get(selector - 1).get(k));
                }
            }
            for (int j = 0; j < right - selector * 2; j++) {
                str.add(tempA);
            }
            if (selector - 1 >= 0) {
                for (int k = selector -1; k >= 0; k--) {
                    str.add(list.get(selector - 1).get(k));
                }
            }
            list.add(str);
            if (selector + 1 == A)
                mirror++;

            if (mirror == 0) {
                selector++;
                tempA--;
            } else {
                selector--;
                tempA++;
            }

        }

        return list;
    }
}
