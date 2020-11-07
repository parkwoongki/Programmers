package P_3진법_뒤집기;

public class Solution2 {
    public static int solution(int n) {
        int answer = 0;

        String s = "";
        while (n != 0) {
            s = (n % 3) + s;
            n /= 3;
        }

        for (int i = 0; i < s.length(); i++) {
            answer += Integer.parseInt(String.valueOf(s.charAt(i))) * Math.pow(3, i);
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(10000000));
    }
}
