package L2_다음_큰_숫자;

public class Solution {
    public static int solution(int n) {
        int answer = n + 1;

        int count = Integer.bitCount(n);
        while (true) {
            int comp = Integer.bitCount(answer);

            if (count == comp)
                break;

            answer++;
        }

        return answer;
    }

    public static int solution2(int n) {
        int answer = n + 1;

        String s = Integer.toBinaryString(n).replace("0", "");
        for (int i = 0; i <= 1000000; i++) {
            String comp = Integer.toBinaryString(answer).replace("0", "");

            if (s.length() == comp.length())
                break;

            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(15));
    }
}
