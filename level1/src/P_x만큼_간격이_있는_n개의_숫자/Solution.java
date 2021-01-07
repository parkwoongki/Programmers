package P_x만큼_간격이_있는_n개의_숫자;

public class Solution {
    public static long[] solution(long x, int n) {
        long[] answer = new long[n];

        for (int i = 1; i <= n; i++) {
            answer[i - 1] = x * i;
        }

        return answer;
    }

    public static void main(String[] args) {
        long[] a = solution(-4, 2);

        for (long l : a) {
            System.out.print(l + " ");
        }
    }
}
