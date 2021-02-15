package sort;

import java.util.Arrays;

// n^2
public class Selection {
    public static void main(String[] args) {
        int[] i = new int[]{1, 2, 5, 4, 3, 6};
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
