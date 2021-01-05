package P_이상한_문자_만들기;

import java.util.StringTokenizer;

public class Solution {
    public static String solution(String s) {
        StringTokenizer st = new StringTokenizer(s, " ", true);
        StringBuilder sb = new StringBuilder();

        while (st.hasMoreTokens()) {
            String word = st.nextToken();

            char[] cs = word.toCharArray();
            for (int j = 0; j < cs.length; j++) {
                if (j % 2 == 0)
                    cs[j] = String.valueOf(cs[j]).toUpperCase().charAt(0);
                else
                    cs[j] = String.valueOf(cs[j]).toLowerCase().charAt(0);
            }

            sb.append(String.valueOf(cs));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("Hello    eVeryone"));
    }
}
