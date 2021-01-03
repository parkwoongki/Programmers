package P_문자열_다루기_기본;

public class Solution {
    public static boolean solution(String s) {
        boolean answer = true;

        if (s.length() != 4 && s.length() != 6)
            answer = false;

        try {
            Integer.parseInt(s);
        } catch (Exception e) {
            answer = false;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("4444a4"));
    }
}
