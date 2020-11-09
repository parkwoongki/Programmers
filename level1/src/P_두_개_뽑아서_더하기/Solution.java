package P_두_개_뽑아서_더하기;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static int[] solution(int[] numbers) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int number = numbers[i] + numbers[j];
                if (!list.contains(number)) {
                    list.add(number);
                }
            }
        }

        Collections.sort(list);

        answer = list.stream().mapToInt(i -> i).toArray();

//        for (Integer integer : list) {
//            System.out.print(integer + " ");
//        }

        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 1, 3, 4, 1};

        System.out.println("solution() = " + solution(numbers));
    }
}
