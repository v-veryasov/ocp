package leedCode;

public class PolindrStr {

    public static void main(String[] args) {
        System.out.print(longestPalindrome3("babad"));
    }

    public static String longestPalindrome2(String s) {
        var str = s.split("");
        var pol = str[0];
        int iterator_b = s.length() - 2 >= 0 ? (s.length() - 1) - (s.length() - 2) : 0;
        int pointer_a = 0;
        int pointer_b = iterator_b;

        while (pointer_a < pointer_b) {

            if (pointer_b - pointer_a >= 2) {
                //рекурсия в середину, и перепорверка на полиндром

            } else {
                var temp = s.substring(pointer_a, 1 + pointer_b);
                if (str[pointer_a].equals(str[pointer_b]) && isPol(temp) && pol.length() < temp.length()) {
                    pol = temp;
                }
            }
            pointer_a++;
            pointer_b++;
            if (pointer_b > s.length() - 1) {
                pointer_a = 0;
                pointer_b = ++iterator_b;

            }
            if (iterator_b > s.length() - 1) {
                return pol;
            }
        }
        return pol;
    }

//    private static isPol() {
//
//
//    }

    public static String longestPalindrome(String s) {
        var pol = "";
        var str = s.split("");

        for (int i = 0; i < s.length(); i++) {
            if (s.substring(1 + i).contains(str[i])) {
                for (int j = s.length() - 1; j >= i; j--) {
                    if ((j - i) + 1 > pol.length()) {
                        var temp = s.substring(i, 1 + j);
                        if (str[i].equals(str[j]) && isPol(temp) && pol.length() < temp.length()) {
                            pol = temp;
                        }
                    }
                }
                if (pol.length() == s.length() - i) {
                    return pol;
                }
            } else if (pol.length() < str[i].length()) {
                pol = str[i];
            }
        }
        return pol;
    }

    private static boolean isPol(String examp) {
        var temp = new StringBuilder(examp);
        return examp.equals(temp.reverse().toString());
    }

    public static String longestPalindrome3(String s) {

        int start = 0;
        int end = 0;

        for(int i = 0; i < s.length(); i++) {

            int lenOdd = lenOfPalidrome(s, i, i);
            int lenEven = lenOfPalidrome(s, i, i+1);

            int maxCurrentLen = Math.max(lenOdd, lenEven);

            if(maxCurrentLen > end-start+1) {

                start = i - (maxCurrentLen-1) / 2;
                end = i + maxCurrentLen / 2;

            }
        }

        return s.substring(start, end+1);
    }


    public static int lenOfPalidrome(String s, int start, int end) {

        while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
        }

        return end - start - 1;
    }

}
