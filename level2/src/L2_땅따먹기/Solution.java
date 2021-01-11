package L2_땅따먹기;

import java.util.Arrays;

public class Solution {
    public static int solution(int[][] land) {
        for (int i = 1; i < land.length; i++) {
            for (int j = 0; j < land[0].length; j++) {
                int sum = 0;
                for (int k = 0; k < land[0].length; k++) {
                    if (k == j)
                        continue;
                    else
                        sum = Math.max(sum, land[i - 1][k]);
                }
                land[i][j] += sum;
            }
        }

        Arrays.sort(land[land.length - 1]);
        return land[land.length - 1][land[0].length - 1];
    }

    public static int solution2(int[][] land) {
        int answer = 0;

        int[][] dp = new int[land.length][4];
        dp[0][0] = land[0][0];
        dp[0][1] = land[0][1];
        dp[0][2] = land[0][2];
        dp[0][3] = land[0][3];

        for (int i = 1; i < land.length; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    if (j == k)
                        continue;
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][k] + land[i][j]);
                }
            }
        }

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + "\t");
            }
            System.out.println();
        }

        int max = dp[land.length - 1][0];
        for (int i = 1; i < 4; i++) {
            answer = Math.max(max, dp[land.length - 1][i]);
        }

        return answer;
    }

    public static void dfs(int[][] land, int k, int n) {
        if (k == n) {
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (i == k)
                continue;
//            if(dp[k][i] = land[k][i]){
//
//            }
        }
    }

    public static void main(String[] args) {
        int[][] land = {
                {1, 2, 3, 5},
                {5, 6, 7, 8},
                {4, 3, 2, 1}
        };
        System.out.println(solution2(land));
    }
}
