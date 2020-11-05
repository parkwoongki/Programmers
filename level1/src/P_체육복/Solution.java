package P_체육복;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        int[] arr = reserve.clone();
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        // 5	[2, 4]	[1, 3, 5]	5
        answer += lost.length;
        for (int i = 0; i < lost.length; i++) {
//            System.out.println("lost[i] = " + lost[i]);
            if (answer == 0)
                break;

            Integer integer1 = lost[i] - 1;
            if (list.contains(integer1)) {
                list.remove(integer1);
                answer--;
                continue;
            }

            Integer integer2 = lost[i];
            if (list.contains(integer2)) {
                list.remove(integer2);
                answer--;
                continue;
            }

            Integer integer3 = lost[i] + 1;
            if (list.contains(integer3)) {
                list.remove(integer3);
                answer--;
            }
        }

        return n - answer;
    }

    public static void main(String[] args) {
        int[] lost = {2, 4};
        int[] reverse = {1, 3, 5};
        System.out.println(solution(5, lost, reverse));
    }
}
