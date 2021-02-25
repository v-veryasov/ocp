package leedCode;

import java.util.HashSet;

public class Substring {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("aab"));
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 1)
            return 1;

        int max = 0;
        int index = 0;
        int start = 0;
        boolean flagStPos = true;
        HashSet<Object> objects = new HashSet<>();
        while (index < s.length()) {
            if (flagStPos) {
                start = index;
                flagStPos = false;
            }
            if (!objects.add(s.charAt(index))) {
                //вычисление размера
                if (max < objects.size()) {
                    max = objects.size();
                }
                objects.clear();
                index = start;
                flagStPos = true;
            }

            index++;
        }

        if (max < objects.size()) {
            max = objects.size();
        }
        return max;
    }
}
