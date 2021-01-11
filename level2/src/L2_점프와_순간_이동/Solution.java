package L2_점프와_순간_이동;

public class Solution {
    public static int solution(int n) {
        int ans = 0;

        while (n != 0) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n - 1;
                ans++;
            }
        }

        return ans;
    }

    public static int solution2(int n) {
        return Integer.bitCount(n);
    }

    public static void main(String[] args) {
        System.out.println(solution(5000));
    }
}
