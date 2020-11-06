package P_2016년;

public class Solution {
    public static String solution(int a, int b) {
        String answer = "";
        int[] 월별_마지막_일자 = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] 요일 = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};

        int day = 0;
        for (int i = 1; i < a; i++) {
            day += 월별_마지막_일자[i];
        }

        day += b;
        answer = 요일[day % 요일.length];

        return answer;
    }

    public static void main(String[] args) {
        System.out.println("solution() = " + solution(12, 6));
    }
}
