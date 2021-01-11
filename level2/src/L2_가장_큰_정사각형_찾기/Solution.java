package L2_가장_큰_정사각형_찾기;

public class Solution {
    public static int solution(int[][] board) {
        int h = board.length;
        int w = board[0].length;
        int max = Integer.MIN_VALUE;

        if (h < 2 || w < 2) {
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (board[i][j] == 1) {
                        max = 1;
                        break;
                    }
                }
            }
        } else {
            for (int i = 1; i < h; i++) {
                for (int j = 1; j < w; j++) {
                    if (board[i][j] == 1) {
                        board[i][j] = Math.min(board[i - 1][j - 1], Math.min(board[i - 1][j], board[i][j - 1])) + 1;
                        if (max < board[i][j])
                            max = board[i][j];
                    }
                }
            }
        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        return max * max;
    }

    public static void main(String[] args) {
        int[][] board = {
                {0, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 1, 0}
        };
        System.out.println(solution(board));
    }
}
