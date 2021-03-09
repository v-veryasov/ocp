package algo.find;

//O(log (N))
public class Binary extends Find {
    public static void main(String[] args) {
        int[] arr = new int[]{11, 24, 26, 67, 76, 88};
        //int index = binarySearch(arr, 67);
        int index = recursiveBinarySearch(arr, 0, arr.length, 26);
        print(67, index);
    }

    public static int binarySearch(int arr[], int elementToSearch) {

        int firstIndex = 0;
        int lastIndex = arr.length - 1;

        // условие прекращения (элемент не представлен)
        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            // если средний элемент - целевой элемент, вернуть его индекс
            if (arr[middleIndex] == elementToSearch) {
                return middleIndex;
            }

            // если средний элемент меньше
            // направляем наш индекс в middle+1, убирая первую часть из рассмотрения
            else if (arr[middleIndex] < elementToSearch)
                firstIndex = middleIndex + 1;

                // если средний элемент больше
                // направляем наш индекс в middle-1, убирая вторую часть из рассмотрения
            else if (arr[middleIndex] > elementToSearch)
                lastIndex = middleIndex - 1;

        }
        return -1;
    }

    public static int recursiveBinarySearch(int arr[], int firstElement, int lastElement, int elementToSearch) {

        if (lastElement >= firstElement) {
            int mid = firstElement + (lastElement - firstElement) / 2;

            if (arr[mid] == elementToSearch) {
                return mid;
            }

            if (arr[mid] > elementToSearch) {
                return recursiveBinarySearch(arr, firstElement, mid - 1, elementToSearch);
            }
            if (arr[mid] < elementToSearch) {
                return recursiveBinarySearch(arr, mid + 1, lastElement, elementToSearch);
            }

        }

        return -1;
    }
}
