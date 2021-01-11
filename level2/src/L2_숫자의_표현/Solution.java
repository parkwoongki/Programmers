package L2_숫자의_표현;

public class Solution {
    public static int solution(int n) {
        int answer = 0;

        int sum;
        for (int i = 1; i <= n; i++) {
            sum = 0;
            for (int j = i; j <= n; j++) {
                sum += j;
                if (sum == n)
                    answer++;
                else if (sum > n)
                    break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(15));
    }
}
