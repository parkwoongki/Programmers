package L2_기능개발;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};

        List<Integer> result = new ArrayList<>();
        int loc = 0;
        do {
            for (int i = 0; i < progresses.length; i++) {
                progresses[i] += speeds[i];
            }
//            for (int progress : progresses) {
//                System.out.print(progress + " ");
//            }
//            System.out.println();

            int count = 0;
            for (int i = loc; i < progresses.length; i++) {
                if (progresses[i] >= 100) {
                    count++;
                    loc++;
                } else
                    break;
            }
//            System.out.print(count + " ");
            if (count != 0)
                result.add(count);

        } while (loc != progresses.length);

//        for (Integer integer : result) {
//            System.out.println(integer);
//        }

        return result.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] p = {95, 90, 99, 99, 80, 99};
        int[] s = {1, 1, 1, 1, 1, 1};
        int[] result = solution(p, s);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
