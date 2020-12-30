package P_나누어_떨어지는_숫자_배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();

        Arrays.sort(arr);
        for (int i : arr) {
            if (i % divisor == 0)
                list.add(i);
        }

        if (list.size() == 0)
            list.add(-1);

        return list.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] answer = {3, 2, 6};
        answer = solution(answer, 10);
        for (int i : answer) {
            System.out.print(i + " ");
        }
    }
}
