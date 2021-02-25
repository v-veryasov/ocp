package algo.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// n^2
public class Selection {
    public static void main(String[] args) {
        int[] i = new int[]{4, 2, 8, 1, 5, 6};
        sort(i);
        System.out.println(Arrays.toString(i));
    }

    private static int[] sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
