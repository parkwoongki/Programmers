package P_같은_숫자는_싫어;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class Solution2 {
    public static int[] solution(int[] arr) {
        int[] answer = {};

        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if(!(stack.peek() == arr[i])){
                stack.push(arr[i]);
            }
        }

        answer = stack.stream().mapToInt(i -> i).toArray();

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        arr = solution(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
