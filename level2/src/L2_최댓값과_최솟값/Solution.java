package L2_최댓값과_최솟값;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
    public static String solution(String s) {
        StringTokenizer st = new StringTokenizer(s, " ");
        int size = st.countTokens();

        int[] a = new int[size];

        for (int i = 0; i < size; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);
        StringBuilder sb = new StringBuilder();
        sb.append(a[0]).append(" ").append(a[a.length - 1]);

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("-1 -2 -3 -4"));
    }
}
