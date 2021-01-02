package P_문자열_내림차순으로_배치하기;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public static String solution(String s) {
        // 내 코드
//        String answer = "";
//
//        char[] chars = s.toCharArray();
//        Arrays.sort(chars);
//
//        System.out.println(new String(chars));
//
//        StringBuilder u = new StringBuilder();
//        StringBuilder r = new StringBuilder();
//
//        for (char c : chars) {
//            if (String.valueOf(c).equals(String.valueOf(c).toUpperCase())) {
//                u.insert(0, c);
//            } else
//                r.insert(0, c);
//        }
//
//        return r.append(u).toString();

        // 다른 코드
        String answer = "";

        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        return new StringBuilder(new String(chars)).reverse().toString();

    }

    public static void main(String[] args) {
        System.out.println("solution(\"Zbcdefg\") = " + solution("Zbcdefg"));
    }
}
