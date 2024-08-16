package algorithms.easy;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        //(){}[]
//        String[] array = s.split("");
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if ('(' == s.charAt(i) || '{' == s.charAt(i) || '[' == s.charAt(i)) {
                stack.push(s.charAt(i));
            } else if (stack.empty()) {
                return false;
            } else if (')' == s.charAt(i) && stack.peek().equals('(')) {
                stack.pop();
            } else if ('}' == s.charAt(i) && stack.peek().equals('{')) {
                stack.pop();
            } else if (']' == s.charAt(i) && stack.peek().equals('[')) {
                stack.pop();
            }else return false;
        }

        return stack.empty();
    }
}
