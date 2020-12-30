package P_두_정수_사이의_합;

public class Solution {
    public static long solution(int a, int b) {
        long answer = 0;

        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }

        for (int i = a; i <= b; i++) {
            answer += i;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println("solution = " + solution(3, 3));
    }
}
