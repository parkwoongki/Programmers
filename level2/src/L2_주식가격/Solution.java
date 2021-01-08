package L2_주식가격;

public class Solution {
    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] <= prices[j])
                    answer[i]++;
                else if (prices[i] > prices[j]) {
                    answer[i]++;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 3};
        a = solution(a);

        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
