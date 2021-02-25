package algo.sort;

import java.util.Arrays;

// n^2
public class Bubble {
    public static void main(String[] args) {
        int[] i = new int[]{4, 4, 3, 6, 5};
        bubbleSort(i);
        System.out.println(Arrays.toString(i));
    }

    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
}
