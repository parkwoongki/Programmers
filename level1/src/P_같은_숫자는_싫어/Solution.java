package P_같은_숫자는_싫어;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public static int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        Set<Integer> hs = new HashSet<>(list);

        list = new ArrayList<Integer>(hs);
        answer = list.stream().mapToInt(i -> i).toArray();

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        arr = solution(arr);

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
