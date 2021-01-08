package 아직안품_L2_괄호_변환;

import java.util.Stack;

public class Solution {
    public static String solution(String p) {
        String answer = "";

        Stack<Character> open = new Stack<>();
        Stack<Character> close = new Stack<>();

        String u = "";
        String v = "";
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '(') {
                if (close.isEmpty()) {
                    answer += new StringBuilder(v).reverse();
                    v = "";
                    open.push('(');
                    u += '(';
                } else {
                    close.pop();
                    v += '(';
                }
            } else if (p.charAt(i) == ')') {
                if (open.isEmpty()) {
                    answer += u;
                    u = "";
                    close.push(')');
                    v += ')';
                } else {
                    open.pop();
                    u += ')';
                }
            }
        }

        if (!u.isEmpty())
            answer += u;
        else if (!v.isEmpty())
            answer += new StringBuilder(v).reverse();

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(")()()()("));
    }
}
