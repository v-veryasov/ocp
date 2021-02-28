package algo.sort;

import java.util.Arrays;

//nLog(n)
public class Quick {
    public static void main(String[] args) {
        int[] i = new int[]{4, 2, 8, 1, 5, 6};
        sort(i, 0, i.length - 1);
        System.out.println(Arrays.toString(i));
    }

    // все значения это интдексы
    public static void sort(int[] array, int begin, int end) {
        if (end <= begin)
            return;
        int pivot = partition2(array, begin, end);
        sort(array, begin, pivot - 1);
        sort(array, pivot + 1, end);
    }

    static int partition2(int[] array, int begin, int end) {
        int nIdxPiv = begin;

        for (int i = begin; i < end; i++) {
            if (array[i] <= array[end]) {
                int temp = array[i];
                array[i] = array[nIdxPiv];
                array[nIdxPiv] = temp;
                nIdxPiv++;
            }
        }
        int temp = array[nIdxPiv];
        array[nIdxPiv] = array[end];
        array[end] = temp;

        return nIdxPiv;
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
