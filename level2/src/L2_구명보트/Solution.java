package L2_구명보트;

import java.util.Arrays;

public class Solution {
    public static int solution(int[] people, int limit) {
        Arrays.sort(people);

        int answer = 0;
        int last = people.length - 1;
        int start = 0;
        while (true) { //10 20 30 50 70 80
            if (people[start] + people[last] <= limit)
                start++;
            answer++;
            last--;

            if (start == last) {
                answer++;
                break;
            }

            if (start > last)
                break;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] a = {70, 50, 80, 10, 20, 10};
        System.out.println(solution(a, 100));
    }
}
