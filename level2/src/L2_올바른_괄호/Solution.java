package L2_올바른_괄호;

import java.util.Stack;

public class Solution {
    public static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        char[] cs = s.toCharArray();

        for (int i = 0; i < cs.length; i++) {
            if (stack.isEmpty()) {
                stack.push(cs[i]);
                continue;
            }
            if (cs[i] == '(')
                stack.push(cs[i]);
            else if (cs[i] == ')')
                stack.pop();

        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "(())";
        System.out.println(solution(s));
    }
}
