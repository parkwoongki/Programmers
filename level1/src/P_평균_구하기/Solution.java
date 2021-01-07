package P_평균_구하기;

public class Solution {
    public static double solution(int[] arr) {
        double answer = 0;

        for (int i : arr) {
            answer += i;
        }

        return answer / arr.length;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        System.out.println(solution(a));
    }
}
