package L2_멀쩡한_사각형;

public class Solution {
    public static long solution(int w, int h) {
        long divider = gdc(w, h);
        long tw = (long)w / divider;
        long th = (long)h / divider;

        long answer = (long)w * (long)h - (tw + th - 1) * divider;

        return answer;
    }

    public static long gdc(long a, long b) {
        while (b > 0) {
            long tmp = a;
            a = b;
            b = tmp % b;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(solution(8, 12));
    }
}
