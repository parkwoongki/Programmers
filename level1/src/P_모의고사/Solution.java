package P_모의고사;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static int[] solution(int[] answers) {
        int[] answer = {};
        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] s3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] s = new int[3];

        int l1 = s1.length;
        int l2 = s2.length;
        int l3 = s3.length;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == s1[i % l1])
                s[0]++;
            if (answers[i] == s2[i % l2])
                s[1]++;
            if (answers[i] == s3[i % l3])
                s[2]++;
        }

        int max = s[0];
        for (int i = 1; i < 3; i++) {
            max = Math.max(max, s[i]);
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (s[i] == max) {
                list.add(i + 1);
            }
        }
        answer = list.stream().mapToInt(i -> i).toArray();

        return answer;
    }

    public static void main(String[] args) {
        int[] answers = {1, 2, 3, 4, 5};

        System.out.println(solution(answers));
    }
}
