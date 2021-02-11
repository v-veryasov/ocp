package leedCode;

import java.util.Arrays;
import java.util.Random;

public class Solution {
    public static void main(String[] args) {
        int[] ints = new int[1_000_000];
        Random random = new Random();
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt();
        }
        long start2 = System.currentTimeMillis();
        twoSumTwo(ints, 6);
        System.out.println(System.currentTimeMillis() - start2);

        long start = System.currentTimeMillis();
        twoSum(ints, 6);
        System.out.println(System.currentTimeMillis() - start);
//        System.out.println(Arrays.toString(ints1));


//        System.out.println(Arrays.toString(ints2));


    }

    public static int[] twoSum(int[] nums, int target) {
        return recursion(nums, 0, target);
    }

    private static int[] recursion(int[] nums, int index, int target) {

        for (int i = index + 1; i < nums.length; i++) {
            if (nums[i] + nums[index] == target) {
                int[] arrays = new int[2];
                arrays[0] = index;
                arrays[1] = i;
                return arrays;
            }
        }
        return recursion(nums, index + 1, target);
    }

    public static int[] twoSumTwo(int[] nums, int target) {

        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[j] == (target - nums[i])) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

//    public static int[] twoSumTwo(int[] nums, int target) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//        map.put(nums[i], i);
//        }
//
//        return new int[0];
//    }
}
