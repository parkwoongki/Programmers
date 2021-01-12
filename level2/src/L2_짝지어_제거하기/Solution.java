package L2_짝지어_제거하기;

import java.util.Stack;

public class Solution {
    public static int solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (stack.isEmpty())
                stack.push(c);
            else if (stack.peek() == c)
                stack.pop();
            else
                stack.push(c);
        }

        return stack.isEmpty() ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(solution("baabaa"));
    }
}
