package P_카카오_인턴_키패드_누르기;

public class Solution {
    public static String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        int left = 10;
        int right = 12;

        for (int number : numbers) {
            if (number == 1 || number == 4 || number == 7) {
                left = number;
                sb.append("L");
            } else if (number == 3 || number == 6 || number == 9) {
                right = number;
                sb.append("R");
            } else {
                if (getLength(number, left) < getLength(number, right)) {
                    left = number;
                    sb.append("L");
                } else if (getLength(number, left) > getLength(number, right)) {
                    right = number;
                    sb.append("R");
                } else {
                    if (hand.equals("left")) {
                        left = number;
                        sb.append("L");
                    } else {
                        right = number;
                        sb.append("R");
                    }
                }
            }
            System.out.println("left, right = " + left + ", " + right);

        }

        return sb.toString();
    }

    public static int getLength(int number, int n) {
        if (number == 0)
            number = 11;

        if (n == 0)
            n = 11;

        int xt = (number - 1) / 3;
        int yt = (number - 1) % 3;

        int x = (n - 1) / 3;
        int y = (n - 1) % 3;

        return Math.abs(xt - x) + Math.abs(yt - y);
    }

    public static void main(String[] args) {
        int[] a = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        System.out.println(solution(a, "left"));
    }
}
