package L2_가장_큰_수;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public static String solution(int[] numbers) {
        String answer = "";
        String[] arr = new String[numbers.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }

//        arr = new String[]{"3", "30", "34", "5", "9"};
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
//                System.out.println(o2 + " " + o1 + " " + o2.compareTo(o1));
                return (o2 + o1).compareTo(o1 + o2);
            }
        });

        if (arr[0].equals("0"))
            return "0";

        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            System.out.print(s + " ");
            sb.append(s);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        int[] a = {3, 30, 34, 5, 9};
        System.out.println(solution(a));
    }
}
