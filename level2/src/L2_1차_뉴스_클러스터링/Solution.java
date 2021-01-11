package L2_1차_뉴스_클러스터링;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static int solution(String str2, String str1) {
        List<String> intersection = new ArrayList<>();
        List<String> union = new ArrayList<>();

        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();

        for (int i = 1; i < str2.length(); i++) {
            if (str2.charAt(i - 1) >= 65 && str2.charAt(i - 1) <= 90 && str2.charAt(i) >= 65 && str2.charAt(i) <= 90) {
                union.add(str2.substring(i - 1, i + 1));
                intersection.add(str2.substring(i - 1, i + 1));
            }
        }

        int interCount = 0;
        int unionCount = union.size();
        for (int i = 1; i < str1.length(); i++) {
            String s = str1.substring(i - 1, i + 1);
            if (str1.charAt(i - 1) >= 65 && str1.charAt(i - 1) <= 90 && str1.charAt(i) >= 65 && str1.charAt(i) <= 90) {
                if (union.contains(s)) {
                    union.remove(s);
                } else {
                    unionCount++;
                }
                if (intersection.contains(s)) {
                    interCount++;
                    intersection.remove(s);
                }
            }
        }

        if (interCount == 0 && unionCount == 0)
            return 65536;
        else
            return (int) (65536.0 * (double) interCount / (double) unionCount);
    }

    public static void main(String[] args) {
        String str1 = "aa1+aa2";
        String str2 = "AAAA12";
        System.out.println(solution(str1, str2));
    }
}
