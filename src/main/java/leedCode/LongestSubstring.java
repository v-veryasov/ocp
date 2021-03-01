package leedCode;

import java.util.HashSet;

public class LongestSubstring {
    public static void main(String[] args) {
        String  s = "abcabcbb";

        int i = 0;
        int j = 0;
        int max = 0;
        HashSet<Character> set = new HashSet<>();
        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;
                max = Math.max(set.size(), max);
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }

        System.out.println(max);
    }
}
