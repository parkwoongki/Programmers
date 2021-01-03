package P_문자열을_정수로_바꾸기;

public class Solution {
    public static int solution(String s) {
        int answer = 0;

        answer = Integer.parseInt(s);

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("-1234"));
    }
}
