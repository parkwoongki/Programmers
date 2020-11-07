package P_3진법_뒤집기;

public class Solution {
    public static int solution(int n) {
        int answer = 0;

        int i = 0;
        int t = n;
        while (true) {
            t /= 3;
            i++;
            if (t < 3)
                break;
        }

        System.out.println("i = " + i);

        String s = "";
        while (true) {
//            s = n % 3 + s;
            answer += (n % 3) * Math.pow(3, i);
            i--;

            n /= 3;
            if (n < 3) {
//                s = 1 + s;
                answer += 1 * Math.pow(3, i);
                break;
            }
        }

//        System.out.println("answer = " + answer);

//        for (int i = 0; i < s.length(); i++) {
//            answer += Integer.parseInt(String.valueOf(s.charAt(i))) * Math.pow(3, i);
//        }

        return answer;
    }

    public static void main(String[] args) {
        solution(45);
    }
}
