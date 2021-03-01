package leedCode;

public class RemoveDuplicates {

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1, 2, 1}));
    }

    public static int removeDuplicates(int[] nums) {
        int pointer_a = 0;
        int pointer_b = 1;

        while (pointer_b < nums.length) {
            if (nums[pointer_a] != nums[pointer_b]) {
                nums[++pointer_a] = nums[pointer_b];
                pointer_b++;
            } else {
                pointer_b++;
            }
        }

        return pointer_a + 1;
    }
}
