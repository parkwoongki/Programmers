package L2_카펫;

public class Solution {
    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        for (int i = 1; i <= yellow; i++) {
            if (yellow % i != 0)
                continue;
            int countBrown = ((i + 2) * 2) + ((yellow / i) * 2);
            if (countBrown == brown) {
                answer[0] = yellow / i + 2;
                answer[1] = i + 2;
                break;
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        int[] a = solution(8, 1);
        for (int i : a) {
            System.out.println(i + " ");
        }
    }
}
