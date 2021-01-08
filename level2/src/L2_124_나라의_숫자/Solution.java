package L2_124_나라의_숫자;

public class Solution {
    public static String solution(int n) {

        /**
         1  1
         2  2
         3  4
         4  11
         5  12
         6  14
         7  21
         8  22
         9  24
         10 41
         */

        StringBuilder answer = new StringBuilder();

        do {
            int t = n % 3;
            if (t == 0) {
                t = 4;
                n -= 3;
            }

            answer.insert(0, t);
            n /= 3;

        } while (n != 0);

        return answer.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution(3));
    }
}
