package algo.find;

import collection.StreamsT;

import java.util.List;

public class Tet {

    public static void main(String[] args) {
        //System.out.println(findCount(List.of(1, 2, 2, 2, 3), 2));
        System.out.println(longestPalindrome("aacabdkacaa"));
    }

    public static String longestPalindrome(String s) {
        String pol = "";
        StringBuilder result = new StringBuilder();
        int idxPol = 0;
        var str = s.split("");
        for (int i = 0; i < s.length(); i++) {
            result.append(str[i]);
            if (s.contains(result.reverse())) {
                idxPol = i;
                if (pol.length() < result.length()) {
                    pol = result.toString();
                }
                result.reverse();
            } else {
                result.setLength(0);
                i = idxPol;
            }
        }
        return pol;
    }

    public static int findCount(final List<Integer> A, int B) {
        int start = 0;
        int end = A.size() - 1;
        int existB = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (A.get(mid) == B) {
                return mid;
            }

            if (A.get(mid) > B) {
                end = mid - 1;
            }

            if (A.get(mid) < B) {
                start = mid + 1;
            }

        }
        return existB;
    }

}
