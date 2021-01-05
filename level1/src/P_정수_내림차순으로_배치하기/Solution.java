package P_정수_내림차순으로_배치하기;

import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static long solution(long n) {
        char[] c = String.valueOf(n).toCharArray();

        Arrays.sort(c);

        return Long.parseLong(new StringBuilder(String.valueOf(c)).reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(solution(118372));
    }
}
