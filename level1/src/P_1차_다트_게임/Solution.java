package P_1차_다트_게임;

import java.util.StringTokenizer;

public class Solution {

    public static int solution(String dartResult) {
        String s = dartResult;
        StringTokenizer st = new StringTokenizer(s, "SDT*#", true);

        int sum = 0;
        int before = 0;
        int current = Integer.parseInt(st.nextToken());
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            char c = token.charAt(0);
            if (c == 'S') {
                current = getSDTScore(1, current);
                sum += current;
            } else if (c == 'D') {
                current = getSDTScore(2, current);
                sum += current;
            } else if (c == 'T') {
                current = getSDTScore(3, current);
                sum += current;
            } else if (c == '*') {
                sum -= (current + before);
                current *= 2;
                before *= 2;
                sum += (current + before);
            } else if (c == '#') {
                sum -= current;
                current *= -1;
                sum += current;
            } else {
                before = current;
                current = Integer.parseInt(token);
            }
        }

        return sum;
    }

    public static int getSDTScore(int time, int score) {
        int result = 1;

        for (int i = 0; i < time; i++) {
            result *= score;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("답 : " + solution("1S*2T*3S"));
    }
}
