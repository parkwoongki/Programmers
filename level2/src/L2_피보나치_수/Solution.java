package L2_피보나치_수;

public class Solution {
    public static int solution(int n) {
        int[] dp = new int[100001];

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i < dp.length; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567;
        }

        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(solution(3));
    }
}
