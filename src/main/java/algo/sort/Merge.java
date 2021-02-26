package algo.sort;

import java.util.Arrays;

// n(log(n)) | больше потребяет памяти, чем Quick
public class Merge {
    public static void main(String[] args) {
        int[] i = new int[]{4, 2, 8, 1, 5, 6, 7, 3};
        mergeSort2(i, 0, i.length - 1);
        System.out.println(Arrays.toString(i));
    }

    public static void mergeSort2(int[] array, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort2(array, start, mid);
            mergeSort2(array, mid + 1, end);
            merge2(array, start, mid, end);
        }
    }

    public static void merge2(int arr[], int start, int mid, int end) {
        System.out.println("start " + start + " min " + mid + " end " + end);

        // вычисляем длину
        int lengthLeft = mid - start + 1;
        int lengthRight = end - mid;

        // создаем временные подмассивы
        int leftArray[] = new int[lengthLeft];
        int rightArray[] = new int[lengthRight];

        int n = arr.length - 1;

        if (n < 2) {
            return;
        }

        // копируем отсортированные массивы во временные
        for (int i = 0; i < lengthLeft; i++) {
            leftArray[i] = arr[start + 1];
//            System.out.println("leftArray[] " + leftArray[i]);
        }
        for (int i = 0; i < lengthRight; i++) {
            rightArray[i] = arr[mid + i + 1];
//            System.out.println("rightArray[] " + rightArray[i]);
        }
//        System.out.println("leftArray " + lengthLeft + " lengthRight " + lengthRight);
    }


    public static void mergeSort(int[] array, int left, int right) {
        if (right <= left) return;
        int mid = (left + right) / 2;
        mergeSort(array, left, mid);
        mergeSort(array, mid + 1, right);
        merge(array, left, mid, right);
    }

    static void merge(int[] array, int left, int mid, int right) {
        // вычисляем длину
        int lengthLeft = mid - left + 1;
        int lengthRight = right - mid;

        // создаем временные подмассивы
        int leftArray[] = new int[lengthLeft];
        int rightArray[] = new int[lengthRight];

        // копируем отсортированные массивы во временные
        for (int i = 0; i < lengthLeft; i++)
            leftArray[i] = array[left + i];
        for (int i = 0; i < lengthRight; i++)
            rightArray[i] = array[mid + i + 1];

        // итераторы содержат текущий индекс временного подмассива
        int leftIndex = 0;
        int rightIndex = 0;

        // копируем из leftArray и rightArray обратно в массив
        for (int i = left; i < right + 1; i++) {
            // если остаются нескопированные элементы в R и L, копируем минимальный
            if (leftIndex < lengthLeft && rightIndex < lengthRight) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                } else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            }
            // если все элементы были скопированы из rightArray, скопировать остальные из leftArray
            else if (leftIndex < lengthLeft) {
                array[i] = leftArray[leftIndex];
                leftIndex++;
            }
            // если все элементы были скопированы из leftArray, скопировать остальные из rightArray
            else if (rightIndex < lengthRight) {
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }
}
