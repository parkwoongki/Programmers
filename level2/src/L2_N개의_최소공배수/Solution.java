package L2_N개의_최소공배수;

public class Solution {
    public static int solution(int[] arr) {
        int lcm = arr[0];

        for (int i = 1; i < arr.length; i++) {
            lcm = getLCM(lcm, arr[i]);
        }

        return lcm;
    }

    public static int getLCM(int a, int b) {
        return a * b / getGCD(a, b);
    }

    public static int getGCD(int a, int b) {
        while (b > 0) {
            int tmp = a;
            a = b;
            b = tmp % b;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = {2, 6, 8, 14};
        System.out.println(solution(a));
    }
}
