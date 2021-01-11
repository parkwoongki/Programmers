package L2_이진_변환_반복하기;

public class Solution {
    public static int[] solution(String s) {
        int[] answer = new int[2];

        while (true) {
            answer[1] += s.replace("1", "").length();
            s = s.replace("0", "");
            s = Integer.toBinaryString(s.length());
            answer[0]++;
            if (s.equals("1")) {
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String s = "110010101001";
        int[] a = solution(s);

        for (int i : a) {
            System.out.println(i + " ");
        }
    }
}
