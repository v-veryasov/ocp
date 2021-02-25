package pattern.po.Memento;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class T1 {
    // реализовать!
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

        spiralOrder(height).forEach(i -> System.out.print(i + " "));
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
            }  else if (dir == 3) {
                for (int i = button; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
                dir = 0;
            }
        }
        return list;
    }

    public static List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> list = new ArrayList<>();
        int rowStart = matrix.length - 1;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[0].length == 1) {
                for (int k = 0; k < matrix.length; k++) {
                    for (int j = 0; j < matrix[k].length; j++) {
                        list.add(matrix[k][j]);
                    }
                }
                return list;
            }
            if (i > rowStart) {
                return list;
            }
            for (int j = i; j < matrix[0].length - i; j++) {
                list.add(matrix[i][j]);
            }
            rowStart--;

            if (matrix.length == 1) {
                return list;
            }

            for (int j = 1 + i; j < matrix.length - i; j++) {
                list.add(matrix[j][matrix[j].length - 1 - i]);
            }

            for (int j = matrix[0].length - 2 - i; j > i; j--) {
                list.add(matrix[matrix.length - 1 - i][j]);
            }

            for (int j = matrix.length - 1 - i; j > i; j--) {
                list.add(matrix[j][i]);
            }
        }
        return list;
    }
}
