package algo.sort;

import java.util.Arrays;

// n^2
public class Insertion {
    public static void main(String[] args) {
        int[] i = new int[]{4, 2, 8, 1, 5, 6};
        sort(i);
        System.out.println(Arrays.toString(i));
    }

    private static void sort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
