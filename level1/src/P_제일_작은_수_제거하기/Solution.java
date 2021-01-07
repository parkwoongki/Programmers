package P_제일_작은_수_제거하기;

import java.util.Arrays;

public class Solution {
    public static int[] solution(int[] arr) {
        int[] tmp = {-1};
        if (arr.length == 1)
            return tmp;

        tmp = Arrays.copyOf(arr, arr.length);
        Arrays.sort(tmp);
        int min = tmp[0];

        tmp = new int[arr.length - 1];
        int index = 0;
        for (int j : arr) {
            if (j != min) {
                tmp[index++] = j;
            }
        }

        return tmp;
    }

    public static void main(String[] args) {
        int[] a = {4, 3, 2, 1};
        int[] b = solution(a);

        for (int i : b) {
            System.out.print(i + " ");
        }

    }
}
