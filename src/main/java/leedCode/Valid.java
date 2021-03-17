package leedCode;

import java.util.ArrayDeque;

public class Valid {
    private static final ArrayDeque<String> stack = new ArrayDeque<>();

    public static boolean isValid(String s) {
        String open = "({[";
        for (String str : s.split("")) {
            if (open.contains(str)) {
                stack.push(str);
            } else if (!stack.isEmpty() && stack.peek().equals(revert(str))) {
                stack.pop();
            } else {
                return false;
            }

        }
        return stack.isEmpty();
    }

    private static String revert(String str) {
        switch (str) {
            case ")":
                return "(";
            case "}":
                return "{";
            case "]":
                return "[";
            default:
                throw new IllegalArgumentException();
        }
    }

    public static boolean isValid2(String s) {
        final ArrayDeque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if ((!stack.isEmpty() && stack.peek() == c)) {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        //stack.push("A");
        //stack.push("B");
        //stack.push("C");
        //
        //System.out.println(stack.pop());
        //System.out.println(stack.peek());
        System.out.println(isValid2("({[])"));
    }
}
