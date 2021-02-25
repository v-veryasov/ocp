package algo.sort;

import java.util.Arrays;

//nLog(n)
public class Quick {
    public static void main(String[] args) {
        int[] i = new int[]{4, 2, 8, 1, 5, 6};
        quickSort(i, 0, i.length - 1);
        System.out.println(Arrays.toString(i));
    }

    static int partition(int[] array, int begin, int end) {
        int pivot = end;

        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (array[i] < array[pivot]) {
                int temp = array[counter];
                array[counter] = array[i];
                array[i] = temp;
                counter++;
            }
        }
        int temp = array[pivot];
        array[pivot] = array[counter];
        array[counter] = temp;

        return counter;
    }

    public static void quickSort(int[] array, int begin, int end) {
        if (end <= begin) return;
        int pivot = partition(array, begin, end);
        quickSort(array, begin, pivot-1);
        quickSort(array, pivot+1, end);
    }
}
