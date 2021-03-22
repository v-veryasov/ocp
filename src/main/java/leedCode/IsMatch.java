package leedCode;

public class IsMatch {
    public static void main(String[] args) {
        System.out.println(isMatch("aab", "c*a*b"));
    }
    public static boolean isMatch(String s, String p) {
        if (!s.isEmpty() && p.isEmpty()
                || (s.isEmpty() && !p.isEmpty())) {
            return false;
        }

        String[] massS = s.split("");
        String[] massP = p.split("");

        int pointer_s = 0;
        int pointer_p = 0;

        boolean markDel = false;
        while(pointer_s <= s.length() - 1 && pointer_p <= p.length() - 1) {

            switch(massP[pointer_p]) {
                case ".":
                    pointer_s++;
                    pointer_p++;
                    break;
                case "*":
                    String temp = massP[pointer_p - 1];
                    if (temp.equals(".")) {
                        temp = massS[pointer_s -1];
                    }
                    while (pointer_s <= s.length() - 1 && massS[pointer_s].equals(temp)) {
                        pointer_s++;
                    }
                    pointer_p++;
                    break;
                default:
                    if (massS[pointer_s].equals(massP[pointer_p])) {
                        pointer_s++;
                        pointer_p++;
                    } else {
                        markDel = true;
                        pointer_p++;
                    }
                    break;

            }

        }

        return pointer_s >= s.length() - 1;

    }
}
