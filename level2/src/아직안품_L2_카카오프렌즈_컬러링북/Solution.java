package 아직안품_L2_카카오프렌즈_컬러링북;

public class Solution {
    public static int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;

        int[] result = new int[m * n];

        

        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }

    public static void main(String[] args) {
        int[][] picture = {
                {1, 1, 1, 0},
                {1, 2, 2, 0},
                {1, 0, 0, 1},
                {0, 0, 0, 1},
                {0, 0, 0, 3},
                {0, 0, 0, 3}
        };

        int[] a = solution(6, 4, picture);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
