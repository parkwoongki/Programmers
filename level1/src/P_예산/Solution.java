package P_예산;

import java.util.Arrays;

public class Solution {
    public static int solution(int[] d, int budget) {
        Arrays.sort(d);

        int result = 0;

        for (int i = 0; i < d.length; i++) {
            budget -= d[i];
            if (budget < 0)
                break;
            result++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 2, 5, 4};
        System.out.println(solution(a, 9));
    }
}
