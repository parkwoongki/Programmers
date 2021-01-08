package L2_큰_수_만들기;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
    public static String solution3(String number, int k) {
        int index = 0;
        char max;
        StringBuilder sb = new StringBuilder();

        // 1924 2
        if (number.charAt(0) == '0')
            return "0";
        for (int i = 0; i < number.length() - k; i++) {
            max = '0';
            for (int j = index; j <= k + i; j++) {
                if (max < number.charAt(j)) {
                    max = number.charAt(j);
                    index = j + 1;
                }
            }
            sb.append(max);
        }

        return sb.toString();
    }

    public static String solution2(String number, int k) {
        int size = number.length() - k;
        int index = 0;
        String before = number.substring(0, size);

        for (int i = 1; i <= k; i++) {
            String current = number.substring(i, i + size);
            if (before.compareTo(current) < 0) {
                before = current;
                index = i;
            }
        }

        int count = k - index;
        System.out.println(k - index);
        String s = number.substring(index);
        StringBuilder sb = new StringBuilder();
        System.out.println(s + " asd");
        int max = s.charAt(0);
        sb.append(max);
        for (int i = 2; i < s.length(); i++) {
            if (max < s.charAt(i)) {

            }
        }

        return sb.toString();
    }

    public static int solution(int N) {
        String s = Integer.toBinaryString(N);
        StringTokenizer st = new StringTokenizer(s, "1");

        int answer = 0;
        int size = st.countTokens();
        if (N % 2 == 0)
            size -= 1;

        for (int i = 0; i < size; i++) {
            String t = st.nextToken();
            if (answer < t.length()) {
                answer = t.length();
            }
        }

        return answer;
    }

    public static void main(String[] args) {
//        System.out.println(solution2("4177252841", 6));
        System.out.println(solution(32));
    }
}
