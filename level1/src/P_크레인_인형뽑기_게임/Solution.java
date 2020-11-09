package P_크레인_인형뽑기_게임;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    /*
        [[0,0,0,0,0],
         [0,0,1,0,3],
         [0,2,5,0,1],
         [4,2,4,4,2],
         [3,5,1,3,1]]

         [1,5,3,5,1,2,1,4]
    */
    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Integer> basket = new ArrayList<>();

        for (int i = 0; i < moves.length; i++) {
            int tmp = 0;
            int location = moves[i] - 1;

            for (int j = 0; j < board.length; j++) {
                if (board[j][location] != 0) {
                    tmp = board[j][location];
                    board[j][location] = 0;
                    break;
                }
            }

            if (tmp != 0) {
                if ((basket.size() >= 1) && (basket.get(basket.size() - 1) == tmp)) {
                    basket.remove(basket.size() - 1);
                    answer += 2;
                } else
                    basket.add(tmp);
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {

        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};

        System.out.println("solution() = " + solution(board, moves));

    }
}
