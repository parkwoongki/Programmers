package L2_프린터;

import java.util.*;

public class Solution {
    public static int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for (int priority : priorities) {
            queue.add(priority);
        }

        // 2 1 3 2 : 배열
        // 3 2 2 1 : 큐
        while (!queue.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (queue.peek() == priorities[i]) {
                    System.out.println("peek, i = " + queue.peek() + " " + i);

                    queue.poll();
                    answer++;
                    if (location == i) {
                        queue.clear();
                        break;
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 9, 1, 1, 1};
        System.out.println(solution(a, 0));
    }
}
