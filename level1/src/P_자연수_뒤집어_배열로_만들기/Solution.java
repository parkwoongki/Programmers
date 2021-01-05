package P_자연수_뒤집어_배열로_만들기;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static int[] solution(long n) {
        List<Integer> list = new ArrayList<>();

        do {
            list.add((int) (n % 10));
            n /= 10;
        } while (n != 0);

        return list.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] arr = solution(12345);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
