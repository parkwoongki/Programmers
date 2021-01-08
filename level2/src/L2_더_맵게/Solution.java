package L2_더_맵게;

import java.util.PriorityQueue;

public class Solution {
    public static int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i : scoville) {
            queue.add(i);
        }

        while (queue.peek() <= K) {
            if (queue.size() == 1) {
                answer = -1;
                break;
            }

            int first = queue.poll();
            int second = queue.poll();

            int sco = first + (second * 2);
            queue.add(sco);
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 9, 10, 12};
        System.out.println(solution(a, 7));
    }

    public static int solution2(int[] scoville, int K) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < scoville.length; i++) {
            queue.add(scoville[i]);
        }

        int cnt = 0;
        while (!isAll(queue, K)) {
            if (queue.size() == 1) {
                cnt = -1;
                break;
            }
            int one = (int) queue.poll();
            int two = (int) queue.poll();

            int spicy = calcu(one, two);
            queue.add(spicy);
            cnt++;

            for (Integer integer : queue) {
                System.out.print(integer + " ");
            }
        }
        return cnt;
    }

    public static int calcu(int a, int b) {
        int ans = 0;
        ans = a + (b * 2);
        return ans;
    }

    public static boolean isAll(PriorityQueue<Integer> sc, int k) {

        int cnt = (int) sc.peek();
        if (cnt >= k) {
            return true;
        } else {
            return false;
        }
    }
}
