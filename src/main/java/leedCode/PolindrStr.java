package leedCode;

public class PolindrStr {

    public static void main(String[] args) {
        System.out.print(longestPalindrome("babad"));
    }

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
            } else if ( pol.length() < str[i].length()){
                pol = str[i];
            }
        }
        return pol;
    }

    private static boolean isPol(String examp) {
        var temp = new StringBuilder(examp);
        return examp.equals(temp.reverse().toString());
    }
}
