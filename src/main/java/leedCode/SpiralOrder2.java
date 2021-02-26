package leedCode;

import java.util.LinkedList;
import java.util.List;

public class SpiralOrder2 {
    public static void main(String[] args) {

        int[][] height = {
                {2, 3, 4},
                {5, 6, 7},
                {8, 9, 10},
                {11, 12, 13}};

//        int[][] height = {
//                {1, 2, 3, 4, 5},
//                {6, 7, 8, 9, 10},
//                {11, 12, 13, 14, 15},
//                {16, 17, 18, 19, 20},
//                {21, 22, 23, 24, 25}
//        };

//        spiralOrder(height).forEach(i -> System.out.print(i + " "));
        int[][] ints = generateMatrix(3);
        for (int[] i : ints) {
            for (int j : i) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static List<Integer> spiralOrder2(int[][] matrix) {
        int top = 0;
        int button = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        List<Integer> list = new LinkedList<>();
        int dir = 0;
        while (top <= button && left <= right) {
            if (dir == 0) {
                for (int i = left; i <= right; i++) {
                    list.add(matrix[top][i]);
                }
                top++;
                dir++;
            } else if (dir == 1) {
                for (int i = top; i <= button; i++) {
                    list.add(matrix[i][right]);
                }
                right--;
                dir++;
            } else if (dir == 2) {
                for (int i = right; i >= left; i--) {
                    list.add(matrix[button][i]);
                }
                button--;
                dir++;
            } else if (dir == 3) {
                for (int i = button; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
                dir = 0;
            }
        }
        return list;
    }

    public static int[][] generateMatrix(int n) {
        int top = 0;
        int button = n - 1;
        int left = 0;
        int right = n - 1;
        int[][] res = new int[n][n];
        int dir = 0;
        int el = 1;
        while (top <= button && left <= right) {
            if (dir == 0) {
                for (int i = left; i <= right; i++) {
                    res[top][i] = el;
                    el++;
                }
                top++;
                dir++;
            } else if (dir == 1) {
                for (int i = top; i <= button; i++) {
                    res[i][right] = el;
                    el++;
                }
                right--;
                dir++;
            } else if (dir == 2) {
                for (int i = right; i >= left; i--) {
                    res[button][i] = el;
                    el++;
                }
                button--;
                dir++;
            } else if (dir == 3) {
                for (int i = button; i >= top; i--) {
                    res[i][left] = el;
                    el++;
                }
                left++;
                dir = 0;
            }
        }
        return res;
    }
}
