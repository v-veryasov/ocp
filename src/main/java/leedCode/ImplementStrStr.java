package leedCode;

public class ImplementStrStr {

    public static void main(String[] args) {
        System.out.println(new ImplementStrStr().strStr("mississippi", "ihgdvs"));
    }

    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
//        if (haystack.contains(needle)) {
//            System.out.println("YES!");
//            return haystack.indexOf(needle);
//        }
        int pointer_a = 0;
        int pointer_b = 0;
        boolean reset_b = false;
        int idx_result = -1;
        while (pointer_b < needle.length() && pointer_a < haystack.length()) {
            if (needle.charAt(pointer_b) == haystack.charAt(pointer_a)) {
                if (!reset_b) {
                    idx_result = pointer_a;
                }
                reset_b = true;
                pointer_b++;
                pointer_a++;
            } else if (!reset_b) {
                pointer_a++;
            } else if (reset_b) {
                reset_b = false;
                pointer_a = idx_result+1;
                pointer_b = 0;
            }
        }

        if (pointer_b < needle.length()) {
            idx_result = -1;
        }
        return idx_result;
    }
}
