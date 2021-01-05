package P_정수_제곱근_판별;

public class Solution {
    public static long solution(long n) {
        double p = Math.sqrt(n);

        if (p == (int) p)
            return (long) (Math.pow(p + 1, 2));
        else
            return -1;
    }

    public static void main(String[] args) {
        System.out.println(solution(144));
    }
}
