package 나중에풀자_L2_카카오_인턴_수식_최대화;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {
    public static long solution(String expression) {
        long answer = 0;
        StringTokenizer st = new StringTokenizer(expression, "*+-", true);
        int size = st.countTokens();
        int[] op = new int[size];

        List<String> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            String tmp = st.nextToken();
            list.add(tmp);
            op[i] = Integer.parseInt(tmp);
        }



        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("100-200*300-500+20"));
    }
}
