package P_약수의_합;

public class Solution {
    public static int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0)
                answer += i;
        }

        return answer + n;
    }

    public static void main(String[] args) {
        System.out.println(solution(5));
    }
}
