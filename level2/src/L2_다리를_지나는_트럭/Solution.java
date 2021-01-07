package L2_다리를_지나는_트럭;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        Queue<Integer> queue = new LinkedList<>();
        int max = 0;
        for (int truck_weight : truck_weights) {
            while (true) {
                if (queue.isEmpty()) {
                    queue.offer(truck_weight);
                    max += truck_weight;
                    answer++;
                    break;
                } else if (queue.size() == bridge_length) {
                    max -= queue.poll();
                } else {
                    if (max + truck_weight > weight) {
                        queue.offer(0);
                        answer++;
                    } else {
                        queue.offer(truck_weight);
                        max += truck_weight;
                        answer++;
                        break;
                    }
                }
            }
        }

        return answer + bridge_length;
    }

    public static void main(String[] args) {
        int[] a = {7, 4, 5, 6};
        int[] b = {10};
        int[] c = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        System.out.println(solution(2, 10, a));
    }

    public static int solution2(int bridge_length, int weight, int[] truck_weights) {
        int answer = bridge_length;
        Queue<Integer> queue = new LinkedList<>();

        for (int truck_weight : truck_weights) {
            queue.offer(truck_weight);
        }

        while (!queue.isEmpty()) {
            int poll = queue.poll();
            int count = 1;
            while (!queue.isEmpty()) {
                if (poll + queue.peek() < weight) {
                    poll += queue.poll();
                    count++;
                    if (queue.isEmpty())
                        break;
                } else
                    break;
            }
            System.out.println(count);
            answer += count;
        }

        return answer;
    }
}
