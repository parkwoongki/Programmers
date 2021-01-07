package P_콜라츠_추측;

public class Solution {
    public static int solution(int num) {
        int answer = 0;
        long n = num;

        while (true) {
            if (n == 1)
                break;

            if (n % 2 == 0)
                n /= 2;
            else
                n = n * 3 + 1;
            answer++;

            if (answer == 500)
                return -1;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(1));
    }
}
