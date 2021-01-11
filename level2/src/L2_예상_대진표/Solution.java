package L2_예상_대진표;

public class Solution {
    public static int solution(int n, int a, int b) {
        int answer = 0;

        for (int i = 0; i < n; i++) {
            a = (a - 1) / 2 + 1;
            b = (b - 1) / 2 + 1;
            answer++;
            if (a == b)
                break;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(8, 4, 7));
    }
}
