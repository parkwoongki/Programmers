package P_최대공약수와_최소공배수;

public class Solution {
    public static int[] solution(int n, int m) {
        int[] answer = new int[2];

        int l = Math.max(n, m);
        int s = Math.min(n, m);

        answer[0] = gcd(l, s);
        answer[1] = l * s / answer[0];

        return answer;
    }

    public static int gcd(int a, int b) {
        if (a % b == 0)
            return b;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int[] a = solution(2, 5);

        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
