package P_체육복;

public class Solution2 {
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        answer += lost.length;

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    answer--;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j] - 1) {
                    answer--;
                    reserve[j] = -1;
                    break;
                } else if (lost[i] == reserve[j] + 1) {
                    answer--;
                    reserve[j] = -1;
                    break;
                }
            }

            if (answer == 0)
                break;
        }

        return n - answer;
    }

    public static void main(String[] args) {
        int[] lost = {2, 4};
        int[] reverse = {1, 3, 5};
        System.out.println(solution(5, lost, reverse));
    }
}
