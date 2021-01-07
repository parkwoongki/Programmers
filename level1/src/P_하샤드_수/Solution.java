package P_하샤드_수;

public class Solution {
    public static boolean solution(int x) {
        boolean answer = true;
        int n = x;
        int d = 0;

        while (true) {
            d += n % 10;
            n /= 10;

            if (n == 0)
                break;
        }

        if (x % d != 0)
            answer = false;

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
    }
}
