package L2_H_Index;

import java.util.Arrays;

public class Solution {
    public static int solution(int[] citations) {
        Arrays.sort(citations);

        // 3, 0, 6, 1, 5 => 6 5 3 1 0
        int answer = 0;
        for (int i = 0; i < citations.length; i++) {
            int h = citations.length - i;
            if (citations[i] >= h) {
                answer = h;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] a = {3, 0, 6, 1, 5};
        int[] a1 = {1, 1, 1, 1, 1, 1, 8, 9};
        int[] a2 = {1, 7, 0, 1, 6, 4};
        System.out.println(solution(a));
    }
}
