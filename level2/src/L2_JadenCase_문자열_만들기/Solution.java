package L2_JadenCase_문자열_만들기;

import java.util.StringTokenizer;

public class Solution {
    public static String solution(String s) {
        StringTokenizer st = new StringTokenizer(s, " ", true);

        StringBuilder sb = new StringBuilder();
        while (st.hasMoreTokens()) {
            String token = st.nextToken().toLowerCase();
            char[] cs = token.toCharArray();
            cs[0] = String.valueOf(cs[0]).toUpperCase().charAt(0);
            token = String.valueOf(cs);
            sb.append(token);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("3people unFollowed me"));
    }
}
