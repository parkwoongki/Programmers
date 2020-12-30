package P_문자열_내_마음대로_정렬하기;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public static String[] solution(String[] strings, int n) {
        String[] answer = {};

//        Arrays.sort(strings);
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.charAt(n) == o2.charAt(n))
                    return o1.compareTo(o2);
                else
                    return o1.charAt(n) - o2.charAt(n);
            }
        });

        return strings;
    }

    public static void main(String[] args) {
        String[] strings = {"abce", "abcd", "cdx"};
        strings = solution(strings, 2);
        for (String string : strings) {
            System.out.print(string + " ");
        }
    }
}
