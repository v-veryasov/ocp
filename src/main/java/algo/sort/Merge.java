package algo.sort;

import java.util.Arrays;

// n(log(n)) | больше потребяет памяти, чем Quick
public class Merge {
    public static void main(String[] args) {
        int[] i = new int[]{1, 2, 8, 1, 5, 6, 7, 3, 9};
        mergeSort(i, 1, i.length);
        System.out.println(Arrays.toString(i));
    }


    public static void merge2(int[] arr, int start, int mid, int end) {
        // все эти переменные - размер массивов
        int leftL = mid - start + 1;
        int rightL = end - mid;

        int[] leftArr = new int[leftL];
        int[] rightArr = new int[rightL];

        if (leftL >= 0)
            System.arraycopy(arr, start - 1, leftArr, 0, leftL);
        if (rightL >= 0)
            System.arraycopy(arr, mid, rightArr, 0, rightL);
        //индексы с нуля =>
        int i = 0, j = 0, k = start - 1;
        while (i < leftL && j < rightL) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                k++;
                i++;
            } else {
                arr[k] = rightArr[j];
                k++;
                j++;
            }
        }

        while (i < leftL) {
            arr[k] = leftArr[i];
            k++;
            i++;
        }
        while (j < rightL) {
            arr[k] = rightArr[j];
            k++;
            j++;
        }
    }

    public static void mergeSort(int[] array, int left, int right) {
        if (right <= left)
            return;
        int mid = (left + right) / 2;
        mergeSort(array, left, mid);
        mergeSort(array, mid + 1, right);
        merge2(array, left, mid, right);
    }
}
